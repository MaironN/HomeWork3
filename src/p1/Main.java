package p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        System.out.print("Введите число для действия от 1 до 4: ");
        int z = scanner.nextInt();
        if (z==1) {
            int k = x + y;
            System.out.printf("Сумма: %d\n", k);
        } else if (z==2) {
            int j = x - y;
            System.out.printf("Разность: %d\n", j);;
        } else if (z==3) {
            int s = x * y;
            System.out.printf("Произведение: %d\n", s);;
        } else if (z==4) {
            int h = x / y;
            System.out.printf("Частное: %d\n", h);;
        }

        scanner.close();
    }


}