import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double productPrice , kdvPrice , totalPrice , kdvRate;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the product price: ");
        productPrice = scan.nextDouble();



        if (productPrice <= 1000)
        {
            kdvRate = 0.18;
            kdvPrice = productPrice * kdvRate;
            totalPrice = productPrice + (productPrice * kdvRate);
            System.out.println("Price with KDV : " + totalPrice);
            System.out.println("Price without KDV : " + productPrice);
            System.out.println("KDV Price : " + kdvPrice);
        }
        else if(productPrice > 1000)
        {
            kdvRate = 0.08;
            kdvPrice = productPrice * kdvRate;
            totalPrice = productPrice + (productPrice * kdvRate);
            System.out.println("Price with KDV : " + totalPrice);
            System.out.println("Price without KDV : " + productPrice);
            System.out.println("KDV Price : " + kdvPrice);
        }
        else {
            System.out.println("You entered an incorrect price!");
        }




        }
    }
