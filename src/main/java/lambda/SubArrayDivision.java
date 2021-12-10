package lambda;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SubArrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        int acumSum = 0;
        int acumCount = 0;
        for (int i = 0; i <= s.size() - 1; i++) {
            acumSum= s.get(i);
            acumCount++;
            if (acumSum == d && acumCount==m) {
                result++;
            }
            for (int j = i + 1; j <= s.size() - 1; j++) {
                acumCount++;
                acumSum = acumSum + s.get(j);
                if (acumSum == d && acumCount==m) {
                    result++;
                    break;
                }

            }
            acumCount = 0;
            acumSum = 0;
        }
        return result;
    }
}

 class Solution {
    public static void main(String[] args) throws IOException {



        List<Integer> s = Stream.of(4)
                .collect(toList());
        int d = 4;

        int m = 1;

        int result = SubArrayDivision.birthday(s, d, m);
System.out.println(result);

    }
}

