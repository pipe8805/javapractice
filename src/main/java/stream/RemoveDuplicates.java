package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[] { 1, 9, 8, 7, 7, 8, 9 };
        List<Integer> listdup = Arrays.asList(arr1);

        // Converted the Array of type Integer into List

        Set<Integer> setNoDups = listdup.stream().collect(Collectors.toSet());


        // Set won't allow any duplicates

        setNoDups.forEach((i) -> System.out.print(" " + i));


    }
}
