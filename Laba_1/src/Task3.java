import java.util.Random;
import java.util.Scanner;

public class Task3 {
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

        int attempt = 0;
        int guess;
        int Number;

        do {
            System.out.println("Введи число от 0 до 9");
            int Number = random.nextInt(10);
            guess = scanner.nextInt();
            attempt++;

            if (guess == Number)
                System.out.println("Вы угадали!");
            else
                System.out.println("Вы не угадали, введите число от 0 до 9:");

        } while (guess != Number);

        System.out.println("Вы отгадали число за " + attempt + " попытки");
    }
}

