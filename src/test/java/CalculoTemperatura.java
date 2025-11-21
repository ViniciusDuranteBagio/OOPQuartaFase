package org.example;

public class CalculoTemperatura {

    public static double celsiusParaFahrenheit(double c) {
        return (c * 9.0/5.0) + 32;
    }

    public static double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5.0/9.0;
    }

    public static double transformarFahrenheitEmCelcius(double f) {
        return fahrenheitParaCelsius(f);
    }
}
