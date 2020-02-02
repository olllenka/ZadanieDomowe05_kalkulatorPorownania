import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Calculator calc1 = new Calculator();

        System.out.println("Podaj dwie liczby");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result = calc1.calculation(a,b);
        sc.close();
    }
}
