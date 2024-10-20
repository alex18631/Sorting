import sorting.BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[random.nextInt(100) + 1];
        int length = mas.length;
        for (int i = 0; i < length; i++) {
            mas[i] = random.nextInt(30) + 1;
        }
        System.out.println("Кол-во элементов " + length);
        System.out.println("Старт пузырьковая");
        System.out.println("Конец пузырьковой сортировки. Кол-во операций " + BubbleSort.bubble(Arrays.copyOf(mas, mas.length)));
        System.out.println("Старт пузырьковая Улучш");
        System.out.println("Конец пузырьковая Улучш сортировки. Кол-во операций " + BubbleSort.bubbleUpgrade(Arrays.copyOf(mas, mas.length)));
        System.out.println("Старт шейкерная");
        System.out.println("Конец шейкерная сортировки. Кол-во операций " + BubbleSort.shaker(Arrays.copyOf(mas, mas.length)));
        System.out.println("Старт расчёска");
        System.out.println("Конец шейкерная сортировки. Кол-во операций " + BubbleSort.comb(Arrays.copyOf(mas, mas.length)));
    }
}