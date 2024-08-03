import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. printThreeWords();
        // 2. checkSumSign();
        // 3. printColor();
        // 4. compareNumbers();
        // 5. System.out.println(isFrom10To20Included(10, 10));
        // 6. isPositive(-1);
        // 7. System.out.println(isPositiveNotVoid(-1));
        // 8. printStringXTimes("Печатай", 5);
        // 9. System.out.println(isLeapYear(2001));
        // 10. reversingBinaryArray();
        // 11. fillingEmptyArray();
        // 12. randomNumbersArray();
        // 13. diagonallyInsertedNumbersInArray();
        // 14. sameNumbersArray(3, 7);
    }
    // 1. Создайте метод printThreeWords()
    private static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
    // 2. Создайте метод checkSumSign()
    private static void checkSumSign() {
        int a = 2;
        int b = 3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // 3. Создайте метод printColor()
    private static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    // 4. Создайте метод compareNumbers()
    private static void compareNumbers() {
        int a = 5;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    // 5. Напишите метод
    private static boolean isFrom10To20Included(int a, int b) {
        boolean result;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    // 6. Напишите метод
    private static void isPositive(int a) {
        String result;
        if (a >= 0) {
            result = "Положительное число";
        } else {
            result = "Отрицательное число";
        }
        System.out.println(result);
    }
    // 7. Напишите метод
    private static boolean isPositiveNotVoid(int a) {
        boolean result;
        if (a >= 0) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }
    // 8. Напишите метод
    private static void printStringXTimes(String letters, int a) {
        if (a > 0) {
            int i = 0;
            while (i < a) {
                System.out.println(letters);
                ++i;
            }
        }
    }
    // 9. Напишите метод
    private static boolean isLeapYear(int year) {
        boolean result;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    // 10.
    private static void reversingBinaryArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int i = 0;
        while (i < array.length) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            ++i;
        }
        System.out.println(Arrays.toString(array));
    }
    // 11.
    private static void fillingEmptyArray() {
        int[] array = new int[100];
        int i = 0;
        while (i < array.length) {
            array[i] = i + 1;
            ++i;
        }
        System.out.println(Arrays.toString(array));
    }
    // 12.
    private static void randomNumbersArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i = 0;
        while (i < array.length) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
            ++i;
        }
        System.out.println(Arrays.toString(array));
    }
    // 13.
    private static void diagonallyInsertedNumbersInArray() {
        int n = 7; // can change only this variable
        int[][] array = new int[n][n];
        for(int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if ((i == j) || (i + j == n - 1)) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
    // 14.
    private static void sameNumbersArray(int len, int initialValue) {
        int[] array = new int[len];
        int i = 0;
        while (i < len) {
            array[i] = initialValue;
            ++i;
        }
        System.out.println(Arrays.toString(array));
    }

}