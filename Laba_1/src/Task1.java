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
            int Number = scanner.nextInt();
            int Result = (sum % 10) + (Number % 10);
            System.out.println("Сумма последних чисел данного числа и введенного: " + Result);
            sum = Result;
        }
        return sum;
    }
}