import java.util.Scanner;

/**
 * program_1
 */
public class program_1 {

    public static void main(String[] args) {
        int summa_n = 0;
        int product_n = 1;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ведите n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            summa_n = summa_n + i;
        }
        for (int j = 1; j < n + 1; j++) {
            product_n = product_n * j;
        }
        System.out.println("Сумма чисел от 1 до n = " + summa_n);
        System.out.println("Произведение чисел от 1 до n = " + product_n);
    }
}