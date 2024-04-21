import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int math  , mathCoefficient = 5;
        int physics , physicsCoefficient = 4;
        int chemistry , chemistryCoefficient = 4;
        int turkce , turkceCoefficient = 5;
        int music , musicCoefficient = 2;
        int history , historyCoefficient = 3;

        int coefficientSum = mathCoefficient + physicsCoefficient + chemistryCoefficient +
                turkceCoefficient + musicCoefficient + historyCoefficient;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your math course grade?");
        math = scan.nextInt();
        System.out.print("Enter your physics course grade?");
        physics = scan.nextInt();
        System.out.print("Enter your chemistry course grade?");
        chemistry = scan.nextInt();
        System.out.print("Enter your turkce course grade?");
        turkce = scan.nextInt();
        System.out.print("Enter your music course grade?");
        music = scan.nextInt();
        System.out.print("Enter your history course grade?");
        history = scan.nextInt();


        int gpa = ((math * mathCoefficient) + (physicsCoefficient * physics) + (chemistry * chemistryCoefficient) +
                (turkce * turkceCoefficient) + (music * musicCoefficient) + (history * historyCoefficient)) / coefficientSum;


        if ((gpa <= 100) && (gpa >= 60)){
            System.out.println("Passed the class! Your GPA : " + gpa );
        }
        else {
            System.out.println("You failed the class! Your GPA : " + gpa);
        }



    }
}