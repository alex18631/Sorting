import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[random.nextInt(10) + 1];
        int length = mas.length;
        for (int i = 0; i < length; i++) {
            mas[i] = random.nextInt(30) + 1;
        }
        System.out.println("Кол-во элементов " + length);
        print(mas);
        System.out.println("Старт пузырьковая");
        System.out.println("Конец пузырьковой сортировки. Кол-во проходов " + пузырьковая(Arrays.copyOf(mas, mas.length)));
        System.out.println("Старт пузырьковая Улучш");
        System.out.println("Конец пузырьковая Улучш сортировки. Кол-во проходов " + пузырьковаяУлучш(Arrays.copyOf(mas, mas.length)));
        System.out.println("Старт шейкерная");
        System.out.println("Конец шейкерная сортировки. Кол-во проходов " + шейкерная(Arrays.copyOf(mas, mas.length)));
        System.out.println("Старт расчёска");
        System.out.println("Конец шейкерная сортировки. Кол-во проходов " + расчёска(Arrays.copyOf(mas, mas.length)));
    }

    public static int пузырьковая(int[] mass) {
        int result = 0;
        print(mass);
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]) {
                    int temp = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = temp;
                }
                result++;
            }
        }
        return result;
    }

    public static int пузырьковаяУлучш(int[] mass) {
        boolean k;
        int result = 0;
        print(mass);
        do {
            k = false;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]) {
                    int temp = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = temp;
                    k = true;
                }
                result++;
            }
            print(mass);
        } while (k);
        return result;
    }

    public static int шейкерная(int[] mass) {
        int result = 0;
        int left = 0;
        int right = mass.length - 1;
        print(mass);
        while (left <= right) {
            int l = 0;
            int r = 0;
            for (int i = left; i < right; i++) {
                if (mass[i] > mass[i + 1]) {
                    int temp = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = temp;
                    r = i;
                }
                result++;
            }
            if (r == 0) {
                break;
            }
            right = r;
            for (int j = right; j > left; j--) {
                if (mass[j] < mass[j - 1]) {
                    int temp = mass[j];
                    mass[j] = mass[j - 1];
                    mass[j - 1] = temp;
                    l = j;
                }
                result++;
            }
            if (l == 0) {
                break;
            }
            left = l;
            print(mass);
        }
        return result;
    }

    public static int расчёска(int[] mass) {
        return 0;
    }

    public static void print(int[] mass) {
        for (int j : mass) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}