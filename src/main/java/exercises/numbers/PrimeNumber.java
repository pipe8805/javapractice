package exercises.numbers;

public class PrimeNumber {

    public static void main(String []args){
        int n=9;
        boolean isPrime=true;
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
