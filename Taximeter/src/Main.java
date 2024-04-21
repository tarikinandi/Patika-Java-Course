import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double km , price;
        double openingFee = 10;
        double kmPrice = 2.2;

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        System.out.print("How many kilometers will be traveled : ");
        km = scan.nextDouble();

        price = openingFee + (km * kmPrice);

        if (price < 20) {
            System.out.println("The amount you will pay: 20");
        }
        else {
            System.out.println("The amount you will pay: " + df.format(price));
        }


        }
}
