import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public int sumLastNums(int x) {
        int last = x % 10;
        int prevlast = (x / 10) % 10;
        return last + prevlast;
    }

    public boolean isPositive(int x) {
        if (x > 0)
            return true;
        else
            return false;
    }

    public boolean isUpperCase(char x){
        return x >= 65 && x <= 90;
    }

    public boolean isDivisor (int a, int b) {
        if (a % b == 0 || b % a == 0)
            return true;
        else
            return false;
    }

    public int lastNumSum(int a, int b) {
        Scanner scanner = new Scanner(System.in);

        int sum = (a % 10) + (b % 10);
        System.out.println("Сумма двух последних цифр числа: " + sum);
        for(int i = 1; i < 4; i++) {
            System.out.println("Введи число: ");
            int number = scanner.nextInt();
            int result = (sum % 10) + (number % 10);
            System.out.println("Сумма последних чисел данного и введенного: ");
            System.out.println(result);
            sum = result;
        }
        return sum;
    }

    public double safeDiv(int x, int y){
        if (y == 0)
            return 0;

        return (double) x / y;
    }

    public String makeDecision(int x, int y) {
        if (x > y)
            return x + " > " + y;
        else if (x < y)
            return x + " < " + y;
        else
            return x + " == " + y;
    }

    public boolean sum3(int x, int y, int z) {
        if (x + y == z)
            return true;

        if (x + z == y)
            return true;

        return y + z == x;
    }

    public String age(int x) {
        if (x % 10 == 1 && x != 11)
            return x + " Год";

        else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x != 12 && x != 13 && x != 14))
            return x + " Года";

        else
            return x + " Лет";
    }

    public void printDays(String x) {
        switch (x) {
            case "Понедельник":
                System.out.println("Понедельник");
            case "Вторник":
                System.out.println("Вторник");
            case "Среда":
                System.out.println("Среда");
            case "Четверг":
                System.out.println("Четверг");
            case "Пятница":
                System.out.println("Пятница");
            case "Суббота":
                System.out.println("Суббота");
            case "Воскресенье":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println(("Это не день недели"));
        }
    }

    public String reverseListNums(int x) {
        String answer = "";
        for(int i = x; i >= 0; i--)
            answer = answer + i + " ";

        return answer;
    }

    public int pow(int x, int y) {
        int answer = x;
        for(int i = 1; i < y; i++)
            answer = answer * x;

        return answer;
    }

    public boolean equalNum(int x) {
        if (x < 10)
            return true;

        int last = x % 10;
        x /= 10;

        while (x > 0) {
            if (x % 10 != last)
                return false;
            x /= 10;
        }
        return true;
    }

    public void leftTriangle(int x) {
        for(int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void guessGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int Number;
        int attempt = 0;
        int guess;

        do {
            System.out.println("Введи число от 0 до 9");
            Number = random.nextInt(10);
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
            }
            else {
                System.out.println("Это не целое число");
                scanner.next();
                return;
            }
            attempt++;

            if (guess == Number)
                System.out.println("Вы угадали!");
            else
                System.out.println("Вы не угадали, введите число от 0 до 9:");

        } while (guess != Number);

        System.out.println("Вы отгадали число за " + attempt + " попытки");
    }

    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--)
            if (arr[i] == x)
                return i;

        return -1;
    }

    public int[] add(int[] arr, int x, int pos) {
        int[] New = new int[arr.length + 1];

        for(int i = 0; i < pos; i++) {
            New[i] = arr[i];
        }

        New[pos] = x;

        for(int i = pos; i < arr.length; i++) {
            New[i + 1] = arr[i];
        }

        return New;
    }

    public void reverse(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++) {
            int New = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = New;
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] Res = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++)
            Res[i] = arr1[i];

        for (int i = 0; i < arr2.length; i++)
            Res[arr1.length + i] = arr2[i];

        for(int i = 0; i < arr1.length + arr2.length; i++)
            System.out.println(Res[i]);
        return Res;
    }

    public int[] deleteNegative(int[] arr) {
        int number = 0;

        for (int Num : arr)
            if (Num >= 0)
                number++;

        int[] result = new int[number];
        int index = 0;

        for (int Num : arr)
            if (Num >= 0)
                result[index++] = Num;

        for (int j : result) {
            System.out.println(j);
        }
        return result;
    }
}