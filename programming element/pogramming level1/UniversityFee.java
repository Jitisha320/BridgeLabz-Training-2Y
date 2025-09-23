public class UniversityFee {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discount = (fee*discountPercent)/100;
        double discounted_fee = fee-discount;


        System.out.println("The discount amount is INR  " + discount + " and the discounted fees is INR " + discounted_fee);

    }
}
