import java.util.ArrayList;
import java.util.Collections;

public class Q7_WrapperInCollections {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> priceList = new ArrayList<>();
        for (double price : prices) {
            priceList.add(price);
        }
        double highest = Collections.max(priceList);
        double total = 0;
        for (double p : priceList) {
            total += p;
        }
        double average = total / priceList.size();
        System.out.println("Highest price: " + highest);
        System.out.println("Average price: " + average);
    }
}
