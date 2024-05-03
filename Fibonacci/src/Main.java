import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 2; i < n-1; i++){
            arr[i+1] = arr[i] + arr[i-1];
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}