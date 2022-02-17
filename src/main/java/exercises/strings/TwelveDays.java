package exercises.strings;

class TwelveDays {
       private static final String[] nums = new String[] {
            "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", 
            "eleventh", "twelfth"
    };
     private static final String[] gifts=new String[] {"a Partridge in a Pear Tree",
                                   "two Turtle Doves",
                                   "three French Hens",
                                   "four Calling Birds",
                                   "five Gold Rings",
                                   "six Geese-a-Laying",
                                   "seven Swans-a-Swimming",
                                   "eight Maids-a-Milking",
                                   "nine Ladies Dancing",
                                   "ten Lords-a-Leaping",
                                   "eleven Pipers Piping",
                                   "twelve Drummers Drumming"};
    String verse(int verseNumber) {
        StringBuilder song=new StringBuilder();
        song.append("On the ")
            .append(nums[verseNumber-1])
            .append(" day of Christmas my true love gave to me: ");
        for (int i=verseNumber;i>0;i--){
          if(i==1 && verseNumber>1){  
            song.append("and "); 
            }  
             song.append(gifts[i-1]); 
             if(i>1 && verseNumber>1 )  {
               song.append(", ");   
             } else if(i==1 ){
                song.append(".\n");   
             }
        }
        return song.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder song=new StringBuilder();
        for (int i=startVerse;i<endVerse;i++){
           song.append(verse(i));  
            if(i<endVerse-1){
                song.append("\n");
            }
        }
        return song.toString();
    }
    
    String sing() {
        return verses(1,12);
    }


    public static void main(String args[]){
        TwelveDays twelveDays=new TwelveDays();
        System.out.println(twelveDays.verses(1, 3));
    }
}
