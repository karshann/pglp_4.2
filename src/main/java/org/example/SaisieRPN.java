package org.example;

import java.util.Scanner;

public class SaisieRPN {
    /**
     */
    private MoteurRPN m;
    /**
     *
     */
    private Scanner scanner;
    /**
     *
     */
    private GestionCommande Gc;

    /**
     *
     * @param moteur
     */
    public SaisieRPN(MoteurRPN moteur) {

        this.m = moteur;
        this.scanner = new Scanner(System.in);
        this.Gc = new GestionCommande();
        this.Gc.init(m);
    }

    /**
     *
     */
    public void Entree() {

        String s = new String();
        s = this.scanner.nextLine();
        System.out.println(s);
        if (s.length() == 1 && Operation.verif_Operation(s)) {
            this.Gc.setOperation(Operation.valeur(s));
            this.Gc.execCommande("calcul");
        }
        else {
            try {
                double d = Double.parseDouble(s);
                this.Gc.setValeur(d);
                this.Gc.execCommande("Enregistrer");
            }
            catch (NumberFormatException e) {
                this.Gc.execCommande(s);
            }
        }
    }
}