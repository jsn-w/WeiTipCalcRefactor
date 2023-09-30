import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group?: ");
        int numPeople = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();
        TipCalculator calculate = new TipCalculator(numPeople, tipPercentage);

        boolean isRunning = true;
        double cost;

        while (isRunning) {
            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            cost = scan.nextDouble();
            scan.nextLine();
            if (cost == -1) {
                isRunning = false;
            } else {
                calculate.addMeal(cost);
            }
        }

        System.out.println("-----------------------------------");
        System.out.println("Total Bill Before Tip: $" + String.format("%.2f", calculate.getTotalBillBeforeTip()));
        System.out.println("Tip Percentage: $" + calculate.getTipPercentage());
        System.out.println("Total Tip: $" + String.format("%.2f", calculate.tipAmount()));
        System.out.println("Total Bill With Tip: $" + String.format("%.2f", calculate.totalBill()));
        System.out.println("Tip Per Person: $" + String.format("%.2f", calculate.perPersonTipAmount()));
        System.out.println("Total Cost Per Person: $" + String.format("%.2f", calculate.perPersonTotalCost()));
    }
}