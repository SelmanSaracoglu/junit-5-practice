

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public Integer divide(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return a/b;
    }
    /*public Integer divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return null;
        }
    }
     */


}
