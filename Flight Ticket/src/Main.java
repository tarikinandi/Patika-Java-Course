import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age  , tripType;
        double  distance , kmTL = 0.1;
        double normalPrice , discountPrice = 0, ageDiscount , ageDiscountRate;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age : ");
        age = sc.nextInt();
        System.out.print("Enter the distance: ");
        distance = sc.nextDouble();


        normalPrice = distance * kmTL;
        if( age >= 0 && distance >= 0){

            if (age < 12){
                ageDiscountRate = 0.5;
                ageDiscount = normalPrice * ageDiscountRate;
                discountPrice = normalPrice - ageDiscount;
            }
            if (age > 11 && age < 25){
                ageDiscountRate = 0.1;
                ageDiscount = normalPrice * ageDiscountRate;
                discountPrice = normalPrice - ageDiscount;
            }
            if (age > 64){
                ageDiscountRate = 0.3;
                ageDiscount = normalPrice * ageDiscountRate;
                discountPrice = normalPrice - ageDiscount;
            }else {
                discountPrice = normalPrice;
            }

            System.out.println("Trip Types : \n 1- One direction \n 2- Round Trip");
            System.out.print("Enter the trip Type: ");
            tripType = sc.nextInt();

            switch (tripType){
                case 1:
                    System.out.println("Total price : " + discountPrice);
                    break;
                case 2:

                    discountPrice = 2*discountPrice *0.8;
                    System.out.println("Total price : " + discountPrice);
                    break;
                default:
                    System.out.println("Invalid Trip Type");
            }



        }



            }


}