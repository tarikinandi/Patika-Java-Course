import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weatherDegree  = scanner.nextDouble();

        if(weatherDegree >0 && weatherDegree <5){
            System.out.println("The temperature is suitable for skiing!");
        } else if (weatherDegree < 15 && weatherDegree > 5) {
            System.out.println("A perfect day for watching movies!");
        } else if (weatherDegree < 25 && weatherDegree > 15) {
            System.out.println("It's the perfect opportunity to go picnicking!");
        }
        else {
            System.out.println("You need to go swimming urgently.");
        }

    }
}