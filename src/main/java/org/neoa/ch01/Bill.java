package org.neoa.ch01;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import static org.neoa.ch01.PlayType.COMEDY;

public class Bill {

    public String statement (Invoice invoice, Map<String, Play> plays) {

        PerformanceEnricher performanceEnricher = new PerformanceEnricher();

        StatementData statementData = new StatementData()
                .setCustomer(invoice.getCustomer())
                .setPerformances(invoice.getPerformances().stream().map(p -> performanceEnricher.enrichPerformance(p, plays)).collect(Collectors.toList()));

        return renderPlainText(statementData, plays);
    }


    private Play playFor(Performance performance, Map<String, Play> plays) {
        return plays.get(performance.getPlayID());
    }

    private String renderPlainText (StatementData data, Map<String, Play> plays) {
        String result = "Statement for " + data.getCustomer() + "\n";

        for (Performance performance: data.getPerformances()) {
            result += " " + playFor(performance, plays).getName() + ": " + usd(amountFor(performance, plays)) + " " + performance.getAudience() + " seats\n";
        }

        result += "Amount owed is " + usd(totalAmount(data, plays)) + "\n";
        result += "You earned " + totalVolumeCredits(data, plays) + " credits\n";
        return result;
    }
    private double totalAmount(StatementData data, Map<String, Play> plays) {
        double result = 0;
        for (Performance performance: data.getPerformances()) {
            result += amountFor(performance, plays);
        }
        return result;
    }
    private int totalVolumeCredits(StatementData data, Map<String, Play> plays) {
        int result = 0;
        for (Performance performance: data.getPerformances()) {
            result += volumeCreditsFor(plays, performance);
        }
        return result;
    }
    private String usd(double number) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        currencyInstance.setMinimumFractionDigits(2);
        return currencyInstance.format(number / 100);
    }
    private int volumeCreditsFor(Map<String, Play> plays, Performance performance) {
        int result = 0;
        result += Math.max(performance.getAudience() - 30, 0);
        if (COMEDY == playFor(performance, plays).getType()) result += Math.floor(performance.getAudience() / 5);
        return result;
    }
    private double amountFor(Performance performance, Map<String, Play> plays) {
        double result = 0;
        switch (playFor(performance, plays).getType()) {
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
                throw new RuntimeException("unknown type " + playFor(performance, plays));
        }
        return result;
    }


    class PerformanceEnricher {

        public Performance enrichPerformance(Performance performance, Map<String, Play> plays) {
            EnrichPerformance enrichPerformance = new EnrichPerformance();
            enrichPerformance.setAudience(performance.getAudience());
            enrichPerformance.setPlayID(performance.getPlayID());
            enrichPerformance.setPlay(playFor(performance, plays));
            return enrichPerformance;
        }

    }


}
