package convertir;

public class ConversorVolumen {
    public static double convertir(String desde, String a, double valor) {
        // Conversión entre litros (l), mililitros (ml), galones (gal) y pies cúbicos (ft3)
        if (desde.equals("l")) {
            if (a.equals("ml")) return valor * 1000;
            if (a.equals("gal")) return valor * 0.264172;
            if (a.equals("ft3")) return valor * 35.3147;
        } else if (desde.equals("ml")) {
            if (a.equals("l")) return valor / 1000;
        } else if (desde.equals("gal")) {
            if (a.equals("l")) return valor / 0.264172;
        } else if (desde.equals("ft3")) {
            if (a.equals("l")) return valor / 35.3147;
        }
        throw new IllegalArgumentException("Conversión de volumen no soportada para las unidades indicadas");
    }
}
