package rettangolo;

import java.util.Scanner;
import java.math.*;

public class poligono_equilatero {
    private int lati;
    private double lunghezza;

    Scanner tastiera = new Scanner(System.in);

    public void setLati(){
        lati = tastiera.nextInt();
    }

    public void setLunghezza(){
        lunghezza = tastiera.nextInt();
    }

    public double getPerimetro(){
        return lati * lunghezza;
    }

    public double getApotema(){
        return (lati * Math.sqrt(3)) / 2;
    }

    public double getArea(){
        return (getPerimetro() * getApotema()) / 2;
    }
}
