import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double firstSteepEdge , x , area , secondSteepEdge , hypotenuse , perimeter;



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the first perpendicular side: ");
        firstSteepEdge = scan.nextDouble();
        System.out.println("Enter the length of the second perpendicular side: ");
        secondSteepEdge = scan.nextDouble();

        hypotenuse = Math.sqrt((firstSteepEdge * firstSteepEdge) + (secondSteepEdge * secondSteepEdge));
        x = (firstSteepEdge + secondSteepEdge + hypotenuse) / 2;

        perimeter = 2 * x;
        area = Math.sqrt(x * (x - firstSteepEdge) * (x - secondSteepEdge) * (x - hypotenuse));
        x = (firstSteepEdge + secondSteepEdge + hypotenuse) / 2;

        System.out.println("Hypotenuse : " + (int)hypotenuse);
        System.out.println("Perimeter of triangle : " + (int)perimeter);
        System.out.println("Area of triangle : " + area);

        }
    }
