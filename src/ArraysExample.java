import java.util.Arrays;

public class ArraysExample {
    private int size;

    public static void main(String[] args) {
        System.out.println(11);
        System.out.println("test");
        System.out.println(true);
        System.out.println(new ArraysExample());
        System.out.println(Arrays.toString(args));
        System.out.println((Object)null);
        System.out.println(Arrays.toString(new int[10]));
        System.out.println(Arrays.toString(new ArraysExample[10]));

        int x = 0; // null нельзя присвоить
        String text = null;
        ArraysExample test = new ArraysExample(); //new зачищает массив
        ArraysExample test2 = null;

        ArraysExample[] array  = new ArraysExample[10];
        array[3] = new ArraysExample();
        System.out.println(Arrays.toString(array));
    }

    @Override
    public String toString() {
        return "ArrayExample(size = " + size+ ")";
    }
}
