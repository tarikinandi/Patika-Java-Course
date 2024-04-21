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

        price = openingFee + km * kmPrice;
        price = (price < 20) ? 20 : price;

        System.out.println("Total price : " + df.format(price));






        }
}
