import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = sc.nextDouble();

        System.out.print("Convert to Celsius or Farenheit? (C or F): ");
        unit = sc.next().toUpperCase();

        // (condition) ? true : false
        newTemp = (unit.equals("C")) ?
                (temp - 32) * 5 / 9 :
                (temp * 9 / 5) + 32;

//        System.out.println(newTemp + "°" + unit);
        System.out.printf("%.1f°%s", newTemp, unit);

        sc.close();
    }
}