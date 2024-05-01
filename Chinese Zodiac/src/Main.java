import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int birthYear , zodiacYear;
        String zodiacName;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter birth year: ");
        birthYear = sc.nextInt();
        zodiacYear = birthYear % 12;

        switch (zodiacYear){
            case 0:
                zodiacName = "Monkey";
                System.out.println("Your Chinese Zodiac sign: " + zodiacName);
                break;
            case 1:
                zodiacName = "Rooster";
                System.out.println("Your Chinese Zodiac sign: " + zodiacName);
                break;
            case 2:
                zodiacName = "Dog";
                System.out.println("Your Chinese Zodiac sign: " + zodiacName);
                break;
            case 3:
                zodiacName = "Pig";
                System.out.println("Your Chinese Zodiac sign: " + zodiacName);
                break;
            case 4:
                zodiacName = "Rat";
                System.out.println("Your Chinese Zodiac sign: " + zodiacName);
                break;
            case 5:
                zodiacName = "Ox";
                System.out.println("Your Chinese Zodiac sign: " + zodiacName);
                break;
            case 6:
                zodiacName = "Tiger";
                System.out.println("Your Chinese Zodiac sign: " + zodiacName);
                break;
            case 7:
                zodiacName = "Rabbit";
                System.out.println("Your Chinese Zodiac sign: " + zodiacName);
                break;
            case 8:
                zodiacName = "Dragon";
                System.out.println("Your Chinese Zodiac sign: " + zodiacName);
                break;
            case 9:
                zodiacName = "Snake";
                System.out.println("Your Chinese Zodiac sign: " + zodiacName);
                break;
            case 10:
                zodiacName = "Horse";
                System.out.println("Your Chinese Zodiac sign: " + zodiacName);
                break;
            case 11:
                zodiacName = "Goat";
                System.out.println("Your Chinese Zodiac sign: " + zodiacName);
                break;
            default:
                System.out.println("Invalid birth year");
        }


    }
}