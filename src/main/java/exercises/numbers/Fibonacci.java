package exercises.numbers;

public class Fibonacci {
    public Integer fibonacci(Integer n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String [] args){
        Fibonacci f=new Fibonacci();
        System.out.println(f.fibonacci(10));
    }
}
