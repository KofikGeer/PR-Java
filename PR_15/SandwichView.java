package PR_15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SandwichView {
    private JFrame frame;
    private JComboBox<String> sandwichTypeComboBox;
    private JButton orderButton;
    private JTextArea resultArea;

    public SandwichView() {
        frame = new JFrame("Sandwich Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));

        sandwichTypeComboBox = new JComboBox<>(new String[]{"Cheeseburger", "Hamburger"});
        orderButton = new JButton("Place Order");
        resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        frame.add(sandwichTypeComboBox);
        frame.add(orderButton);
        frame.add(resultArea);

        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // При нажатии кнопки "Place Order" вызывается метод в контроллере
                controller.placeOrder((String) sandwichTypeComboBox.getSelectedItem());
            }
        });
    }

    public void showSandwich(String message) {
        resultArea.setText(message);
    }

    private SandwichController controller;

    public void addController(SandwichController controller) {
        this.controller = controller;
    }

    public void show() {
        frame.setVisible(true);
    }
}

