import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static boolean isPrime(int n , int dv) {
        if (dv == n){
            return true;
        }
        if (n % dv == 0){
            return false;
        }
        return isPrime(n , dv +1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean isPrime = isPrime(n , 2);

        if (isPrime){
            System.out.println(n + " is a prime number");
        }
        else {
            System.out.println(n + " is not a prime number");
        }


    }
}