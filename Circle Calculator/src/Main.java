import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int r , value=0;
        double area , enviromental , angle;


        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);


        System.out.println("If the angle of the circle is not clear, click on number: 1");
        System.out.println("If the angle of the circle is clear, click number: 2");

        System.out.print("Please enter the number : ");
        value = scan.nextInt();

        switch (value){
            case 1:
                System.out.print("Enter radius: ");
                r = scan.nextInt();
                enviromental = Math.PI * 2 * r;
                area = Math.PI * r * r;
                System.out.println("Circle Enviromental : " + df.format(enviromental) );
                System.out.println("Area of Circle : " + df.format(area) );
                break;
            case 2:
                System.out.print("Enter radius: ");
                r = scan.nextInt();
                System.out.println("Enter the angle: ");
                angle = scan.nextDouble();
                enviromental = Math.PI * 2 * r;
                area = (Math.PI * (r * r) * angle) / 360;
                System.out.println("Circle Enviromental : " + df.format(enviromental) );
                System.out.println("Area of Circle : " + df.format(area) );
                break;
            default:
                System.out.println("Wrong input");
                break;
        }



    }
}