package pl.edu.ur.polab4.obliczanieFigur;
/**
 *
 * @author Kamil
 */
public class Sześcian {
    public int bok;
    public double powierzchnia;
    public double objetosc;

    public Sześcian(int bok) {
        this.bok = bok;
    }
    public void powierzchnia(){
        this.powierzchnia = Math.pow(bok,2)*6;
    }
    public void objetosc(){
        this.objetosc = Math.pow(bok,3);
    }
    public void WyswietlDane(){
        this.powierzchnia();
        this.objetosc();
        System.out.println("--- Sześcian ---");
        System.out.println("Bok: " + this.bok);
        System.out.println("Powierzchnia: " + this.powierzchnia );
        System.out.println("Objętość: " + this.objetosc );
    }
}