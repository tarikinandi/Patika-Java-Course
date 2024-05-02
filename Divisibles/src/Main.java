import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number ;
        double average = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = sc.nextInt();

        DecimalFormat df = new DecimalFormat("#.00");

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                list.add(i);
            } else if (i % 4 == 0) {
                System.out.println(i);
                list.add(i);
            }
        }

        for(int i : list){
            average += i;
        }
        average = average / (double)list.size();

        System.out.println(df.format(average));
    }
}