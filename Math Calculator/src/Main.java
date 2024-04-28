import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int value;

        double result , numb1 , numb2;

        System.out.println("If you want to add, press 1!");
        System.out.println("If you want to subtract, press 2!");
        System.out.println("If you want to multiply, press 3!");
        System.out.println("If you want to divide, press 4!");
        System.out.println("If you want to square, press 5!");
        System.out.print("Choose which action you want to perform: ");
        value = inp.nextInt();

        System.out.print("Enter the first number: ");
        numb1 = inp.nextDouble();
        System.out.print("Enter the second number: ");
        numb2 = inp.nextDouble();


        switch (value){
            case 1:
                result = numb1 + numb2;
                System.out.println("The result is: " + result);
                break;
            case 2:
                result = numb1 - numb2;
                System.out.println("The result is: " + result);
                break;
            case 3:
                result = numb1 * numb2;
                System.out.println("The result is: " + result);
                break;
            case 4:
                result = numb1 / numb2;
                System.out.println("The result is: " + result);
                break;
            case 5:
                result = Math.pow(numb1 , numb2);
                System.out.println("The result is: " + result);
                break;
            default:
                System.out.println("You have entered an invalid number.");
        }

        System.out.println("Program ended!");
    }
}