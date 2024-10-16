import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[random.nextInt(10) + 1];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(30);
        }
        System.out.println("Старт пузырькова");
        пузырькова(mas);
        System.out.println("Старт шейкерная");
        шейкерная(mas);
        System.out.println("Старт расчёска");
        расчёска(mas);
    }

    public static void пузырькова(int[] mass) {
        boolean k;
        do {
            k = false;
            for (int i = 0; i < mass.length - 2; i++) {
                if (mass[i] > mass[i + 1]) {
                    int temp = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = temp;
                    k = true;
                    print(mass);
                    System.out.println();
                }
            }
        } while (k);
    }

    public static void шейкерная(int[] mass) {
    }

    public static void расчёска(int[] mass) {
    }

    public static void print(int[] mass) {
        for (int i = 0; i < mass.length - 1; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}