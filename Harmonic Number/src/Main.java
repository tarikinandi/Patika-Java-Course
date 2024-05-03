import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int N;
        double result = 0;


        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();

        for (double i = 1; i <= N; i++) {
           result += (1/i);
        }

        System.out.println("Harmonic result = " + result);
    }
}