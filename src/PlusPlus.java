public class PlusPlus {
    public static void main(String[] args) {
        System.out.println("length = " + args.length);
        int i = 0;
        int x = 0;

        x = i++;
        // ==
        x = i;
        i = i + 1;

        // --------------

        x = ++i;
        // ==
        i = i +1;
        x = i;


        i++;

        for (i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        // --------------------
        // args = { "test' }
        i = 0;
        while (i < args.length) {
            System.out.println(args[i++]);

        }
    }

}
