package org.example;

public enum CalculatriceRPN {

    CALCULATRICE_RPN;

    /**
     * Fonction qui lance le programme.
     * @throws PileException
     * @throws OutOfBoundsException
     */
    private void run() throws PileException, OutOfBoundsException {
       MoteurRPN m = new MoteurRPN();
       SaisieRPN s = new SaisieRPN(m);
       while (true) {
           s.Entree();
       }
    }

    /**
     * Main du programme.
     * @param args
     * @throws PileException
     * @throws OutOfBoundsException
     */
    public static void main(String[] args) throws PileException, OutOfBoundsException {
        CALCULATRICE_RPN.run();
    }
}
