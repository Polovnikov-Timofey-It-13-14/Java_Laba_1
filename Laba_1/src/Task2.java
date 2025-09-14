public class Task2 {
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
            return x + " год";

        else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x != 12 && x != 13 && x != 14))
            return x + " года";

        else
            return x + " лет";
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
}
