package com.S302N2;
import java.util.Calendar;
public class CreditCardPayment implements PaymentCallback {
    private String cardNumber = "1234567812345678";
    private String expiryDate = "12/28";

    @Override
    public void pay(double amount) {
        if (cardNumberIsValid() && expiryDateIsInFuture()) {
            processCreditCardPayment(amount);
        } else {
            System.out.println("La autorización de la tarjeta de crédito falló.");
        }
    }

    private boolean cardNumberIsValid() {
        // Un número de tarjeta de crédito válido para este ejemplo debe tener exactamente 16 dígitos.
        return cardNumber.length() == 16;
    }

    private boolean expiryDateIsInFuture() {
        // Comprobamos si la fecha de caducidad de la tarjeta está en el futuro.
        String[] dateParts = expiryDate.split("/");
        int expiryYear = Integer.parseInt(dateParts[1]);
        int expiryMonth = Integer.parseInt(dateParts[0]);

        // Obtén el año y mes actuales.
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR) % 100; // obtener los dos últimos dígitos del año actual
        int currentMonth = now.get(Calendar.MONTH) + 1; // en Java, enero es el mes 0

        // Si el año de caducidad es mayor que el año actual, la tarjeta es válida
        if (expiryYear > currentYear) {
            return true;
        }

        // Si el año de caducidad es el mismo que el año actual pero el mes de caducidad es posterior, la tarjeta es válida
        if (expiryYear == currentYear && expiryMonth > currentMonth) {
            return true;
        }

        return false;
    }

    private void processCreditCardPayment(double amount) {
        System.out.println("Se han pagado " + amount + " con tarjeta de crédito.");
    }
}
