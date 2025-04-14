public class MediaBiblioteczne
{
    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny;

    //

    protected MediaBiblioteczne( String tutul, int rokWydania)
    {
        this.tytul = tutul;
        this.rokWydania = rokWydania;
        this.dostepny = true;
    }

    public void wypozycz()
    {
        if ( this.dostepny == true)
        {
            this.dostepny = false;
            System.out.println("Wypozyczyles " + this.tytul);
        }
        else
        {
            System.out.println( this.tytul + " zostal juz wypozyczony przez kogos innego");
        }
    }

    public void zwroc()
    {
        if ( this.dostepny == false)
        {
            this.dostepny = true;
            System.out.println("Zwrociles " + this.tytul + ", Przyjacielu");
        }
        else
        {
            System.out.println( this.tytul + " niestety zostal juz zwrocony przez kogos innego :(");
        }
    }
}
