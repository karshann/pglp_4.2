package org.example;

import java.util.Stack;

public class MoteurRPN extends Interpreteur {
    /**
     *Valeur max.
     */
    private final static double MAX_VALUE = 100000;

    /**
     * Constructeur de moteur.
     */
    public MoteurRPN() {
        super();

    }

    /**
     *Fonction qui enregistre une valeur.
     * @param i
     * @throws OutOfBoundsException
     */
    public void Enregistrer(double i) throws OutOfBoundsException {

        if (Math.abs(i) <= MAX_VALUE) {
            this.setPilePrec((Stack<Double>) this.getPileact().clone());
            getPileact().add(i);
        }
        else throw new OutOfBoundsException();
    }

    /**
     *Fonction qui applique l'operation.
     * @param op
     * @throws OutOfBoundsException
     */
    public void Application(Operation op) throws OutOfBoundsException {
        double i = 0;
        if (getPileact().size() > 1) {
            this.setPilePrec((Stack<Double>) this.getPileact().clone());
           i = op.eval(getPileact().pop(), getPileact().pop());

            if (Math.abs(i) > MAX_VALUE) throw new OutOfBoundsException();

        }
        getPileact().add(i);

    }

    /**
     * Focntion qui retourne la pileactuel.
     * @return pile actuel
     */
    public Stack<Double> RetourPile() {
        return this.getPileact();
    }

    /**
     *Affiche la pile actuel .
     */
    public void affichepile() {

        System.out.println("Pile precedente" + this.getPilePrec());
        System.out.println(("Pile nouvelle" + this.getPileact()));
    }




}