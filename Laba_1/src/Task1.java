import java.util.Random;
import java.util.Scanner;

public class Task {
    Valid valid = new Valid();
    public int sumLastNums(int x) {
        int absX = Math.abs(x);
        int lastDigit = absX % 10;
        int secondLastDigit = (absX / 10) % 10;
        return lastDigit + secondLastDigit;
    }

    public boolean isPositive(int x) {
        return x > 0;
    }

    public boolean isUpperCase(char x) {
        return x >= 65 && x <= 90;
    }

    public boolean isDivisor(int a, int b) {
        return a % b == 0 || b % a == 0;
    }

    public int lastNumSum(int a, int b) {
        Scanner scanner = new Scanner(System.in);

        int sum = (Math.abs(a) % 10) + (Math.abs(b) % 10);
        System.out.println(a + "+" + b + " это " + sum);

        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.println("Введи число: ");
                String input = scanner.nextLine();

                if (!valid.isInteger(input)) {
                    System.out.println("Ошибка: введите целое число");
                    continue;
                }

                int number = Integer.parseInt(input);
                sum = (sum % 10) + (Math.abs(number) % 10);
                System.out.println(sum + "+" + number + " это " + sum);
                break;
            }
        }

        System.out.println("Итого " + sum);
        return sum;
    }

    public double safeDiv(int x, int y) {
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
            return x + " год";

        else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x != 12 && x != 13 && x != 14))
            return x + " года";

        else
            return x + " лет";
    }

    public void printDays(String x) {
        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("Понедельник");
            case "вторник":
                System.out.println("Вторник");
            case "среда":
                System.out.println("Среда");
            case "четверг":
                System.out.println("Четверг");
            case "пятница":
                System.out.println("Пятница");
            case "суббота":
                System.out.println("Суббота");
            case "воскресенье":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println(("Это не день недели"));
        }
    }

    public String reverseListNums(int x) {
        String answer = "";
        if (x >= 0) {
            for (int i = x; i >= 0; i--)
                answer = answer + i + " ";
        } else {
            for (int i = x; i <= 0; i++)
                answer = answer + i + " ";
        }
        return answer.trim();
    }

    public int pow(int x, int y) {
        if (y < 0) {
            throw new IllegalArgumentException("Ошибка: отрицательная степень");
        }

        if (y == 0) {
            return 1;
        }

        int answer = x;
        for (int i = 1; i < y; i++)
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
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void guessGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Valid valid = new Valid();

        int Number = random.nextInt(10);
        int attempt = 0;

        while (true) {
            System.out.println("Введи число от 0 до 9:");
            String input = scanner.nextLine();
            attempt++;

            if (!valid.isInteger(input)) {
                System.out.println("Ошибка");
                attempt--;
                continue;
            }

            int guess = Integer.parseInt(input);

            if (guess < 0 || guess > 9) {
                System.out.println("Ошибка: число должно быть от 0 до 9");
                attempt--;
                continue;
            }

            if (guess == Number) {
                System.out.println("Вы угадали!");
                break;
            } else {
                System.out.println("Вы не угадали, попробуйте еще раз:");
            }
        }
        System.out.println("Количество попыток: " + attempt);
    }

    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--)
            if (arr[i] == x)
                return i;

        return -1;
    }

    public int[] add(int[] arr, int x, int pos) {
        int[] New = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            New[i] = arr[i];
        }

        New[pos] = x;

        for (int i = pos; i < arr.length; i++) {
            New[i + 1] = arr[i];
        }

        return New;
    }

    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int New = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = New;
        }

        System.out.print("Результат: arr = [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++)
            res[i] = arr1[i];

        for (int i = 0; i < arr2.length; i++)
            res[arr1.length + i] = arr2[i];

        System.out.print("результат: arr=[");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if (i < res.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        return res;
    }

    public int[] deleteNegative(int[] arr) {
        int number = 0;

        for (int num : arr)
            if (num >= 0)
                number++;

        int[] result = new int[number];
        int index = 0;

        for (int num : arr)
            if (num >= 0)
                result[index++] = num;

        System.out.print("результат: arr=[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        return result;
    }
}
