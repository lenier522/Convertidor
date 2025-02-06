package convertir;

public class ConversorLongitud {
    public static double convertir(String desde, String a, double valor) {
        // Conversión de metros (m), kilómetros (km), centímetros (cm), milímetros (mm), millas (mi), yardas (yd) y pies (ft)
        if (desde.equals("m")) {
            if (a.equals("km")) return valor / 1000;
            if (a.equals("cm")) return valor * 100;
            if (a.equals("mm")) return valor * 1000;
            if (a.equals("mi")) return valor / 1609.34;
            if (a.equals("yd")) return valor * 1.09361;
            if (a.equals("ft")) return valor * 3.28084;
        } else if (desde.equals("km")) {
            if (a.equals("m")) return valor * 1000;
            if (a.equals("mi")) return valor / 1.60934;
            if (a.equals("cm")) return valor * 100000;
        } else if (desde.equals("cm")) {
            if (a.equals("m")) return valor / 100;
            if (a.equals("mm")) return valor * 10;
        } else if (desde.equals("mm")) {
            if (a.equals("m")) return valor / 1000;
            if (a.equals("cm")) return valor / 10;
        } else if (desde.equals("mi")) {
            if (a.equals("km")) return valor * 1.60934;
            if (a.equals("m")) return valor * 1609.34;
        }
        throw new IllegalArgumentException("Conversión de longitud no soportada para las unidades indicadas");
    }
}
