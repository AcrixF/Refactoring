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
            Play play = plays.get(performance.getPlayID());
            double thisAmount = 0;

            switch (play.getType()) {
                case TRAGEDY:
                    thisAmount = 40000;
                    if (performance.getAudience() > 30) {
                        thisAmount += 1000 * (performance.getAudience() - 30);
                    }
                    break;

                case COMEDY:
                    thisAmount = 30000;
                    if (performance.getAudience() > 20) {
                        thisAmount += 10000 + 500 * (performance.getAudience() - 20);
                    }
                    thisAmount += 300 * performance.getAudience();
                    break;
                default:
                    throw new RuntimeException("unknown type " + play.getType());
            }
            volumeCredits += Math.max(performance.getAudience() - 30, 0);
            if (COMEDY == play.getType()) volumeCredits += Math.floor(performance.getAudience() / 5);

            result += " " + play.getName() +": " + format.format(thisAmount/100) + " " + performance.getAudience() + " seats\n";
            totalAmount += thisAmount;
        }
        result += "Amount owed is " + format.format(totalAmount/100) + "\n";
        result += "You earned " + volumeCredits +" credits\n";
        return result;
    }

}
