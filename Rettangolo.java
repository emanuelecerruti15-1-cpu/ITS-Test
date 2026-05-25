package rettangolo;

/*
Classe che rappresenta un generico rettangolo
 */
import java.util.Scanner;
public class Rettangolo{
    private double larghezza;
    private double altezza;

    Scanner tastiera = new Scanner (System.in);
    
    public void setDimensioni() {
        setLarghezza();
        setAltezza();
    }

    public void setAltezza(){
        do{
            System.out.print("Inserisci Valore [h]: ");
            altezza = tastiera.nextDouble();
            if(altezza < 0 ) System.out.println("Il valore non può essere negativo!");
        }while(altezza < 0);
    }

    public void setLarghezza(){
        do{
            System.out.print("Inserisci Valore [l]: ");
            larghezza = tastiera.nextDouble();
            if(larghezza < 0 ) System.out.println("Il valore non può essere negativo!");
        }while(larghezza < 0);
    }

    public double getAltezza(){
        return altezza;
    }

    public double getLarghezza(){
       return larghezza; 
    }

    public double getArea() {
        return larghezza * altezza;
    }

    public double getPerimetro(){
        return (larghezza + altezza) * 2;
    }
}
