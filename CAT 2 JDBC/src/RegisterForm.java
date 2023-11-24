import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterForm extends JFrame {
    private JTextField nameField, usernameField, passwordField, confirmPasswordField, emailField, phoneField, addressField;

    public RegisterForm() {
        setTitle("Register Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating components
        JLabel titleLabel = new JLabel("Register Form");
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(10);

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(10);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(10);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField(10);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(10);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField(10);

        JLabel addressLabel = new JLabel("Address:");
        addressField = new JTextField(10);

        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");
        JButton closeButton = new JButton("Close");

        // Adding action listeners
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call method to save data to the database
                try {
                    saveDataToDatabase();
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear all fields
                clearFields();
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the application
                System.exit(0);
            }
        });

        // Creating layout
        setLayout(new GridLayout(9, 2));
        add(nameLabel);
        add(nameField);
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(emailLabel);
        add(emailField);
        add(phoneLabel);
        add(phoneField);
        add(addressLabel);
        add(addressField);
        add(submitButton);
        add(resetButton);
        add(closeButton);
    }

    private void saveDataToDatabase() throws ClassNotFoundException {
        // Database connection details
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/RegisterForm";
        String username = "root";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // SQL query to insert data into the database
            String sql = "INSERT INTO users (name, username, password, email, phone, address) VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                // Set parameters
                preparedStatement.setString(1, nameField.getText());
                preparedStatement.setString(2, usernameField.getText());
                preparedStatement.setString(3, passwordField.getText());
                preparedStatement.setString(4, emailField.getText());
                preparedStatement.setString(5, phoneField.getText());
                preparedStatement.setString(6, addressField.getText());

                // Execute the query
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Registration successful!");
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Registration failed!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        }
    }

    private void clearFields() {
        nameField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        emailField.setText("");
        phoneField.setText("");
        addressField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }
}
