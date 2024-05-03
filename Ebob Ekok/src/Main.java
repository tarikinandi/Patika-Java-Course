import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n1 , n2;
        int ebob = 0 , ekok = 0;
        int i = 1 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Number 1 : ");
        n1 = input.nextInt();
        System.out.print("Number 2 : ");
        n2 = input.nextInt();

        int k = n1;
        while(k >= 1){
            if (n1 % k == 0 && n2 % k == 0){
                ebob = k;
                break;
            }
            k--;
        }

        while(i < (n1*n2)){
            if (i % n1 == 0 && i % n2 == 0){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("Ebob :"  + ebob);
        System.out.println("Ekok :"  + ekok);

    }

}