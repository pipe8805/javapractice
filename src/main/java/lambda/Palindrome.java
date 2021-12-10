package lambda;

public class Palindrome {

    public static void main(String args[]){
        String input="hannah";

        String output="";

        for(int i=input.length()-1;i>=0;i--){
            output=output+input.charAt(i);
        }
        System.out.println(input.equals(output));
    }
}
