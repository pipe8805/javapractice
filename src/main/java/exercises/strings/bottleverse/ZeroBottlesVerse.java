package exercises.strings.bottleverse;

public class ZeroBottlesVerse extends BottlesVerse
{
    static final String ZERO_BOTTLES_VERSE =
        "No more bottles of beer on the wall, no more bottles of beer.\n" +
        "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";
    public ZeroBottlesVerse( int bottles )
    {
        super( bottles );
    }
    @Override
    public String verse( )
    {
        return ZERO_BOTTLES_VERSE;
    }
}