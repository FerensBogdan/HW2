public class Main {

    public static void main(String[] args) {

        OArray oarray = new OArray();
        int[] firstArray = new int[20];

        int[] secondArray = {26, 89, 5, 1, 7, 4, 12, 6};

        String[][] stringArray = {
                {"sort ", "array ", "class "},
                {"public ", "main ", "int "},
                {"system ", "objects ", "out "}
        };
        System.out.println("____________________________________________________________________________________________");
        System.out.print("Initialization: ");
        firstArray = oarray.initArray(firstArray);
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Maximum: " + oarray.getMaxElemArray(firstArray));
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Minimum: " + oarray.getMinElemArray(firstArray));
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Sum: " + oarray.sumArray(firstArray));
        System.out.println("____________________________________________________________________________________________");
        System.out.print("descending: ");
        oarray.incBubbleSort(firstArray);
        System.out.println("____________________________________________________________________________________________");
        System.out.print("ascending: ");
        oarray.decBubbleSort(firstArray);
        System.out.println("____________________________________________________________________________________________");
        System.out.print("Elevation to the square of the elements: ");
        oarray.squareArray(firstArray);
        System.out.println();
        System.out.println("____________________________________________________________________________________________");
        System.out.print("duplication: ");
        oarray.swapToZero(secondArray);
        System.out.println();
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Main diagonal: " + oarray.getMainDiagonalString(stringArray));
        System.out.println("____HW №2 Ferens Bogdan____");
    }
}