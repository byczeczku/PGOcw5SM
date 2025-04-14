public class Film extends MediaBiblioteczne
{
    String rezyser;
    int czasTrwania;

    //

    public Film( String tytul, int rokWydania, String rezyser, int czasTrwania )
    {
        super( tytul, rokWydania );
        this.rezyser = rezyser;
        this.czasTrwania = czasTrwania;
    }

    @Override
    public void wyswietlInformacje()
    {
        super.wyswietlInformacje();
        System.out.println( "Rezyser: " + this.rezyser);
        System.out.println( "Czas trwania: " + this.czasTrwania);
    }

    public void sprawdzCzasTrwania()
    {
        System.out.println( "Czas trwania: " + czasTrwania);
        if( czasTrwania > 120)
        {
            System.out.println( "Ten film jest dluuuuuuuuuuuuuuugi :>");
        }
        else
        {
            System.out.println( "Ten film jest standardowej dlugosci.");
        }
    }
}
