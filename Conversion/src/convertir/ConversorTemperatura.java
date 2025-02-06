package convertir;

public class ConversorTemperatura {
    public static double convertir(String desde, String a, double valor) {
        // Conversión entre Celsius (C), Fahrenheit (F) y Kelvin (K)
        if (desde.equals("C")) {
            if (a.equals("F")) return (valor * 9/5) + 32;
            if (a.equals("K")) return valor + 273.15;
        } else if (desde.equals("F")) {
            if (a.equals("C")) return (valor - 32) * 5/9;
            if (a.equals("K")) return ((valor - 32) * 5/9) + 273.15;
        } else if (desde.equals("K")) {
            if (a.equals("C")) return valor - 273.15;
            if (a.equals("F")) return ((valor - 273.15) * 9/5) + 32;
        }
        throw new IllegalArgumentException("Conversión de temperatura no soportada para las unidades indicadas");
    }
}
