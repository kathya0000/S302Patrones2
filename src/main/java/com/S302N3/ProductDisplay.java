package com.S302N3;

public class ProductDisplay {
    private CurrencyConverter converter;

    public ProductDisplay(CurrencyConverter converter) {
        this.converter = converter;
    }

    public void displayProductPrice(Product product) {
        double localPrice = converter.convert(product.getPrice());
        System.out.println("El precio de " + product.getName() + " es: " + localPrice + " " + converter.getCurrencySymbol());
    }
}

