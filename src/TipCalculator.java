public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip = 0;

    public TipCalculator (int numPeople, int tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        return getTipPercentage() / 100.0 * totalBillBeforeTip;
    }

    public double totalBill() {
        return getTotalBillBeforeTip() + tipAmount();
    }

    public double perPersonCostBeforeTip() {
        return getTotalBillBeforeTip() / numPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount() / numPeople;
    }

    public double perPersonTotalCost() {
        return totalBill() / numPeople;
    }
}