import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter number: ");
            num = sc.nextInt();
            if (num % 4 == 0) {
                sum += num;
            }
        }while (num % 2 == 0);

        System.out.println("Sum: " + sum);
    }
}