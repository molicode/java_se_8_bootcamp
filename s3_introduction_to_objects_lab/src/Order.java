public class Order {
    MyDate orderDate;
    double orderAmount = 0.00;
    String customer;
    String product;
    int quantity;
    static double taxRate;

    public Order(MyDate d, double amt, String c, String p, int q) {
        orderDate = d;
        orderAmount = amt;
        customer = c;
        product = p;
        quantity = q;
    }

    public Order(MyDate d, double amt, String c){
    	orderDate = d;
    	orderAmount = amt;
    	customer = c;
    	product = "Anvil";
    	quantity = 1;


	}

    public String toString() {
        return quantity + " ea. " + product + " for " + customer;
    }

    public static void setTaxRate(double newRate) {
        taxRate = newRate;
    }

    public static void computeTaxOn(double anAmouunt) {
        System.out.println("The tax for " + anAmouunt + " is: " + anAmouunt * Order.taxRate);
    }

    public double computeTax() {
		System.out.println("The tax fotr this order is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
    }
}
