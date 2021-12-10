package lambda;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelSum {


    public static void main(String[] args) throws IOException {
        int fullSize = 1000000;
        List<Integer> list = IntStream.rangeClosed(1, fullSize)
                .boxed()
                .collect(Collectors.toList());
        int index = 0;
        int size = 1000;
        int sum = 0;
        long ts = System.currentTimeMillis();
        while (index < fullSize) {
            sum += list.subList(index, index + size)
                    .stream()
                    .parallel()
                    .reduce(0, Integer::sum);
            index += size;
        }
        System.out.println(sum );
        System.out.println("Time elapsed: " + (System.currentTimeMillis() - ts));

        ts = System.currentTimeMillis();
        sum = IntStream.range(0, fullSize)
                .filter(i -> i % size == 0)
                .mapToObj(i -> list.subList(i, Math.min(i + size, fullSize)))
                .mapToInt(i -> i.stream()
                        .mapToInt(l -> l)
                        .sum())
                .parallel()
                .reduce(0, Integer::sum);

        System.out.println(sum);
        System.out.println("Time elapsed: " + (System.currentTimeMillis() - ts));
        ts = System.currentTimeMillis();

        int oe = IntStream.rangeClosed(1, fullSize)
                .parallel()
                .reduce(0, Integer::sum);
        System.out.println(oe);
        System.out.println("Time elapsed: " + (System.currentTimeMillis() - ts));

    }

}
