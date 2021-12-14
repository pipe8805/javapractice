package exercises;

public class FizzBuzz {

    public static void main(String[] args){
        Integer i=5;
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (result.equals("")) {
            result = i.toString();
        }
        System.out.println(result);
    }
}
