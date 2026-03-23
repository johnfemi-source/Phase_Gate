public class Level4Task {

    static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

   static int square(int number) {
        return number * number;
    }

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        System.out.println(add(34, 16));
        System.out.println(isEven(10));
        System.out.println(square(5));
        System.out.println(celsiusToFahrenheit(0));

    }
}
