package com.S302N3;

           public class App {


                   public static void main(String[] args) {
                       // Crear productos
                       Product product1 = new Product("Televisor", 100.00);
                       Product product2 = new Product("PC", 200.00);

                       // Crear convertidores de moneda
                       CurrencyConverter eurosConverter = new EurosConverter(0.85);
                       CurrencyConverter dollarsConverter = new DollarsConverter(1.12);

                       // Crear visualizadores de productos
                       ProductDisplay eurosDisplay = new ProductDisplay(eurosConverter);
                       ProductDisplay dollarsDisplay = new ProductDisplay(dollarsConverter);

                       // Mostrar precios en Euros
                       eurosDisplay.displayProductPrice(product1);
                       eurosDisplay.displayProductPrice(product2);

                       // Mostrar precios en Dólares
                       dollarsDisplay.displayProductPrice(product1);
                       dollarsDisplay.displayProductPrice(product2);
                   }


           }
