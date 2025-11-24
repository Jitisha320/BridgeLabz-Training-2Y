import java.util.ArrayList;

public class Q17_PerformanceImpact {
    public static void main(String[] args) {
        int size = 1000000;

        long startPrimitive = System.currentTimeMillis();
        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) intArray[i] = i;
        long sumPrimitive = 0;
        for (int n : intArray) sumPrimitive += n;
        long endPrimitive = System.currentTimeMillis();

        long startWrapper = System.currentTimeMillis();
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < size; i++) intList.add(i);
        long sumWrapper = 0;
        for (int n : intList) sumWrapper += n;
        long endWrapper = System.currentTimeMillis();

        System.out.println("Primitive array sum time: " + (endPrimitive - startPrimitive) + " ms");
        System.out.println("Wrapper list sum time: " + (endWrapper - startWrapper) + " ms");
    }
}
