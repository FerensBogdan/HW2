import java.util.Random;
public class OArray {

    public int[] initArray (int[] list) {
        list = new int[20];
        Random rand = new Random();

        for (int i=0; i < list.length; i++) {
            list[i] = rand.nextInt(30);
            System.out.print(list[i] + " ");
        }
        System.out.println("");
        return list;
    }

    public int getMinElemArray (int[] list) {
        int minValue = list[0];

        for (int elem: list) {
            if (minValue > elem) {
                minValue = elem;
            }
        }
        return minValue;
    }

    public int getMaxElemArray (int[] list) {
        int maxValue = list[0];

        for (int elem: list) {

            if (maxValue < elem) {
                maxValue = elem;
            }
        }
        return maxValue;
    }

    public int[] incBubbleSort (int[] list) {
        int i, j, temp;
        for (i = 0; i < list.length - 1; i++) {
            for (j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        for (int elem: list) {
            System.out.print(elem + " ");
        }
        System.out.println("");
        return list;
    }

    public int[] decBubbleSort (int[] list) {
        int i, j, temp;
        for (i = 0; i < list.length - 1; i++) {
            for (j = 0; j < list.length - 1 - i; j++) {
                if (list[j] < list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        for (int elem: list) {
            System.out.print(elem + " ");
        }
        System.out.println("");
        return list;
    }

    public int sumArray (int[] list) {
        int sum = 0;
        for (int elem: list) {
            sum += elem;
        }
        return sum;
    }

    public int[] squareArray (int[] list) {
        for (int elem: list) {
            elem *= elem;
            System.out.print(elem + " ");
        }
        return list;
    }

    public String getMainDiagonalString (String[][] list) {
        String mainDiag = "";
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i == j) {
                    mainDiag += list[i][j];
                }
            }
        }
        return mainDiag;
    }

    public int[] swapToZero (int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    list[i] = 0;
                }
            }
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
        return list;
    }
}