public class ShoppingCart {
    public static double calculateTotal(double[] prices, String customerType) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total = total + prices[i];
        }
        switch (customerType) {
            case "REGULAR":
                total = total;
                System.out.println("No discount, total payment " + total);
                break;
            case "PREMIUM":
                total = total * 0.9;
                System.out.println("10% discount, total payment " + total);
                break;
            case "VIP":
                total = total * 0.8;
                System.out.println("20% discount, total payment: " + total);
                break;
        }
        return total;


    }

    public static double findMostExpensive(double[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        double max = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }

        return max;
    }

    public static double countExpensiveItems(double[] prices, double threshold) {
        double itemsNUmber = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > threshold) {
                itemsNUmber++;
            }
        }
        return itemsNUmber;
    }

    public static void main(String[] args) {
        double[] cart = {25.99, 45.50, 12.99, 89.99, 15.75};
        calculateTotal(cart, "REGULAR");
        calculateTotal(cart, "PREMIUM");
        calculateTotal(cart, "VIP");
        findMostExpensive(cart);
        countExpensiveItems(cart, 30);
        System.out.println("Regular customer total: $" + calculateTotal(cart,
                "REGULAR"));
        System.out.println("Premium customer total: $" + calculateTotal(cart,
                "PREMIUM"));
        System.out.println("VIP customer total: $" + calculateTotal(cart,
                "VIP"));


    }
}
