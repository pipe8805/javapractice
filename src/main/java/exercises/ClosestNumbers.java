package exercises;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumbers {


    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        Integer[] myArray = new Integer[arr.size()];
        arr.toArray(myArray);
        Arrays.sort(myArray);
        List<Integer> result=new ArrayList<>();
        Integer diff = Integer.MAX_VALUE;
        for (int i = 0; i < myArray.length-1; i++) {
            if (myArray[i + 1] - myArray[i] <= diff)
                diff = myArray[i + 1] - myArray[i];
        }

        for (int i = 0; i < myArray.length-1; i++) {
            if (myArray[i + 1] - myArray[i] == diff){
                result.add(myArray[i]);
                result.add(myArray[i + 1]);

            }

        }
        return result;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> list= Arrays.asList(5, 4 ,3, 2);
        closestNumbers(list);

    }
}
