import java.util.ArrayList;
import java.util.Collections;

public class Q10_EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {25, 32, 45, 28, 36};
        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(age);
        }
        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);
        System.out.println("Youngest age: " + youngest);
        System.out.println("Oldest age: " + oldest);
    }
}
