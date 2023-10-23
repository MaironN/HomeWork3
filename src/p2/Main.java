package p2;

public class Main {


    public static void main(String[] args) {

        int positiveCount, negativeCount, zeroCount;
        positiveCount = negativeCount = zeroCount = 0;

        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 101) - 50);
            System.out.println("Элементы массива: " + (arr[i]));
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                positiveCount++;
            else if (arr[i] < 0)
                negativeCount++;
            else if (arr[i] == 0)
                zeroCount++;
        }
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
        System.out.println("Количество нулей: " + zeroCount);

        int positiveSum, negativeSum;
        positiveSum = negativeSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                positiveSum += arr[i];
            else if (arr[i] < 0)
                negativeSum += arr[i];
        }
        System.out.println("Сумма положительных чисел: " + positiveSum);
        System.out.println("Сумма отрицательных чисел: " + negativeSum);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;

        System.out.println("Среднее: " + average);
    }
}









