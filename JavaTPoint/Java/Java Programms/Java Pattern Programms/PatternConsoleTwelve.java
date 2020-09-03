public class PatternConsoleTwelve {
    public static void main(String [] args) {
        int size = 5;
        
        for(int i = 0; i < size + 1; i++) {
            for(int j = size; j > i; j--) {
                System.out.print(" ");
            }

            for(int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            if(i < size) {
                System.out.println();
            }
        }

    }
}