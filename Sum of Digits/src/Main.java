import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num;
        int digits = 0;
        int baseValue;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();

        int tmp = num;
        while (tmp != 0) {
            baseValue = tmp % 10;
            result += baseValue;
            tmp = tmp / 10;
        }
        System.out.println(result);
    }
}