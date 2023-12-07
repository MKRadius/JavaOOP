package com.example.model;

import java.util.HashMap;

public class Converter {
    private HashMap<String, Double> rates = new HashMap<String, Double>();

    public Converter() {
        rates.put("USD", 1.0);
        rates.put("EUR", 0.85);
        rates.put("GBP", 0.75);
        rates.put("CAD", 1.2);
        rates.put("AUD", 1.3);
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        double rate = rates.get(toCurrency) / rates.get(fromCurrency);
        return amount * rate;
    }

    public String[] getCurrencyCodes() {
        return rates.keySet().toArray(new String[0]);
    }

    public double getRate(String currencyCode) {
        return rates.get(currencyCode);
    }
}
