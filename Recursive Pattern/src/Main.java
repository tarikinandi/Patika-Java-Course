import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int recursiveProcessMinus(int processValue) {
        if (processValue <= 0)
            return processValue;

        System.out.print(processValue + " ");
        return recursiveProcessMinus(processValue - 5);
    }

    public static void recursiveProcessPlus(int processValue, int userInput) {
        if (userInput >= processValue) {
            System.out.print(processValue + " ");
            recursiveProcessPlus(processValue + 5, userInput);
        }
    }

        public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter n value: ");
            int userInput = input.nextInt();
            int processValue = recursiveProcessMinus(userInput);
            recursiveProcessPlus(processValue, userInput);
        }
    }
