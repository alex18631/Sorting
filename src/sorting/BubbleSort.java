package sorting;

import static utils.Print.print;

public class BubbleSort {

    public static int bubble(int[] mass) {
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

    public static int bubbleUpgrade(int[] mass) {
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

    public static int shaker(int[] mass) {
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

    public static int comb(int[] mass) {
        double reductionFactor = 1.25;
        int nextValue = mass.length - 1;
        int result = 0;
        print(mass);
        while (nextValue >= 1) {
            for (int i = 0; i + nextValue < mass.length; i++) {
                if (mass[i] > mass[i + nextValue]) {
                    int temp = mass[i];
                    mass[i] = mass[i + nextValue];
                    mass[i + nextValue] = temp;
                }
                result++;
            }
            nextValue = (int) (nextValue / reductionFactor);
            print(mass);
        }
        return result;
    }
}
