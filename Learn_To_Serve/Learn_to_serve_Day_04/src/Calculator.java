public class Calculator {
    int a,b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int add(int a, int b) {
        return a+b;
    }
    public int subtract(int a, int b) {
        return a-b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public int divide(int a, int b) {
        return a/b;
    }
}
