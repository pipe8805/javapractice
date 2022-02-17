package exercises.strings.bottleverse;

public class OneBottleVerse extends BottlesVerse
{
    public OneBottleVerse( int bottles )
    {
        super( bottles );
    }
    @Override
    public String verse( )
    {
        String sBottles = "1";
        return
            String.format(
                VERSE_TEMPLATE,
                sBottles, "",
                sBottles, "",
                "it", "no more", "s"
                         );
    }
}