package exercises.strings.bottleverse;

public class BeerSong
{
    public String sing( int bottles, int verses )
    {
        String result="";
       /* return
            IntStream.range( 0, verses )
                .mapToObj( index -> getVerse( bottles - index ).verse( ) )
                .collect( Collectors.joining( ) );*/

        for( int i = 0; i < verses; ++i )
        {
            result += getVerse( bottles - i ).verse( );
        }

        return result;
    }
    public String singSong( )
    {
        return sing( 99, 100 );
    }
    private BottlesVerse getVerse( final int bottles )
    {
        if( bottles == 0 )
        {
            return new ZeroBottlesVerse( bottles );
        }
        if( bottles == 1 )
        {
            return new OneBottleVerse( bottles );
        }
        return new BottlesVerse( bottles );
    }

    public static void main(String args[]){
        System.out.println(exercises.strings.BeerSong.sing(2,1));
    }
}