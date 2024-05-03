import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();
        int basNum = 0;
        int temp = num;
        int basValue;
        int result = 0;
        int basPow;

        while(temp != 0) {
            temp /= 10;
            basNum++;
        }

        temp = num;

        while(temp != 0) {
            basValue = temp % 10;
            basPow = 1;
            for(int i = 0; i < basNum; i++) {
                basPow *= basValue;
            }
            result += basPow;
            temp /= 10;
        }

        if(result == num) {
            System.out.println("Number is Armstrong");
        }else {
            System.out.println("Number is not Armstrong");
        }




    }
}