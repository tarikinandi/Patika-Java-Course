import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Recursive exponential method
    public static int exponential(int base, int exponent){
        if(exponent==0){
            return 1;
        } else{
            int result = base* exponential(base,exponent-1);
            return result;
        }
    }

    public static void main(String[] args) {
        // Declare variables and prompting user input
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter base number: ");
        int base = input.nextInt();
        System.out.print("Please enter exponent number: ");
        int exponent = input.nextInt();
        // Calculates and printing result
        System.out.print("Result: "+ exponential(base,exponent));
    }
}