package org.neoa.ch01;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

import static org.neoa.ch01.PlayType.COMEDY;

public class Bill {

    public String statement (Invoice invoice, Map<String, Play> plays) {
        double totalAmount = 0;
        int volumeCredits = 0;
        String result = "Statement for " + invoice.getCustomer() + "\n";

        Locale locale = new Locale("en", "US");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        format.setMinimumFractionDigits(2);

        for (Performance performance: invoice.getPerformances()) {

            double thisAmount = amountFor(performance, playFor(performance, plays));

            volumeCredits += Math.max(performance.getAudience() - 30, 0);
            if (COMEDY == playFor(performance, plays).getType()) volumeCredits += Math.floor(performance.getAudience() / 5);

            result += " " + playFor(performance, plays).getName() +": " + format.format(thisAmount/100) + " " + performance.getAudience() + " seats\n";
            totalAmount += thisAmount;
        }
        result += "Amount owed is " + format.format(totalAmount/100) + "\n";
        result += "You earned " + volumeCredits +" credits\n";
        return result;
    }

    private double amountFor(Performance performance, Play play) {
        double result = 0;
        switch (play.getType()) {
            case TRAGEDY:
                result = 40000;
                if (performance.getAudience() > 30) {
                    result += 1000 * (performance.getAudience() - 30);
                }
                break;

            case COMEDY:
                result = 30000;
                if (performance.getAudience() > 20) {
                    result += 10000 + 500 * (performance.getAudience() - 20);
                }
                result += 300 * performance.getAudience();
                break;
            default:
                throw new RuntimeException("unknown type " + play.getType());
        }
        return result;
    }

    private Play playFor(Performance performance, Map<String, Play> plays) {
        return plays.get(performance.getPlayID());
    }

}
