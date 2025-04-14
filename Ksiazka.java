public class Ksiazka extends MediaBiblioteczne
{
    protected String autor;
    protected int liczbaStron;

    //

    public Ksiazka( String tytul, int rokWydania, String autor, int liczbaStron)
    {
        super(tytul, rokWydania);
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }

    @Override
    public void wyswietlInformacje()
    {
        super.wyswietlInformacje();
        System.out.println( "Autor: " + this.autor);
        System.out.println( "Liczba stron: " + this.liczbaStron);
    }

    public void sprawdzLiczbeStron()
    {
        System.out.println( "Liczba stron: " + this.liczbaStron);
        if( liczbaStron > 500)
        {
            System.out.println( "Ksiazka jest długa.");
        }
        else
        {
            System.out.println( "Ksiazka jest standardowa.");
        }
    }
}
