public class PatternConsoleSeven {
    public static void main(String [] args) {
        int size = 6;

        for(int i = size; i != 0; i--) {
            for(int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }

            for(int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            if(i != 1) {
                System.out.println();
            }
        }
    }
}