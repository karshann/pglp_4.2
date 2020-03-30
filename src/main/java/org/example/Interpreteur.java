package org.example;

import java.util.Stack;
public class Interpreteur {

    /**
     * pileact = pile de la saisie actuelle.
     */
    private Stack<Double> pileact;
    /**
     * pilePrec = pile prec par rapport de la saisie actuelle.
     */

    private Stack<Stack<Double>> pilePrec;

    /**
     * Constructeur de la class Interpreteur.
     */
    public Interpreteur() {
        this.pileact = new Stack<Double>();
        this.pilePrec = new Stack<Stack<Double>>();
    }

    /**
     * Fonction qui permet de faire un undo.
     *
     */
    public void undo() {
        pileact = pilePrec.pop();
    }

    /**
     * Fonction qui permet de quitter le programme.
     */
    public void quitter() {
        System.exit(0);
    }

    /**
     * Accees a la pile.
     * @return pileact
     */
    public Stack<Double> getPileact() {
        return pileact;
    }

    /**
     * Set la pile precedenteAccees a la pile.
     * @param pilePrec
     */
    public void setPilePrec(Stack<Double> pilePrec) {
        this.pilePrec.push(pilePrec);
    }

    /**
     * Set la pile actuelle.
     * @param pileact
     */
    public void setPileact(Stack<Double> pileact) {
        this.pileact = pileact;
    }

    /**
     * Accees a la pile précedente.
     * @return pilePrec
     */
    public Stack<Double> getPilePrec() {
        return pilePrec.peek();
    }
}
