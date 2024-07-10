import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VehiculoApp extends JFrame {
    private JTextField marcaField;
    private JTextField modeloField;
    private JTextField anioField;
    private JButton guardarButton;
    private JButton cancelarButton;

    private String marca;
    private String modelo;
    private int anio;

    public VehiculoApp() {
        setTitle("Vehículo App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Crear y añadir componentes
        add(new JLabel("Marca:"));
        marcaField = new JTextField();
        add(marcaField);

        add(new JLabel("Modelo:"));
        modeloField = new JTextField();
        add(modeloField);

        add(new JLabel("Año:"));
        anioField = new JTextField();
        add(anioField);

        guardarButton = new JButton("Guardar");
        cancelarButton = new JButton("Cancelar");

        add(guardarButton);
        add(cancelarButton);

        // Añadir ActionListeners a los botones
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarDatos();
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelar();
            }
        });
    }

    private void guardarDatos() {
        try {
            marca = marcaField.getText();
            modelo = modeloField.getText();
            anio = Integer.parseInt(anioField.getText());
            JOptionPane.showMessageDialog(this, "Datos guardados:\nMarca: " + marca + "\nModelo: " + modelo + "\nAño: " + anio);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un año válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cancelar() {
        marcaField.setText("");
        modeloField.setText("");
        anioField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VehiculoApp().setVisible(true);
            }
        });
    }
}
