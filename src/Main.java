public class Main {
    public static void main(String[] args) {
        double salesTax = 0.05;
        double salesTaxCost;
        double purchaseSubTotal = 5;
        double totalPrice;

        salesTaxCost = purchaseSubTotal * salesTax;
        totalPrice = salesTaxCost + purchaseSubTotal;

        System.out.println("Your tax on this purchase is: $" + salesTaxCost + " Making the grand total: $" + totalPrice);
    }
}