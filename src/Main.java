import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int [] array = new int[] {1, 2, 3};
        double [] array2 = {1.57, 7.654, 9.986};
        int [] array3 = {1, 2, 3, 4, 5};
        System.out.println("\n");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int [] array = new int[] {1, 2, 3};
        System.out.println(array[0] + ", " + array[1] + ", " + array[2]);
        double [] array2 = {1.57, 7.654, 9.986};
        System.out.println(array2[0] + ", " + array2[1] + ", " + array2[2]);
        int [] array3 = {1, 2, 3, 4, 5};
        System.out.println(array3[0] + ", " + array3[1] + ", " + array[2] + ", " + array3[3] + ", " + array3[4]);
        System.out.println("\n");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int [] array = new int[] {1, 2, 3};
        System.out.println(array[2] + ", " + array[1] + ", " + array[0]);
        double [] array2 = {1.57, 7.654, 9.986};
        System.out.println(array2[2] + ", " + array2[1] + ", " + array2[0]);
        int [] array3 = {1, 2, 3, 4, 5};
        System.out.println(array3[4] + ", " + array3[3] + ", " + array[2] + ", " + array3[1] + ", " + array3[0]);
        System.out.println("\n");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int [] array = new int[] {1, 2, 3};
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("\n");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int[ ] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("\n");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int[ ] arr = generateRandomArray();
        int minSum = arr[0];
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (minSum < arr[i]) {
                minSum += arr[i];
            }
            if (maxSum > arr[i]) {
                maxSum += arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum+ " рублей");
        System.out.println("\n");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int[ ] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double aveSum = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + aveSum + " рублей");
        System.out.println("\n");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0, j = reverseFullName.length - 1;i < j; i++, j--){
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[j];
            reverseFullName[j] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));
        System.out.println("\n");
    }
}