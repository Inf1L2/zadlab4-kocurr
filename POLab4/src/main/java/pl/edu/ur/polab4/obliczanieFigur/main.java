package pl.edu.ur.polab4.obliczanieFigur;
/**
 *
 * @author Kamil
 */
public class main {
    
    public static void main(String[] args) {
        Kwadrat Kwadrat1 = new Kwadrat(2);
        Kwadrat1.WyswietlDane();
        
        Prostokąt Prostokat = new Prostokąt(3,5);
        Prostokat.WyswietlDane();
        
        Koło Kolo1 = new Koło(4);
        Kolo1.WyswietlDane();
        
        Kula Kula1 = new Kula(3);
        Kula1.WyswietlDane();
        
        Stożek Stozek1 = new Stożek(2,4);
        Stozek1.WyswietlDane();
        
        Sześcian Szescian1 = new Sześcian(4);
        Szescian1.WyswietlDane();
        
        Prostopadłościan Prostop = new Prostopadłościan(2,3,4);
        Prostop.WyswietlDane();
    }
}