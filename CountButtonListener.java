<<<<<<< HEAD
package vityaztrainings;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static vityaztrainings.CostCounter.*;
import static vityaztrainings.CounterGui.*;

class CountButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        trainingsPerMonth = checkFullness(trainingsPerMonth, inputTrainingsPerMonth);
        hallCost = checkFullness(hallCost, inputHallCost);
        coachCost = checkFullness(coachCost, inputCoachCost);
        constantlyAttended = checkFullness(constantlyAttended, inputConstantlyAttended);
        timelyAttended = checkFullness(timelyAttended, inputTimelyAttended);
        oneTrainingCost = checkFullness(oneTrainingCost, inputOneTrainingCost);
        overSumm = checkFullness((int)overSumm, inputOverSumm);

        counter.count();

        showResults();
    }

    private int checkFullness(int input, JTextField field) {
        if (!field.getText().isEmpty()) {
            input = Integer.parseInt(field.getText());
        }
        return input;
    }

    private void showResults() {
        String persPayment = "" + personalPayment;
        String timelyPersPayment = "" + timelyPersonsPayment;

        outputPersonalPayment.setText("");
        outputTimelyPersonsPayment.setText("");

        outputPersonalPayment.setText(persPayment);
        if (timelyAttended == 0) {
            outputTimelyPersonsPayment.setText("халтурщиков нет");
        } else {
            outputTimelyPersonsPayment.setText(timelyPersPayment);
        }
    }
}