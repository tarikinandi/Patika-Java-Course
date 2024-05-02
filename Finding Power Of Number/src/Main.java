import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;
        System.out.print("Please enter upper limit of number which powers of 4 and 5: ");
        number=input.nextDouble();
        // Printing results
        for(int i=1,j=1, k=0; i<=number || j<=number; k++, i*=4, j*=5){
            System.out.println("4^ "+k +" = "+ i);
            System.out.println("5^ "+k +" = "+j);
        }
    }
}