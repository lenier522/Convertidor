package convertir;

public class ConversorPresion {
    public static double convertir(String desde, String a, double valor) {
        // Conversión entre Pascales (Pa), kilopascales (kPa), atmósferas (atm), bares (bar) y milímetros de mercurio (mmHg)
        if (desde.equals("Pa")) {
            if (a.equals("kPa")) return valor / 1000;
            if (a.equals("atm")) return valor / 101325;
            if (a.equals("bar")) return valor / 100000;
            if (a.equals("mmHg")) return valor * 0.00750062;
        } else if (desde.equals("kPa")) {
            if (a.equals("Pa")) return valor * 1000;
        } else if (desde.equals("atm")) {
            if (a.equals("Pa")) return valor * 101325;
        } else if (desde.equals("bar")) {
            if (a.equals("Pa")) return valor * 100000;
        } else if (desde.equals("mmHg")) {
            if (a.equals("Pa")) return valor / 0.00750062;
        }
        throw new IllegalArgumentException("Conversión de presión no soportada para las unidades indicadas");
    }
}
