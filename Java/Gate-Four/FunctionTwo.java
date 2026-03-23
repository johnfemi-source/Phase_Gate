public class FunctionTwo {

    public static int countEvens(int[] numbersList) {
        int evenCount = 0;

        for (int number : numbersList) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }
    public static int[] squares(int number) {
        int[] squareNumbers = new int[number];

        for (int i = 1; i <= number; i++) {
            squareNumbers[i - 1] = i * i;
        }

        return squareNumbers;
    }
    public static boolean arraysEqual(int[] firstList, int[] secondList) {
        if (firstList.length != secondList.length) {
            return false;
        }

        for (int i = 0; i < firstList.length; i++) {
            if (firstList[i] != secondList[i]) {
                return false;
            }
        }

        return true;
    }
    

 }
