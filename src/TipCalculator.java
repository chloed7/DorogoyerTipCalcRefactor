public class TipCalculator {

    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople, double tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost){
        totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        return Math.round((totalBillBeforeTip * (tipPercentage / 100))*100.0)/100.0;
    }

    public double totalBill() {
        return totalBillBeforeTip + tipAmount();
    }

    public double perPersonCostBeforeTip() {
        return Math.round((totalBillBeforeTip / numPeople)*100.0)/100.0;
    }

    public double perPersonTipAmount() {
        return Math.round((tipAmount() / numPeople)*100.0)/100.0;
    }

    public double perPersonTotalCost() {
        return Math.round((totalBill() / numPeople)*100.0)/100.0;
    }
}
