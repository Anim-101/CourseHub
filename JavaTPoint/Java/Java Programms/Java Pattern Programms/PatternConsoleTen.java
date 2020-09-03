public class PatternConsoleTen {
    public static void main(String [] args) {
        int n = 9;

        int num = 0;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                num++;

                System.out.print(num);

                System.out.print(" ");
            }

            if(i < n) {
                System.out.println();
            }
        }
    }
}