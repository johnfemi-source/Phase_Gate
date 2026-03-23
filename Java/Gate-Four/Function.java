public class Function {

    public static String getPrimeNumbers(int[] numbers) {
        String primeNumbers = "";

        for (int numberIndex = 0; numberIndex < numbers.length; numberIndex++) {
            int number = numbers[numberIndex];
            if (isPrime(number)) {
                if (primeNumbers.equals("")) {
                    primeNumbers = primeNumbers + number;
                } else {
                    primeNumbers = primeNumbers + " " + number;
                }
            }
        }
        return primeNumbers;
    }
    public static boolean isPrime(int number) {
        int divisorCount = 0;
        for (int divisor = 1; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                divisorCount++;
            }
        }
        return divisorCount == 2;
    }
    public static void main(String[] args) {
        int[] numbers = {5, 9, 3, 6, 2};
        System.out.println(getPrimeNumbers(numbers));
    }
}
