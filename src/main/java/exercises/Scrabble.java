package exercises;

import java.util.HashMap;
import java.util.Map;

class Scrabble {

    private String word;
    private static  Map<Integer, Integer> lScore=new HashMap<Integer, Integer>();
        static{
            "AEIOULNRST".chars().forEach(c -> lScore.put(c, 1));
            "DG".chars().forEach(c -> lScore.put(c, 2));
            "BCMP".chars().forEach(c -> lScore.put(c, 3));
            "FHVWY".chars().forEach(c -> lScore.put(c, 4));
            "K".chars().forEach(c -> lScore.put(c, 5));
            "JX".chars().forEach(c -> lScore.put(c, 8));
            "QZ".chars().forEach(c -> lScore.put(c, 10));
        }

    Scrabble(String word) {
        this.word=word;
    }

    int getScore() {
      return  this.word.chars()
        .map(v->lScore.get(v))
        .sum();

    }

    public static void main(String args[]){
        Scrabble scrabble=new Scrabble("CABBAGE");
        System.out.println(scrabble.getScore());
    }

}
