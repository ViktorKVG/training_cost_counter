package training_cost_counter;

public class CostCounter {
    static CostCounter counter = new CostCounter();

    static int trainingsPerMonth = 9,
            hallCost = 1200,
            coachCost = 2000,
            constantlyAttended = 10,
            timelyAttended = 0,
            oneTrainingCost = 150;

    static double overSumm = 0,
            personalPayment,
            timelyPersonsPayment;

    public static void main(String[] args) {
        new CounterGui().buildGui();
    }

    public void count() {
        int hallTotalCost;
        int coachTotalCost;
        double totalPerMonth;

        hallTotalCost = trainingsPerMonth * hallCost;
        coachTotalCost = trainingsPerMonth * coachCost;
        timelyPersonsPayment = timelyAttended * oneTrainingCost * trainingsPerMonth/2;
        overSumm += timelyPersonsPayment;

        totalPerMonth = hallTotalCost + coachTotalCost - overSumm;

        personalPayment = totalPerMonth / constantlyAttended;
        
        System.out.println(timelyPersonsPayment / timelyAttended);
        System.out.println(personalPayment);
    }
}
