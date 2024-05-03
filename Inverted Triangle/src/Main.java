import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}