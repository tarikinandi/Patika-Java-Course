import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int month , day;
        String horoscope;
        boolean isError = true;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your birth month:");
        month = inp.nextInt();
        System.out.println("Enter your birth day:");
        day = inp.nextInt();

        if (day > 1 && day <= 31 && month > 1 && month <= 12)
        {
            if (month == 3 && day > 20 || month == 4 && day < 21) {
                horoscope = "Aries";
                printConsole(horoscope);
            } else if (month == 4 && day > 20 || month == 5 && day < 22) {
                horoscope = "Taurus";
                printConsole(horoscope);
            } else if (month == 5 && day > 21 || month == 6 && day < 23) {
                horoscope = "Gemini";
                printConsole(horoscope);
            } else if (month == 6 && day > 22 || month == 7 && day < 23) {
                horoscope = "Cancer";
                printConsole(horoscope);
            } else if (month == 7 && day > 22 || month == 8 && day < 23) {
                horoscope = "Leo";
                printConsole(horoscope);
            } else if (month == 8 && day > 22 || month == 9 && day < 23) {
                horoscope = "Virgo";
                printConsole(horoscope);
            } else if (month == 9 && day > 22 || month == 10 && day < 23) {
                horoscope = "Libra";
                printConsole(horoscope);
            } else if (month == 10 && day > 22 || month == 11 && day < 22) {
                horoscope = "Scorpio";
                printConsole(horoscope);
            } else if (month == 11 && day > 21 || month == 12 && day < 22) {
                horoscope = "Sagittarius";
                printConsole(horoscope);
            } else if (month == 12 && day > 21 || month == 1 && day < 22) {
                horoscope = "Capricorn";
                printConsole(horoscope);
            } else if (month == 1 && day > 21 || month == 2 && day < 20) {
                horoscope = "Aquarius";
                printConsole(horoscope);
            } else {
                horoscope = "Piches";
                printConsole(horoscope);
            }
        }else {
            System.out.println("Invalid birth day or month!");
        }




    }

    private static void printConsole(String horoscope) {
        System.out.println("Your zodiac sign : " + horoscope);
    }
}