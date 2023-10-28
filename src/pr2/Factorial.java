package pr2;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Здесь можно изменить число, для которого нужно вычислить факториал
        long result = calculateFactorial(number);
        System.out.println(number + "! = " + result);
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
