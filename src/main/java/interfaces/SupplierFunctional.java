package interfaces;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierFunctional {
    public double squareLazy(Supplier<Double> lazyValue) {
        return Math.pow(lazyValue.get(), 2);
    }

    public static void main(String args[]){
        SupplierFunctional supplierFunctional=new SupplierFunctional();
        Supplier<Double> lazyValue = () -> {
              return 9d;
        };

        Double valueSquared = supplierFunctional.squareLazy(lazyValue);
        System.out.println(valueSquared);

        int[] fibs = {0, 1};
        Stream<Integer> fibonacci = Stream.generate(() -> {
            int result = fibs[1];
            int fib3 = fibs[0] + fibs[1];
            fibs[0] = fibs[1];
            fibs[1] = fib3;
            return result;
        });
        fibonacci.forEach(e->System.out.println(e));

    }
}
