package exercises.strings.bottleverse;

public class BottlesVerse
{
    static final String VERSE_TEMPLATE =
        "%s bottle%s of beer on the wall, %s bottle%s of beer.\n" +
        "Take %s down and pass it around, %s bottle%s of beer on the wall.\n\n";
    private final int bottles;
    public BottlesVerse( int bottles )
    {
        this.bottles = bottles;
    }
    public String verse( )
    {
        String sBottles = String.valueOf( bottles );
        return
            String.format(
                VERSE_TEMPLATE,
                sBottles, "s",
                sBottles, "s",
                "one", String.valueOf( bottles - 1 ), bottles == 2 ? "" : "s"
                         );
    }
}