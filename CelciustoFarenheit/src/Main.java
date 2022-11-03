import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        System.out.print("Please enter your temperature in Degree Celcius: ");

        Double Celcius = sc.nextDouble();

        System.out.println();
        Double Farenheit = (1.8 * Celcius) + 32;

        System.out.println("Temperature in Farenheit is " + Farenheit);

    }
}