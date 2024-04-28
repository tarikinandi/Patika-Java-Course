import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int math , physic , turkce , chemistry , music , average = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your math grade: ");
        math = input.nextInt();
        System.out.print("Enter your physic grade: ");
        physic = input.nextInt();
        System.out.print("Enter your Turkce grade: ");
        turkce = input.nextInt();
        System.out.print("Enter your chemistry grade: ");
        chemistry = input.nextInt();
        System.out.print("Enter your music grade: ");
        music = input.nextInt();

        int[] lessons = {math, physic, turkce, chemistry, music};

        for(int i=0; i<lessons.length; i++){
            if (lessons[i] < 100 && lessons[i] > 0){
                average = average + lessons[i];
            }

        }

        average = average / lessons.length;
        System.out.println("The average is: " + average);

        if (average > 55){
            System.out.println("Congratulations, you passed the course!");
        }
        else {
            System.out.println("You failed the course!");
        }




    }
}