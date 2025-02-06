package convertir;

public class ConversorVelocidad {
    public static double convertir(String desde, String a, double valor) {
        // Conversión entre km/h, m/s, mph (millas por hora) y ft/s (pies por segundo)
        if (desde.equals("km/h")) {
            if (a.equals("m/s")) return valor / 3.6;
            if (a.equals("mph")) return valor * 0.621371;
            if (a.equals("ft/s")) return valor * 0.911344;
        } else if (desde.equals("m/s")) {
            if (a.equals("km/h")) return valor * 3.6;
            if (a.equals("mph")) return valor * 2.23694;
        } else if (desde.equals("mph")) {
            if (a.equals("km/h")) return valor / 0.621371;
        }
        throw new IllegalArgumentException("Conversión de velocidad no soportada para las unidades indicadas");
    }
}
