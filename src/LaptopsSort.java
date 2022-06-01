import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class LaptopsSort {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in); не удобен для построчного ввода
        BufferedReader reader = new BufferedReader(
                new FileReader("laptops.csv"));

        reader.readLine();
        Laptop[] allLaptops = new Laptop[100];
        int laptopCount = 0;

        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }

            String[] cells = line.split(",");
            if (cells.length == 2) {
                String title = cells[0];
                int price = Integer.parseInt(cells[1].trim());

                Laptop laptop = new Laptop();
                laptop.title = title;
                laptop.price = price;

                allLaptops[laptopCount++] = laptop;
//                laptopCount++;
            }
        }

        allLaptops = Arrays.copyOf(allLaptops, laptopCount);

        System.out.println("Loaded " + laptopCount + " items.");
//        System.out.println(Arrays.toString(allLaptops));
        for (int i = 0; i < laptopCount; ++i) {
            System.out.println(allLaptops[i]);
        }
        System.out.println("==== Before ====");
        for (Laptop laptop : allLaptops) {
            System.out.println(laptop);
        }

        Arrays.sort(allLaptops, (o1, o2) -> o1.price - o2.price);

        System.out.println("==== Sorted: ====");

        for (Laptop laptop : allLaptops) {
            System.out.println(laptop);
        }
    }
}

class Laptop {
    String title;
    int price;

    @Override
    public String toString() {
        return "Laptop{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}