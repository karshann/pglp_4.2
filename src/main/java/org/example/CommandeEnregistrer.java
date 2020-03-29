package org.example;

import java.util.Stack;

public class CommandeEnregistrer implements Commande {

    /**
     *
     */
    private MoteurRPN moteurRPN;
    /**
     *
     */
    private Double value;

    /**
     *
     * @param moteur
     * @param v
     */
    public CommandeEnregistrer(MoteurRPN moteur, double v) {
        this.moteurRPN = moteur;
        this.value = v;
    }

    /**
     *
     * @param val
     */
    public void setValeur(Double val) {
        this.value = val;
    }

    /**
     *
     */
    @Override
    public void execute() {
        this.moteurRPN.setPilePrec((Stack<Double>) this.moteurRPN.getPileact().clone());
        this.moteurRPN.getPileact().push(value);
        System.out.println("Pile precedente" + this.moteurRPN.getPilePrec());
        System.out.println(("Pile nouvelle" + this.moteurRPN.getPileact()));
    }
}
