package convertir;

public class ConversorEnergia {
    public static double convertir(String desde, String a, double valor) {
        // Conversión entre Julios (J), kilojulios (kJ), calorías (cal), kilocalorías (kcal) y vatios-hora (Wh)
        if (desde.equals("J")) {
            if (a.equals("kJ")) return valor / 1000;
            if (a.equals("cal")) return valor * 0.239006;
            if (a.equals("kcal")) return valor * 0.000239006;
            if (a.equals("Wh")) return valor / 3600;
        } else if (desde.equals("kJ")) {
            if (a.equals("J")) return valor * 1000;
        } else if (desde.equals("cal")) {
            if (a.equals("J")) return valor / 0.239006;
        } else if (desde.equals("kcal")) {
            if (a.equals("J")) return valor / 0.000239006;
        } else if (desde.equals("Wh")) {
            if (a.equals("J")) return valor * 3600;
        }
        throw new IllegalArgumentException("Conversión de energía no soportada para las unidades indicadas");
    }
}
