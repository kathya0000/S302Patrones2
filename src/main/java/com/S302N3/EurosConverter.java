package com.S302N3;

public class EurosConverter implements CurrencyConverter {
    private double rate;
    private String currencySymbol = "€";

    public EurosConverter(double rate) {
        this.rate = rate;
    }

    @Override
    public double convert(double price) {
        return price * rate;
    }
    @Override
    public String getCurrencySymbol() {
        return currencySymbol;
    }
}