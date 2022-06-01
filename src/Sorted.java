import java.util.Random;

public class Sorted {
    public static void main(String[] args) {

        int[] numbers = new int[6];
        Random random = new Random();

        //наивная сортировка
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
            System.out.println(numbers[i]);
        }
        for (int sorted = 0; sorted < numbers.length; sorted++) {
            int min = numbers [sorted];
            int minIndex = sorted;

            for (int i = sorted + 1; i < numbers.length; i++) {
                int current = numbers[i];
                if ( current < min) {
                    min = current;
                    minIndex= i;
                }
            }

            if (minIndex != sorted) {
                int temp = numbers[sorted];
                numbers[sorted] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
            System.out.println(numbers[sorted]);
        }
        // пузырьковая сортировка
    }
}