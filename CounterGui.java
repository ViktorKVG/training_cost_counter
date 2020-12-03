package training_cost_counter;

import javax.swing.*;
import java.awt.*;
import static training_cost_counter.CostCounter.*;


public class CounterGui {
    static JTextField inputTrainingsPerMonth,
            inputHallCost,
            inputCoachCost,
            inputOverSumm,
            inputConstantlyAttended,
            inputTimelyAttended,
            inputOneTrainingCost,
            outputPersonalPayment,
            outputTimelyPersonsPayment;

    static JPanel panel = new JPanel();

    public void buildGui() {
        JFrame frame = new JFrame("Калькулятор стоимости тренировок");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton countButton = new JButton("Рассчитать");
        countButton.addActionListener(new CountButtonListener());

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(66,170,255));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); //Пустая граница для создания полей между краями панели и местом размещения компонентов

        inputTrainingsPerMonth = buildInputLine("Количество тренировок в месяце (по умол. " + trainingsPerMonth + ")");
        inputHallCost = buildInputLine("Стоимость зала (по умол. " + hallCost + ")");
        inputCoachCost = buildInputLine("Стоимость тренера (по умол. " + coachCost + ")");
        inputOverSumm = buildInputLine("Излишек (по умол. " + overSumm + ")");
        inputConstantlyAttended = buildInputLine("Кол.-во постояльцев (по умол. " + constantlyAttended + ")");
        inputTimelyAttended = buildInputLine("Кол.-во временщиков (по умол. " + timelyAttended + ")");
        inputOneTrainingCost = buildInputLine("Стоимость тренировки (по умол. " + oneTrainingCost + ")");

        outputPersonalPayment = buildOutputLine("Сумма с постояльцев:");
        outputTimelyPersonsPayment = buildOutputLine("Сумма с халтурщиков:");

        frame.getContentPane().add(BorderLayout.SOUTH, countButton);
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(300,500);
    }

    public JTextField buildInputLine(String labelText) {
        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Calibri", Font.TYPE1_FONT, 12));
        JTextField lineName = new JTextField();
        lineName.setEditable(true);
        lineName.setFont(new Font("Calibri", Font.TYPE1_FONT, 16));
        lineName.setAlignmentX(JTextField.CENTER_ALIGNMENT);
        lineName.setAlignmentY(JTextField.CENTER);
        lineName.setHorizontalAlignment(JTextField.CENTER);
        panel.add(label);
        panel.add(lineName);
        return lineName;
    }

    public JTextField buildOutputLine(String labelText) {
        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Calibri", Font.BOLD, 18));
        JTextField lineName = new JTextField();
        lineName.setEditable(false);
        lineName.setFont(new Font("Calibri", Font.BOLD, 20));
        lineName.setDisabledTextColor(Color.RED);
        lineName.setAlignmentX(JTextField.CENTER_ALIGNMENT);
        lineName.setAlignmentY(JTextField.CENTER);
        lineName.setHorizontalAlignment(JTextField.CENTER);
        panel.add(label);
        panel.add(lineName);
        return lineName;
    }
}
