package com.S302N2;

      public class App {

          public static void main(String[] args) {
              ShoeStore store = new ShoeStore();

              // Compra zapatos utilizando diferentes métodos de pago.
              store.purchaseShoes(100.0, new CreditCardPayment());
              store.purchaseShoes(200.0, new PaypalPayment());
              store.purchaseShoes(300.0, new BankDebtPayment());
          }
      }
