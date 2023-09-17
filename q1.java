import java.util.Scanner;

public class q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter farenheit: ");
    double farenheit = sc.nextDouble();

    double celcius = (farenheit - 32) * 5 / 9;

    System.out.print("Celcius: " + celcius);

    sc.close();
  }
}
