package convertir;

public class ConversorTiempo {
    public static double convertir(String desde, String a, double valor) {
        // Conversión entre segundos (s), minutos (min), horas (h) y días (d)
        if (desde.equals("s")) {
            if (a.equals("min")) return valor / 60;
            if (a.equals("h")) return valor / 3600;
            if (a.equals("d")) return valor / 86400;
        } else if (desde.equals("min")) {
            if (a.equals("s")) return valor * 60;
            if (a.equals("h")) return valor / 60;
            if (a.equals("d")) return valor / 1440;
        } else if (desde.equals("h")) {
            if (a.equals("s")) return valor * 3600;
            if (a.equals("min")) return valor * 60;
            if (a.equals("d")) return valor / 24;
        } else if (desde.equals("d")) {
            if (a.equals("s")) return valor * 86400;
            if (a.equals("h")) return valor * 24;
        }
        throw new IllegalArgumentException("Conversión de tiempo no soportada para las unidades indicadas");
    }
}
