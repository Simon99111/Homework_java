import java.util.Scanner;

public class program_3 {
    public static void main(String[] args) {
        double itog = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите число A: ");
        double a = sc.nextInt();
        System.out.println("Ведите действие: ");
        char symbol = sc.next().charAt(0);
        System.out.println("Ведите число B: ");
        double b = sc.nextInt();

        if (symbol == '+') {
            itog = a + b;
        }
        else if (symbol == '-') {
            itog = a - b;
        }
        else if (symbol == '*') {
            itog = a * b;
        }
        else if (symbol == '/') {
            itog = a / b;
        }

        System.out.println("Значение = " + itog);
    }
}
