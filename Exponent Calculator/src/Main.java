import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num ,exp , numExp=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();
        System.out.print("Enter exponent: ");
        exp = sc.nextInt();

        for (int i = 1; i <= exp; i++ ) {
            numExp *= num;
        }
        System.out.println("The number exponent is: " + numExp);
    }
}