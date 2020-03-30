package org.example;


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
    public void execute() throws OutOfBoundsException {
        this.moteurRPN.Enregistrer(value);
        this.moteurRPN.affichepile();
    }
}
