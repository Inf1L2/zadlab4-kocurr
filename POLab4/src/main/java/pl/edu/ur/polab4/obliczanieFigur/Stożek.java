package pl.edu.ur.polab4.obliczanieFigur;
/**
 *
 * @author Kamil
 */
public class Stożek {
    public float powierzchnia;
    private float powierzchniaB;
    private float powierzchniaP;
    private float s;
    public float objetosc;
    public int promien;
    public int wysokosc;    

    public Stożek(int promien, int wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }
    
    public void objetosc(){
        this.objetosc = (float)((Math.PI*(this.promien*this.promien)*this.wysokosc)/3);
    }
    public void powierzchnia(){
        this.s = (float) Math.sqrt((this.promien*this.promien)+(this.wysokosc*this.wysokosc));
        this.powierzchniaB = (float) (Math.PI*this.promien*this.s);
        this.powierzchniaP = (float) (Math.PI*this.promien*this.promien);
        this.powierzchnia = (float) (this.powierzchniaB+this.powierzchniaP);
    }
    public void WyswietlDane(){
        this.objetosc();
        this.powierzchnia();
        System.out.println("----Stożek----");
        System.out.println("Promien: " + this.promien);
        System.out.println("Wysokość: " + this.wysokosc );
        System.out.println("Tworząca: " + this.s);
        System.out.println("Objętość: " + this.objetosc);
        System.out.println("Powierzchnia: " + this.powierzchnia);
    }
}