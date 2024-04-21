import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pear = 2.14 , pearKg;
        double apple = 3.67 , appleKg;
        double tomato = 1.11 , tomatoKg;
        double banana = 0.95 , bananaKg;
        double aubergine = 5.00 , aubergineKg;

        Scanner input = new Scanner(System.in);
        System.out.println("How many kg of pears?");
        pearKg = input.nextDouble();
        System.out.println("How many kg of apple?");
        appleKg = input.nextDouble();
        System.out.println("How many kg of tomato?");
        tomatoKg = input.nextDouble();
        System.out.println("How many kg of banana?");
        bananaKg = input.nextDouble();
        System.out.println("How many kg of aubergine?");
        aubergineKg = input.nextDouble();

        double total = (pear * pearKg) + (apple * appleKg) + (tomato * tomatoKg) + (banana * bananaKg) + (aubergine * aubergineKg);
        System.out.println("Total is : " + total + "TL");

    }
}