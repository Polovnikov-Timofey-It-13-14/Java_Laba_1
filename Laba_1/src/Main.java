import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task1 tasks1 = new Task1();
        Task2 tasks2 = new Task2();
        Task3 tasks3 = new Task3();
        Task4 tasks4 = new Task4();

        System.out.println("Привет, это 1 лаба по Java");
        System.out.println("Какое задание выполнить (1-20)?");
        int NumTask = -1;
        if (scanner.hasNextInt()) {
            NumTask = scanner.nextInt();
        }
        else {
            System.out.println("Это не целое число");
            scanner.next();
            return;
        }

        switch (NumTask) {
            case 1:
                System.out.println("1 Задание");
                System.out.println("Введи число: ");
                int task1 = -1;
                if (scanner.hasNextInt()) {
                    task1 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }
                System.out.println("Результат: " + tasks1.sumLastNums(task1));
                System.exit(0);
            case 2:
                System.out.println("2 Задание");
                System.out.println("Введи число: ");
                int task2 = -1;
                if (scanner.hasNextInt()) {
                    task2 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }
                System.out.println("Результат: " + tasks1.isPositive(task2));
                System.exit(0);
            case 3:
                System.out.println("3 Задание");
                System.out.println("Введи символ: ");

                scanner.nextLine();

                char task3;
                while (true) {
                    String input = scanner.nextLine();
                    if (input.length() == 1) {
                        task3 = input.charAt(0);
                        break;
                    }
                    System.out.println("Ошибка!");
                }

                System.out.println("Результат: " + tasks1.isUpperCase(task3));
                System.exit(0);
            case 4:
                System.out.println("4 Задание");
                System.out.println("Введи число 1: ");
                int Atask4 = -1;
                if (scanner.hasNextInt()) {
                    Atask4 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                System.out.println("Введи число 2: ");
                int Btask4 = -1;
                if (scanner.hasNextInt()) {
                    Btask4 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }
                System.out.println("Результат: " + tasks1.isDivisor(Atask4, Btask4));
                System.exit(0);
            case 5:
                System.out.println("5 Задание");
                System.out.println("Введи 1 число");
                int Atask5 = -1;
                if (scanner.hasNextInt()) {
                    Atask5 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                System.out.println("Введи 2 число");
                int Btask5 = -1;
                if (scanner.hasNextInt()) {
                    Btask5 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }
                System.out.println(tasks1.lastNumSum(Atask5, Btask5));
                System.exit(0);
            case 6:
                System.out.println("6 Задание");
                System.out.println("Введи 1 число");
                int Atask6 = -1;
                if (scanner.hasNextInt()) {
                    Atask6 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                System.out.println("Введи 2 число");
                int Btask6 = -1;
                if (scanner.hasNextInt()) {
                    Btask6 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }
                System.out.println("Результат: " + tasks2.safeDiv(Atask6, Btask6));
                System.exit(0);
            case 7:
                System.out.println("7 Задание");
                System.out.println("Введи 1 число");
                int Atask7 = -1;
                if (scanner.hasNextInt()) {
                    Atask7 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                System.out.println("Введи 2 число");
                int Btask7 = -1;
                if (scanner.hasNextInt()) {
                    Btask7 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }
                System.out.println("Результат: " + tasks2.makeDecision(Atask7, Btask7));
                System.exit(0);
            case 8:
                System.out.println("8 Задание");
                System.out.println("Введи 1 число");
                int Atask8 = -1;
                if (scanner.hasNextInt()) {
                    Atask8 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                System.out.println("Введи 2 число");
                int Btask8 = -1;
                if (scanner.hasNextInt()) {
                    Btask8 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                System.out.println("Введи 3 число");
                int Ctask8 = -1;
                if (scanner.hasNextInt()) {
                    Ctask8 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                System.out.println("Результат: " + tasks2.sum3(Atask8, Btask8, Ctask8));
                System.exit(0);
            case 9:
                System.out.println("9 Задание");
                System.out.println("Введи 1 число");
                int task9 = -1;
                if (scanner.hasNextInt()) {
                    task9 = scanner.nextInt();
                    if (task9 < 1){
                        System.out.println("Отрицательное число");
                        System.exit(0);
                    }
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }
                System.out.println("Результат: " + tasks2.age(task9));
                System.exit(0);
            case 10:
                System.out.println("10 Задание");
                System.out.println("Введи день недели");
                String task10 = scanner.next();
                tasks2.printDays(task10);
                System.exit(0);
            case 11:
                System.out.println("11 Задание");
                System.out.println("Введи 1 число");
                int task11 = -1;
                if (scanner.hasNextInt()) {
                    task11 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }
                System.out.println("Результат: " + tasks3.reverseListNums(task11));
                System.exit(0);
            case 12:
                System.out.println("12 Задание");
                System.out.println("Введи 1 число");
                int Atask12 = -1;
                if (scanner.hasNextInt()) {
                    Atask12 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                System.out.println("Введи 2 число");
                int Btask12 = -1;
                if (scanner.hasNextInt()) {
                    Btask12 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }
                System.out.println("Результат: " + tasks3.pow(Atask12, Btask12));
                System.exit(0);
            case 13:
                System.out.println("13 Задание");
                System.out.println("Введи 1 число");
                int task13 = -1;
                if (scanner.hasNextInt()) {
                    task13 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }
                System.out.println("Результат: " + tasks3.equalNum(task13));
                System.exit(0);
            case 14:
                System.out.println("14 Задание");
                System.out.println("Введи 1 число");
                int task14 = -1;
                if (scanner.hasNextInt()) {
                    task14 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                tasks3.leftTriangle(task14);
                System.exit(0);
            case 15:
                System.out.println("15 Задание");
                tasks3.guessGame();
                System.exit(0);
            case 16:
                System.out.println("16 Задание");
                System.out.println("Какой размер массива?");
                int size16 = -1;
                if (scanner.hasNextInt()) {
                    size16 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                int[] arr16 = new int[size16];
                for(int i = 0; i < size16; i++)
                    arr16[i] =  scanner.nextInt();
                System.out.println("Введи 1 число");
                int task16 = -1;
                if (scanner.hasNextInt()) {
                    task16 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }
                System.out.println("Результат: " + tasks4.findLast(arr16, task16));
                System.exit(0);
            case 17:
                System.out.println("17 Задание");
                System.out.println("Какой размер массива?");
                int size17 = -1;
                if (scanner.hasNextInt()) {
                    size17 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                int[] arr17 = new int[size17];
                System.out.println("Введите числа массива");
                for(int i = 0; i < size17; i++) {
                    if (scanner.hasNextInt()) {
                        arr17[i] = scanner.nextInt();
                    }
                    else {
                        System.out.println("Это не целое число");
                        scanner.next();
                        return;
                    }
                }

                System.out.println("Введи 1 число");
                int Atask17 = -1;
                if (scanner.hasNextInt()) {
                    Atask17 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                System.out.println("Введи 2 число");
                int Btask17 = -1;
                if (scanner.hasNextInt()) {
                    Btask17 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                System.out.println("Результат: " + Arrays.toString(tasks4.add(arr17, Atask17, Btask17)));
                System.exit(0);
            case 18:
                System.out.println("18 Задание");
                System.out.println("Какой размер массива?");
                int size18 = -1;
                if (scanner.hasNextInt()) {
                    size18 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                int[] arr18 = new int[size18];
                System.out.println("Введи числа в массив");
                for(int i = 0; i < size18; i++){
                    if (scanner.hasNextInt()) {
                        arr18[i] = scanner.nextInt();
                    }
                    else {
                        System.out.println("Это не целое число");
                        scanner.next();
                        return;
                    }
                }
                tasks4.reverse(arr18);
                System.exit(0);
            case 19:
                System.out.println("19 Задание");
                System.out.println("Какой размер массива?");
                int Asize19 = -1;
                if (scanner.hasNextInt()) {
                    Asize19 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }
                int[] Aarr19 = new int[Asize19];
                System.out.println("Введи числа в массив");
                for(int i = 0; i < Asize19; i++){
                    if (scanner.hasNextInt()) {
                        Aarr19[i] = scanner.nextInt();
                    }
                    else {
                        System.out.println("Это не целое число");
                        scanner.next();
                        return;
                    }
                }

                System.out.println("Какой размер массива?");
                int Bsize19 = -1;
                if (scanner.hasNextInt()) {
                    Bsize19 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }
                int[] Barr19 = new int[Bsize19];
                System.out.println("Введи числа в массив");
                for(int i = 0; i < Bsize19; i++){
                    if (scanner.hasNextInt()) {
                        Barr19[i] = scanner.nextInt();
                    }
                    else {
                        System.out.println("Это не целое число");
                        scanner.next();
                        return;
                    }
                }

                tasks4.concat(Aarr19, Barr19);
                System.exit(0);


            case 20:
                System.out.println("20 Задание");
                System.out.println("Какой размер массива?");
                int size20 = -1;
                if (scanner.hasNextInt()) {
                    size20 = scanner.nextInt();
                }
                else {
                    System.out.println("Это не целое число");
                    scanner.next();
                    return;
                }

                int[] arr20 = new int[size20];
                System.out.println("Введи числа в массив");
                for(int i = 0; i < size20; i++){
                    if (scanner.hasNextInt()) {
                        arr20[i] = scanner.nextInt();
                    }
                    else {
                        System.out.println("Это не целое число");
                        scanner.next();
                        return;
                    }
                }

                tasks4.deleteNegative(arr20);
                System.exit(0);
            default:
                System.out.println("Введено что-то не то");
                break;
        }
    }
}