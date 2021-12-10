package lambda;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionTwo {

    // Complete the formingMagicSquare function below.
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> map=new HashMap<>();
        Integer[] myArray = new Integer[a.size()];
        a.toArray(myArray);
        Arrays.sort(myArray);
        int cnt=0;
        int max=0;
        for(int i=0;i<a.size();i++){
            for(int j=i;j<a.size();j++){
                if(myArray[j]-myArray[i]<=1){
                    cnt++;
                }
            }
            if(cnt>max)
                max=cnt;
            cnt=0;

        }
        return max;
    }






    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        List<Integer> list= Arrays.asList(4, 6, 5, 3, 3, 1);
System.out.println(pickingNumbers(list));

    }
}