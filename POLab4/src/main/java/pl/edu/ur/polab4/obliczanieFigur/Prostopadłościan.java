package pl.edu.ur.polab4.obliczanieFigur;
/**
 *
 * @author Kamil
 */
public class Prostopadłościan {
    public double powierzchnia;
    public int bok1,bok2,bok3;
    public double objetosc;  

    public Prostopadłościan(int bok1, int bok2, int bok3) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
    }
    public void Powierzchnia(){
        this.powierzchnia = 2*(bok1*bok2+bok1*bok3+bok2*bok3);
    }
    public void Objetosc(){
        this.objetosc = bok1*bok2*bok3;
    }    
    public void WyswietlDane(){
        this.Powierzchnia();
        this.Objetosc();
        System.out.println("--- Prostopadłościan ---");
        System.out.println("Bok1: " + this.bok1);
        System.out.println("Bok2: " + this.bok2);
        System.out.println("Bok3: " + this.bok3);
        System.out.println("Powierzchnia: " + this.powierzchnia );
        System.out.println("Objętość: " + this.objetosc );
    } 
}