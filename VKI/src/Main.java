import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height, weight , vki;

        DecimalFormat df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height in meters: ");
        height = input.nextDouble();
        System.out.print("Enter the weight in kilograms: ");
        weight = input.nextDouble();

        vki = weight / (height * height);
        System.out.println("VKI is " + df.format(vki));


    }
}