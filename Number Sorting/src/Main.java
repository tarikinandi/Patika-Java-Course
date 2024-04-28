import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        numbers[0] = input.nextInt();
        System.out.print("Enter number 2: ");
        numbers[1] = input.nextInt();
        System.out.print("Enter number 3: ");
        numbers[2] = input.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }
        System.out.print("Sorted Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        }
}