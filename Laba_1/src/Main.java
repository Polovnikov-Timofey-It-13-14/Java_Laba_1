import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Valid valid = new Valid();
        Task task = new Task();

        System.out.println("Привет, это 1 лаба по Java");
        String number;
        while (true) {
            System.out.println("Введи номер задания(1-20):");
            System.out.println("21 - Выход");
            number = scanner.nextLine();

            if (!valid.isNumber(number)) {
                System.out.println("Ошибка");
                continue;
            }

            int TaskNum = Integer.parseInt(number);
            if (TaskNum < 1 || TaskNum > 21) {
                System.out.println("Вводимый номер должен быть от 1 до 21");
                continue;
            }

            switch (TaskNum) {
                case 1:
                    System.out.println("1 Задание - Сумма двух последних цифр");
                    System.out.println("Введи число: ");
                    String task1 = scanner.nextLine();
                    if (valid.isInteger(task1)) {
                        int num1 = Integer.parseInt(task1);
                        if (Math.abs(num1) < 10) {
                            System.out.println("Число должно содержать минимум 2 цифры");
                        } else {
                            int result = task.sumLastNums(num1);
                            System.out.println("Результат: " + result);
                        }
                    } else {
                        System.out.println("Это не целое число");
                    }
                    break;

                case 2:
                    System.out.println("2 Задание - Проверка положительного числа");
                    System.out.println("Введи число: ");
                    String task2 = scanner.nextLine();
                    if (valid.isInteger(task2)) {
                        int num2 = Integer.parseInt(task2);
                        boolean isPos = task.isPositive(num2);
                        System.out.println("Результат: " + isPos);
                    } else {
                        System.out.println("Это не целое число");
                    }
                    break;

                case 3:
                    System.out.println("3 Задание - Проверка заглавной буквы");
                    System.out.println("Введи символ: ");
                    String input3 = scanner.nextLine();
                    if (input3.length() == 1) {
                        char ch = input3.charAt(0);
                        boolean isUpper = task.isUpperCase(ch);
                        System.out.println("Результат: " + isUpper);
                    } else {
                        System.out.println("Введите один символ");
                    }
                    break;

                case 4:
                    System.out.println("4 Задание - Проверка делимости");
                    System.out.println("Введи первое число: ");
                    String a4 = scanner.nextLine();
                    if (!valid.isInteger(a4)) {
                        System.out.println("Ошибка");
                        break;
                    }

                    System.out.println("Введи второе число: ");
                    String b4 = scanner.nextLine();
                    if (!valid.isInteger(b4)) {
                        System.out.println("Ошибка");
                        break;
                    }

                    int numA4 = Integer.parseInt(a4);
                    int numB4 = Integer.parseInt(b4);

                    if (numA4 == 0 && numB4 == 0) {
                        System.out.println("Ошибка: оба числа не могут быть нулями");
                        break;
                    }

                    if (numA4 == 0) {
                        System.out.println("Ошибка: первое число не может быть нулем");
                        break;
                    }

                    if (numB4 == 0) {
                        System.out.println("Ошибка: второе число не может быть нулем");
                        break;
                    }

                    boolean isDiv = task.isDivisor(numA4, numB4);
                    System.out.println("Результат: " + isDiv);
                    break;

                case 5:
                    System.out.println("5 Задание - Сумма последних цифр последовательности");
                    System.out.println("Введи первое число: ");
                    String a5 = scanner.nextLine();
                    if (!valid.isInteger(a5)) {
                        System.out.println("Ошибка");
                        break;
                    }
                    System.out.println("Введи второе число: ");
                    String b5 = scanner.nextLine();
                    if (!valid.isInteger(b5)) {
                        System.out.println("Ошибка");
                        break;
                    }

                    int numA5 = Integer.parseInt(a5);
                    int numB5 = Integer.parseInt(b5);
                    task.lastNumSum(numA5, numB5);
                    break;

                case 6:
                    System.out.println("6 Задание - Безопасное деление");
                    System.out.println("Введи первое число: ");
                    String x6 = scanner.nextLine();
                    if (!valid.isInteger(x6)) {
                        System.out.println("Ошибка");
                        break;
                    }
                    System.out.println("Введи второе число: ");
                    String y6 = scanner.nextLine();
                    if (!valid.isInteger(y6)) {
                        System.out.println("Ошибка");
                        break;
                    }
                    double divResult = task.safeDiv(Integer.parseInt(x6), Integer.parseInt(y6));
                    System.out.println("Результат: " + divResult);
                    break;

                case 7:
                    System.out.println("7 Задание - Сравнение чисел");
                    System.out.println("Введи первое число: ");
                    String x7 = scanner.nextLine();
                    if (!valid.isInteger(x7)) {
                        System.out.println("Ошибка");
                        break;
                    }
                    System.out.println("Введи второе число: ");
                    String y7 = scanner.nextLine();
                    if (!valid.isInteger(y7)) {
                        System.out.println("Ошибка");
                        break;
                    }
                    String decision = task.makeDecision(Integer.parseInt(x7), Integer.parseInt(y7));
                    System.out.println("Результат: " + decision);
                    break;

                case 8:
                    System.out.println("8 Задание - Проверка суммы трех чисел");
                    System.out.println("Введи первое число: ");
                    String x8 = scanner.nextLine();
                    if (!valid.isInteger(x8)) {
                        System.out.println("Ошибка");
                        break;
                    }
                    System.out.println("Введи второе число: ");
                    String y8 = scanner.nextLine();
                    if (!valid.isInteger(y8)) {
                        System.out.println("Ошибка");
                        break;
                    }
                    System.out.println("Введи третье число: ");
                    String z8 = scanner.nextLine();
                    if (!valid.isInteger(z8)) {
                        System.out.println("Ошибка");
                        break;
                    }
                    boolean sum3Result = task.sum3(Integer.parseInt(x8), Integer.parseInt(y8), Integer.parseInt(z8));
                    System.out.println("Результат: " + sum3Result);
                    break;

                case 9:
                    System.out.println("9 Задание - Форма возраста");
                    System.out.println("Введи возраст: ");
                    String ageStr = scanner.nextLine();
                    if (valid.isInteger(ageStr)) {
                        int age = Integer.parseInt(ageStr);
                        if (age < 0) {
                            System.out.println("Возраст не может быть отрицательным");
                        } else {
                            String ageResult = task.age(age);
                            System.out.println("Результат: " + ageResult);
                        }
                    } else {
                        System.out.println("Это не целое число");
                    }
                    break;

                case 10:
                    System.out.println("10 Задание - Дни недели");
                    System.out.println("Введи день недели: ");
                    String day = scanner.nextLine();
                    task.printDays(day);
                    break;

                case 11:
                    System.out.println("11 Задание - Обратная последовательность");
                    System.out.println("Введи число: ");
                    String num11 = scanner.nextLine();
                    if (valid.isInteger(num11)) {
                        String reverseSeq = task.reverseListNums(Integer.parseInt(num11));
                        System.out.println("Результат: " + reverseSeq);
                    } else {
                        System.out.println("Это не целое число");
                    }
                    break;

                case 12:
                    System.out.println("12 Задание - Возведение в степень");
                    System.out.println("Введи число: ");
                    String baseStr = scanner.nextLine();
                    if (!valid.isInteger(baseStr)) {
                        System.out.println("Ошибка");
                        break;
                    }
                    System.out.println("Введи степень: ");
                    String exponentStr = scanner.nextLine();
                    if (!valid.isInteger(exponentStr)) {
                        System.out.println("Ошибка");
                        break;
                    }
                    int powerResult = task.pow(Integer.parseInt(baseStr), Integer.parseInt(exponentStr));
                    System.out.println("Результат: " + powerResult);
                    break;

                case 13:
                    System.out.println("13 Задание - Одинаковые цифры");
                    System.out.println("Введи число: ");
                    String num13 = scanner.nextLine();
                    if (valid.isInteger(num13)) {
                        boolean equalResult = task.equalNum(Integer.parseInt(num13));
                        System.out.println("Результат: " + equalResult);
                    } else {
                        System.out.println("Это не целое число");
                    }
                    break;

                case 14:
                    System.out.println("14 Задание - Левый треугольник");
                    System.out.println("Введи размер: ");
                    String sizeStr = scanner.nextLine();
                    if (valid.isInteger(sizeStr)) {
                        int size = Integer.parseInt(sizeStr);
                        if (size <= 0) {
                            System.out.println("Размер должен быть положительным");
                        } else {
                            task.leftTriangle(size);
                        }
                    } else {
                        System.out.println("Это не целое число");
                    }
                    break;

                case 15:
                    System.out.println("15 Задание - Угадай число");
                    task.guessGame();
                    break;

                case 16:
                    System.out.println("16 Задание - Поиск последнего вхождения");
                    System.out.println("Введите количество элементов массива: ");
                    String count16Str = scanner.nextLine();
                    if (!valid.isInteger(count16Str) || Integer.parseInt(count16Str) < 0) {
                        System.out.println("Количество элементов должно быть неотрицательным целым числом");
                        break;
                    }
                    int count16 = Integer.parseInt(count16Str);

                    if (count16 == 0) {
                        System.out.println("Массив пуст");
                        break;
                    }

                    int[] arr16 = new int[count16];
                    for (int i = 0; i < count16; i++) {
                        System.out.println("Введите элемент " + (i + 1) + ": ");
                        String element = scanner.nextLine();
                        if (!valid.isInteger(element)) {
                            System.out.println("Элемент не целое число");
                            i--; // Повторяем ввод этого элемента
                            continue;
                        }
                        arr16[i] = Integer.parseInt(element);
                    }

                    System.out.println("Введите число для поиска: ");
                    String search16Str = scanner.nextLine();
                    if (!valid.isInteger(search16Str)) {
                        System.out.println("Число для поиска не целое");
                        break;
                    }
                    int foundIndex = task.findLast(arr16, Integer.parseInt(search16Str));
                    System.out.println("Результат: " + foundIndex);
                    break;

                case 17:
                    System.out.println("17 Задание - Добавление элемента в массив");
                    System.out.println("Введите количество элементов массива: ");
                    String count17Str = scanner.nextLine();
                    if (!valid.isInteger(count17Str) || Integer.parseInt(count17Str) < 0) {
                        System.out.println("Количество элементов должно быть неотрицательным целым числом");
                        break;
                    }
                    int count17 = Integer.parseInt(count17Str);

                    int[] arr17 = new int[count17];
                    for (int i = 0; i < count17; i++) {
                        System.out.println("Введите элемент " + (i + 1) + ": ");
                        String element = scanner.nextLine();
                        if (!valid.isInteger(element)) {
                            System.out.println("Элемент не целое число");
                            i--;
                            continue;
                        }
                        arr17[i] = Integer.parseInt(element);
                    }

                    System.out.println("Введите число для добавления: ");
                    String addNumStr = scanner.nextLine();
                    if (!valid.isInteger(addNumStr)) {
                        System.out.println("Число для добавления не целое");
                        break;
                    }
                    System.out.println("Введите позицию: ");
                    String posStr = scanner.nextLine();
                    if (!valid.isInteger(posStr)) {
                        System.out.println("Позиция не целая");
                        break;
                    }
                    int pos = Integer.parseInt(posStr);
                    if (pos < 0 || pos > arr17.length) {
                        System.out.println("Позиция должна быть от 0 до " + arr17.length);
                        break;
                    }
                    int[] newArr = task.add(arr17, Integer.parseInt(addNumStr), pos);
                    System.out.println("Новый массив: " + Arrays.toString(newArr));
                    break;

                case 18:
                    System.out.println("18 Задание - Разворот массива");
                    System.out.println("Введите количество элементов массива: ");
                    String count18Str = scanner.nextLine();
                    if (!valid.isInteger(count18Str) || Integer.parseInt(count18Str) < 0) {
                        System.out.println("Количество элементов должно быть неотрицательным целым числом");
                        break;
                    }
                    int count18 = Integer.parseInt(count18Str);

                    if (count18 == 0) {
                        System.out.println("Массив пуст");
                        break;
                    }

                    int[] arr18 = new int[count18];
                    for (int i = 0; i < count18; i++) {
                        System.out.println("Введите элемент " + (i + 1) + ": ");
                        String element = scanner.nextLine();
                        if (!valid.isInteger(element)) {
                            System.out.println("Элемент не целое число");
                            i--; // Повторяем ввод этого элемента
                            continue;
                        }
                        arr18[i] = Integer.parseInt(element);
                    }
                    task.reverse(arr18);
                    break;

                case 19:
                    System.out.println("19 Задание - Объединение массивов");

                    System.out.println("Введите количество элементов первого массива: ");
                    String count19_1Str = scanner.nextLine();
                    if (!valid.isInteger(count19_1Str) || Integer.parseInt(count19_1Str) < 0) {
                        System.out.println("Количество элементов должно быть неотрицательным целым числом");
                        break;
                    }
                    int count19_1 = Integer.parseInt(count19_1Str);

                    int[] arr19_1 = new int[count19_1];
                    for (int i = 0; i < count19_1; i++) {
                        System.out.println("Введите элемент " + (i + 1) + " первого массива: ");
                        String element = scanner.nextLine();
                        if (!valid.isInteger(element)) {
                            System.out.println("Элемент не целое число");
                            i--; // Повторяем ввод этого элемента
                            continue;
                        }
                        arr19_1[i] = Integer.parseInt(element);
                    }

                    // Второй массив
                    System.out.println("Введите количество элементов второго массива: ");
                    String count19_2Str = scanner.nextLine();
                    if (!valid.isInteger(count19_2Str) || Integer.parseInt(count19_2Str) < 0) {
                        System.out.println("Количество элементов должно быть неотрицательным целым числом");
                        break;
                    }
                    int count19_2 = Integer.parseInt(count19_2Str);

                    int[] arr19_2 = new int[count19_2];
                    for (int i = 0; i < count19_2; i++) {
                        System.out.println("Введите элемент " + (i + 1) + " второго массива: ");
                        String element = scanner.nextLine();
                        if (!valid.isInteger(element)) {
                            System.out.println("Элемент не целое число");
                            i--; // Повторяем ввод этого элемента
                            continue;
                        }
                        arr19_2[i] = Integer.parseInt(element);
                    }

                    task.concat(arr19_1, arr19_2);
                    break;

                case 20:
                    System.out.println("20 Задание - Удаление отрицательных чисел");
                    System.out.println("Введите количество элементов массива: ");
                    String count20Str = scanner.nextLine();
                    if (!valid.isInteger(count20Str) || Integer.parseInt(count20Str) < 0) {
                        System.out.println("Количество элементов должно быть неотрицательным целым числом");
                        break;
                    }
                    int count20 = Integer.parseInt(count20Str);

                    if (count20 == 0) {
                        System.out.println("Массив пуст");
                        break;
                    }

                    int[] arr20 = new int[count20];
                    for (int i = 0; i < count20; i++) {
                        System.out.println("Введите элемент " + (i + 1) + ": ");
                        String element = scanner.nextLine();
                        if (!valid.isInteger(element)) {
                            System.out.println("Элемент не целое число");
                            i--; // Повторяем ввод этого элемента
                            continue;
                        }
                        arr20[i] = Integer.parseInt(element);
                    }
                    task.deleteNegative(arr20);
                    break;

                case 21:
                    System.out.println("Выход");
                    System.exit(0);
            }
        }
    }
}
