package org.example;

import java.util.HashMap;
import java.util.Map;

public class GestionCommande {

    /**
     *
     */
    private final Map<String, Commande> commandes;
    /**
     *
     */
    private MoteurRPN Moteur;

    /**
     *
     */
    GestionCommande() {
        this.commandes = new HashMap<>();
    }

    /**
     *
     * @param nom
     * @param Commande
     */
    public void ajouterCommande(String nom, Commande Commande) {
        this.commandes.put(nom, Commande);
    }

    /**
     *
     * @param name
     */
    public void execCommande(String name) throws OutOfBoundsException {
        if (this.commandes.containsKey(name)) {
            this.commandes.get(name).execute();
        }
    }

    /**
     *
     * @param op
     */
    public void setOperation(Operation op) {
        CommandeCalcul test;
        if (this.commandes.containsKey("calcul")) {
            test = (CommandeCalcul) this.commandes.get("calcul");
            test.setOperation(op);
        }
    }

    /**
     *
     * @param val
     */
    public void setValeur(Double val) {

        CommandeEnregistrer test;
        if (this.commandes.containsKey("Enregistrer")) {
            test = (CommandeEnregistrer) this.commandes.get("Enregistrer");
            test.setValeur(val);
        }
    }

    /**
     *
     * @param m
     */
    public void init(MoteurRPN m) {
        this.Moteur = m;
        this.ajouterCommande("exit", new CommandeQuit(m));
        this.ajouterCommande("undo", new CommandeUndo(m));
        this.ajouterCommande("calcul", new CommandeCalcul(m, Operation.PLUS));
        this.ajouterCommande("Enregistrer", new CommandeEnregistrer(m, 0));
        this.ajouterCommande("Retourner", new CommandeRetourner(m));
    }
}
