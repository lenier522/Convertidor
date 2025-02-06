import javax.swing.*;
import java.awt.*;
import conversion.UnitCategory;  // Asegúrate de tener en tu classpath la librería con el paquete "conversion"
import static conversion.UnitCategory.TipoUnidad.*;  // Importa las constantes del enum (si lo deseas)

public class Main extends JFrame {
    // Componentes de la interfaz
    private JComboBox<String> categoryCombo;
    private JComboBox<String> unitFromCombo;
    private JComboBox<String> unitToCombo;
    private JTextField valueField;
    private JButton convertButton;
    private JLabel resultLabel;

    // Arrays de categorías y unidades (estos ejemplos deben coincidir con las definiciones de la librería)
    private final String[] categories = {"LONGITUD", "MASA", "TEMPERATURA", "VOLUMEN", "AREA", "VELOCIDAD", "TIEMPO", "ENERGIA", "PRESION"};

    private final String[] unidadesLongitud = {"m", "km", "cm", "mm", "mi", "yd", "ft"};
    private final String[] unidadesMasa = {"kg", "g", "mg", "lb", "oz"};
    private final String[] unidadesTemperatura = {"C", "F", "K"};
    private final String[] unidadesVolumen = {"l", "ml", "gal", "ft3"};
    private final String[] unidadesArea = {"m2", "km2", "ft2", "ac", "ha"};
    private final String[] unidadesVelocidad = {"km/h", "m/s", "mph", "ft/s"};
    private final String[] unidadesTiempo = {"s", "min", "h", "d"};
    private final String[] unidadesEnergia = {"J", "kJ", "cal", "kcal", "Wh"};
    private final String[] unidadesPresion = {"Pa", "kPa", "atm", "bar", "mmHg"};

    public Main() {
        setTitle("Conversor de Unidades");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        // Usamos GridBagLayout para una disposición flexible
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Fila 0: Etiqueta "Valor:" y campo de texto para ingresar el valor
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Valor:"), gbc);
        valueField = new JTextField();
        gbc.gridx = 1;
        add(valueField, gbc);

        // Fila 1: Etiqueta "Categoría:" y JComboBox para la categoría
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Categoría:"), gbc);
        categoryCombo = new JComboBox<>(categories);
        gbc.gridx = 1;
        add(categoryCombo, gbc);

        // Fila 2: Etiqueta "Unidad Origen:" y JComboBox para la unidad de origen
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Unidad Origen:"), gbc);
        unitFromCombo = new JComboBox<>();
        gbc.gridx = 1;
        add(unitFromCombo, gbc);

        // Fila 3: Etiqueta "Unidad Destino:" y JComboBox para la unidad destino
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Unidad Destino:"), gbc);
        unitToCombo = new JComboBox<>();
        gbc.gridx = 1;
        add(unitToCombo, gbc);

        // Fila 4: Botón "Convertir"
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        convertButton = new JButton("Convertir");
        add(convertButton, gbc);

        // Fila 5: Etiqueta para mostrar el resultado
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        resultLabel = new JLabel("Resultado: ");
        add(resultLabel, gbc);

        // Actualiza los JComboBox de unidades cuando se seleccione una categoría
        categoryCombo.addActionListener(e -> updateUnits());

        // Inicializa con la categoría seleccionada por defecto
        updateUnits();

        // Acción del botón Convertir
        convertButton.addActionListener(e -> performConversion());
    }

    // Actualiza los JComboBox de unidades según la categoría seleccionada
    private void updateUnits() {
        String category = (String) categoryCombo.getSelectedItem();
        String[] units;
        switch (category) {
            case "LONGITUD":
                units = unidadesLongitud;
                break;
            case "MASA":
                units = unidadesMasa;
                break;
            case "TEMPERATURA":
                units = unidadesTemperatura;
                break;
            case "VOLUMEN":
                units = unidadesVolumen;
                break;
            case "AREA":
                units = unidadesArea;
                break;
            case "VELOCIDAD":
                units = unidadesVelocidad;
                break;
            case "TIEMPO":
                units = unidadesTiempo;
                break;
            case "ENERGIA":
                units = unidadesEnergia;
                break;
            case "PRESION":
                units = unidadesPresion;
                break;
            default:
                units = new String[]{};
        }
        unitFromCombo.setModel(new DefaultComboBoxModel<>(units));
        unitToCombo.setModel(new DefaultComboBoxModel<>(units));
    }

    // Realiza la conversión usando la librería
    private void performConversion() {
        try {
            double value = Double.parseDouble(valueField.getText());
            String category = (String) categoryCombo.getSelectedItem();
            String unitFrom = (String) unitFromCombo.getSelectedItem();
            String unitTo = (String) unitToCombo.getSelectedItem();

            // Se asume que el enum TipoUnidad de la librería tiene los mismos nombres que los valores del JComboBox
            UnitCategory.TipoUnidad tipo = UnitCategory.TipoUnidad.valueOf(category);
            double result = UnitCategory.convertir(tipo, unitFrom, unitTo, value);

            resultLabel.setText(String.format("Resultado: %.2f", result));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error en la conversión: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Ejecuta la aplicación en el hilo de eventos de Swing
        SwingUtilities.invokeLater(() -> {
            Main app = new Main();
            app.setVisible(true);
        });
    }
}
