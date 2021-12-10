package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicates {

    public static void main(String args[]){
        List<Integer> list= Arrays.asList(6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5);

        List<Integer> listDuplicated=list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(p->p.getValue()>1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
        System.out.println("listDuplicated "+listDuplicated);


        Integer maxRepeated=list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(p->p.getValue()>1)
                .max( Comparator.comparing( Map.Entry::getValue ))
                .map(Map.Entry::getKey)
                .get();
        System.out.println("maxRepeated "+maxRepeated);

        int sumStreams=
        IntStream.range(0, list.size())
                //.filter(i -> 1 != i)
                .mapToObj(i -> list.get(i))
                .collect(Collectors.toList())
                .stream()
                .mapToInt(p->p)
                .sum();
        System.out.println("sumStreams "+sumStreams);


        long sumSocks=list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(p->p.getValue()>1 && p.getKey()<100)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList())
                .stream()
                .mapToLong(p->p)
                .sum();

        System.out.println("sumSocks "+sumSocks);

        List<Integer> listNoDuplicated=list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(p->p.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("listNoDuplicated "+listNoDuplicated);

    }
}
