package conversion;

import convertir.*;

public class UnitCategory {

    public enum TipoUnidad {
        LONGITUD, MASA, TEMPERATURA, VOLUMEN, AREA, VELOCIDAD, TIEMPO, ENERGIA, PRESION
    }

    public static double convertir(TipoUnidad tipo, String desdeUnidad, String aUnidad, double valor) {

        try {
            switch (tipo) {
                case LONGITUD:
                    return ConversorLongitud.convertir(desdeUnidad, aUnidad, valor);
                case MASA:
                    return ConversorMasa.convertir(desdeUnidad, aUnidad, valor);
                case TEMPERATURA:
                    return ConversorTemperatura.convertir(desdeUnidad, aUnidad, valor);
                case VOLUMEN:
                    return ConversorVolumen.convertir(desdeUnidad, aUnidad, valor);
                case AREA:
                    return ConversorArea.convertir(desdeUnidad, aUnidad, valor);
                case VELOCIDAD:
                    return ConversorVelocidad.convertir(desdeUnidad, aUnidad, valor);
                case TIEMPO:
                    return ConversorTiempo.convertir(desdeUnidad, aUnidad, valor);
                case ENERGIA:
                    return ConversorEnergia.convertir(desdeUnidad, aUnidad, valor);
                case PRESION:
                    return ConversorPresion.convertir(desdeUnidad, aUnidad, valor);
                default:
                    throw new IllegalArgumentException("Tipo de unidad no soportado");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
