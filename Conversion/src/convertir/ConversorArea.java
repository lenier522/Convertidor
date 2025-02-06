package convertir;

public class ConversorArea {
    public static double convertir(String desde, String a, double valor) {
        // Conversión entre metros cuadrados (m2), kilómetros cuadrados (km2), pies cuadrados (ft2), acres (ac) y hectáreas (ha)
        if (desde.equals("m2")) {
            if (a.equals("km2")) return valor / 1_000_000;
            if (a.equals("ft2")) return valor * 10.7639;
            if (a.equals("ac")) return valor / 4046.86;
            if (a.equals("ha")) return valor / 10000;
        } else if (desde.equals("km2")) {
            if (a.equals("m2")) return valor * 1_000_000;
        } else if (desde.equals("ft2")) {
            if (a.equals("m2")) return valor / 10.7639;
        } else if (desde.equals("ac")) {
            if (a.equals("m2")) return valor * 4046.86;
        } else if (desde.equals("ha")) {
            if (a.equals("m2")) return valor * 10000;
        }
        throw new IllegalArgumentException("Conversión de área no soportada para las unidades indicadas");
    }
}
