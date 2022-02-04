package exercises.strings;

public class Palindrome {

    public static void main(String args[]){
        String input="hannah";

        String output="";

        //O(n) lineal
        for(int i=input.length()-1;i>=0;i--){
            output=output+input.charAt(i);
        }
        System.out.println(input.equals(output));
        StringBuffer inputBuffer = new StringBuffer(input);
        //O(1)
        System.out.println(input.equals(inputBuffer.reverse().toString()));

    }
}
