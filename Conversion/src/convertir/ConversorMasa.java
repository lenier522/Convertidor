package convertir;

public class ConversorMasa {
    public static double convertir(String desde, String a, double valor) {
        // Conversión entre kilogramos (kg), gramos (g), miligramos (mg), libras (lb) y onzas (oz)
        if (desde.equals("kg")) {
            if (a.equals("g")) return valor * 1000;
            if (a.equals("mg")) return valor * 1_000_000;
            if (a.equals("lb")) return valor * 2.20462;
            if (a.equals("oz")) return valor * 35.274;
        } else if (desde.equals("g")) {
            if (a.equals("kg")) return valor / 1000;
            if (a.equals("mg")) return valor * 1000;
        } else if (desde.equals("lb")) {
            if (a.equals("kg")) return valor / 2.20462;
            if (a.equals("g")) return valor * 453.592;
        }
        throw new IllegalArgumentException("Conversión de masa no soportada para las unidades indicadas");
    }
}
