package PR_7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    // Конструктор
    public Football() {
        //То как выглядит окошко
        setTitle("Football");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Создание кнопок для каждой команды
        JButton milanButton = new JButton("AC Milan");
        milanButton.setForeground(Color.RED);
        JButton madridButton = new JButton("Real Madrid");
        madridButton.setForeground(Color.BLUE);

        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        // Добавление обработчиков событий для кнопок
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++; // Увеличиваем счет Милана
                updateLabels("AC Milan"); // Вызываем метод для обновления меток
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++; // Увеличиваем счет Мадрида
                updateLabels("Real Madrid"); // Вызываем метод для обновления меток
            }
        });

        // Добавление компонентов на JFrame
        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
    }

    //обновление текста результата
    private void updateLabels(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        // Определение победителя или ничьей
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }
//запуск приложения
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Football matchSimulation = new Football();
                matchSimulation.setVisible(true); // Отображение окна
            }
        });
    }
}
