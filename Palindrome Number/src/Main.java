import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static boolean isPalindrome(int x) {
        int temp = x , reverseNumber = 0 , lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if(reverseNumber == x) return true;
        else return false;
    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = sc.nextInt();
        if(isPalindrome(number) == true){
            System.out.println(number +" is a palindrome.");
        }
        else{
            System.out.println(number + " is not a palindrome.");
        }
    }
}