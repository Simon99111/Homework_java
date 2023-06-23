import java.util.Scanner;

public class program_2 {

    public static void main(String[] args) {
        int max_number = 1000;

        for (int i = 2; i <= max_number; i++) {
            if (Simple(i)) {
                System.out.printf(i + " ");
            }
        }
    }

    public static boolean Simple(int i){
        if (i <= 1) {
            return false;
        }

        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}