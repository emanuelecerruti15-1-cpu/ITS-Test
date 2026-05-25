package rettangolo;

import java.util.Scanner;

public class Avvio {
    static void main(){
        String scelta = "";

        Scanner tastiera = new Scanner(System.in);

        System.out.print("Scegli la forma geometrica che preferisci: ");
        scelta = tastiera.nextLine();

        Rettangolo box = new Rettangolo(); //forma new rettangolo
        box.setDimensioni();


    }
}

