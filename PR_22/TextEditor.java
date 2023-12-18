package PR_22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

interface IDocument {
    void save();

    void open();

    void createNew();
}

class TextDocument implements IDocument {
    private JTextArea textArea; // Добавляем JTextArea для ввода текста

    public TextDocument() {
        textArea = new JTextArea();
    }
    public void save() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("document.txt"))) {
// Записываем содержимое JTextArea в файл
            writer.write(textArea.getText());
            System.out.println("Document saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving the document: " + e.getMessage());
        }
    }

    public void open() {
// Логика открытия документа
    }

    public void createNew() {
// Логика создания нового документа
    }

    // Добавляем метод для получения JTextArea
    public JTextArea getTextArea() {
        return textArea;
    }
}

public class TextEditor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem newMenuItem = new JMenuItem("New");
        fileMenu.add(newMenuItem);
        newMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextDocument textDocument = new TextDocument();

// Добавляем JTextArea к окну
                frame.getContentPane().add(new JScrollPane(textDocument.getTextArea()));

                textDocument.createNew();
                textDocument.save();
            }
        });

        JMenuItem openMenuItem = new JMenuItem("Open");
        fileMenu.add(openMenuItem);
        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextDocument textDocument = new TextDocument();

// Добавляем JTextArea к окну
                frame.getContentPane().add(new JScrollPane(textDocument.getTextArea()));

                textDocument.open();
            }
        });

        JMenuItem saveMenuItem = new JMenuItem("Save");
        fileMenu.add(saveMenuItem);
        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
// Получаем текущий TextDocument из JTextArea
                Component[] components = frame.getContentPane().getComponents();
                if (components.length > 0 && components[0] instanceof JScrollPane) {
                    JScrollPane scrollPane = (JScrollPane) components[0];
                    if (scrollPane.getViewport().getView() instanceof JTextArea) {
                        TextDocument textDocument = new TextDocument();
                        textDocument.getTextArea().setText(((JTextArea) scrollPane.getViewport().getView()).getText());
                        textDocument.save();
                    }
                }
            }
        });

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}