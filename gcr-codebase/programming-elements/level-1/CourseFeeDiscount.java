public class CourseFeeDiscount {
    public static void main(String[] args) {
       
        double fee = 125000;
        double discountPercent = 10;

        
        double discount = (fee * discountPercent) / 100;

       
        double finalFee = fee - discount;

        System.out.println(
            "The original course fee is INR " + fee + "\n" +
            "The discount amount is INR " + discount + "\n" +
            "The discounted price the student has to pay is INR " + finalFee
        );
    }
}
