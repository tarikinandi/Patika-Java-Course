import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int N;
        int r;
        int nComb = 1;
        int rComb=1;
        int nRComb=1;
        int combination;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value N : ");
        N = sc.nextInt();
        System.out.print("Enter the value r : ");
        r = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            nComb *= i;

        }

        for (int j = 1; j <= r; j++) {
            rComb *= j;

        }
        for (int k = 1; k <= N-r; k++) {
            nRComb *= k;

        }
        combination = nComb / (rComb * nRComb);
        System.out.println(combination);

        }
    }
