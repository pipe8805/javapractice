package exercises.strings;

public class Bob{


public String heyTwo(String input){
    String response="";
    String inputTrim=input.trim();
    boolean isUppercase=isAllCapital(inputTrim);
    boolean isQuestion=inputTrim.charAt(inputTrim.length() - 1)=='?';
    boolean isEmpty=inputTrim.isEmpty();
    if(isUppercase && isQuestion){
      response="Calm down, I know what I'm doing!";  
    }else if(!isUppercase && isQuestion){
      response="Sure.";  
        
    }else if(isUppercase && !isQuestion){
      response="Whoa, chill out!";  
    }else if(isEmpty){
      response="Fine. Be that way!";  
        
    }else{
      response="Whatever.";          
    }
    return response;
}


    private boolean isAllCapital(String input){
        boolean response=false;
        for(char c : input.toCharArray()) {
            if(Character.isLetter(c) && Character.isUpperCase(c)) {
                response=true;
            }else if(Character.isLetter(c) && !Character.isUpperCase(c)){
                response=false;
            break;
            }
        }
        return response;
    }

    String hey(String phrase) {
        String trimmedPhrase = phrase.trim();
        if (trimmedPhrase.isEmpty()) return "Fine. Be that way!";
        if (isUpper(trimmedPhrase) && trimmedPhrase.endsWith("?")) return "Calm down, I know what I'm doing!";
        if (isUpper(trimmedPhrase)) return "Whoa, chill out!";
        if (trimmedPhrase.endsWith("?")) return "Sure.";
        return "Whatever.";
    }
    boolean isUpper(String s) {
        return s.chars().anyMatch(Character::isLetter) && s.equals(s.toUpperCase());
    }
    public static void main(String args[]) {
       Bob bob=new Bob();
       bob.hey(":) ?");

    }
}
