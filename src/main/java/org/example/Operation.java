package org.example;

public enum Operation {
    /**
     * OPERATION PLUS .
     */
    PLUS("+") {
        /**
         * Fonction eval avec l'operation + .
         * @param op1 L'opérande gauche
         * @param op2 L'opérande droite
         * @return le resultat du calcul
         */
        public double eval(double op1, double op2) {
            return op1 + op2;
        }
    },
    /**
     *OPERATION MOINS
     */
    MOINS("-") {
        /**
         *Fonction eval avec l'operation - .
         * @param op1 L'opérande gauche
         * @param op2 L'opérande droite
         * @return le resultat du calcul
         */
        public double eval(double op1, double op2) {
            return op1 - op2;
        }
    },
    /**
     *OPERATION MULTIPLICATION .
     */
    MULT("*") {
        /**
         *Fonction eval avec l'operation * .
         * @param op1 L'opérande gauche
         * @param op2 L'opérande droite
         * @return le resultat du calcul
         */
        public double eval(double op1, double op2) {
            return op1 * op2;
        }
    },
    /**
     *OPERATION DIVISION
     */
    DIV("/") {
        /**
         *Fonction eval avec l'operation / .
         * @param op1 L'opérande gauche
         * @param op2 L'opérande droite
         * @return le resultat du calcul
         */
        public double eval(double op1, double op2) {
            if (op2 == 0) throw new ArithmeticException("Division par 0");
            return op1 / op2;
        }
    };
    /**
     *
     */
    private String symbole;

    /**
     * Constructeur des operations qui stocke le symbole.
     *
     * @param s le symbole qui doit être stocké
     */
    Operation(String s) {
        this.symbole = s;
    }

    /**
     * Getter du symbole de l'opération.
     *
     * @return Le symbole
     */
    public String getSymbole() {
        return symbole;
    }

    /**
     * Fonction abstraite d'évaluation redéfinie pour chaque elément de l'opération.
     *
     * @param op1 L'opérande gauche
     * @param op2 L'opérande droite
     * @return Le resultat des deux opérandes selon l'opération
     */
    public abstract double eval(double op1, double op2);

    /**
     *Verifie si l'operation est implementé dans l'enumeration.
     * @param s
     * @return Boolean
     */
    public static boolean verif_Operation(String s) {
        for (Operation val : values()) {

            if (s.equals(val.getSymbole())) {
                return true;
            }

        }

        return false;

    }

    /**
     * renvois la valeur associer a l'operation demandé si il existe.
     * @param S
     * @return val ou bien exception
     */
    public static Operation valeur(String S) {
        for (Operation val: values()) {
            if (S.equals(val.getSymbole())) {

                return val;

            }

        }
        throw new IllegalArgumentException();
    }
}
