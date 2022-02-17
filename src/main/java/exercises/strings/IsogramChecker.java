package exercises.strings;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class IsogramChecker {
  /*
  An isogram (also known as a "nonpattern word") is a word or
  phrase without a repeating letter, however spaces and hyphens are allowed to appear multiple times.
   */
    boolean isIsogram(String phrase) {
       return phrase
                .chars()
                .mapToObj(c -> ((char) c)+"")
                .filter(c->!c.equals("-") && !c.equals(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .allMatch(f->f.getValue()==1);



    }



    public static  void main(String args[]){
        IsogramChecker isogramChecker=new IsogramChecker();
       System.out.println(isogramChecker.isIsogram("zzyzx"));
        System.out.println(isogramChecker.isIsogram("PATHFINDER"));
        System.out.println(isogramChecker.isIsogram("six-year-old"));
    }

}
