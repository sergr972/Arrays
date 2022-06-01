import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareEquation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        while (true) {
            System.out.println("ax^2 + bx + c = 0");

            System.out.println("Enter a:");
            double a = readDouble(reader);

            System.out.println("Enter b:");
            double b = readDouble(reader);

            System.out.println("Enter c:");
            double c = readDouble(reader);

            solveEquation(a, b, c);

            System.out.println("More? (yes/no)");
            String answer = reader.readLine();

            if (answer.equals("no") || answer.equals("n")) {
                break;
            }
        }
    }

    public static void solveEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No solutions.");
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Solutions are:" + x1 + "and" + x2 + ".");
        }
    }

    public static double readDouble(BufferedReader reader) throws IOException {
        return Double.parseDouble(reader.readLine().trim());
    }
}
