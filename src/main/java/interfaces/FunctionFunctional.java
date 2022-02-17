package interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FunctionFunctional {
    public static void main(String args[]){
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", s -> s.length());
        Function<Integer, String> intToString = Object::toString;
        Function<String, String> quote = s -> "'" + s + "'";

        Function<Integer, String> quoteIntToString = quote.compose(intToString);

       System.out.println(quoteIntToString.apply(5));

    }
}
