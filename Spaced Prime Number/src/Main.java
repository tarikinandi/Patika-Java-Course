import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();

        for (int i = 2; i <= n; i++)
        {
            int counter = 0;

            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                    counter++;
            }
            if (counter <=2)
                System.out.print(i + " ");
        }

    }
}