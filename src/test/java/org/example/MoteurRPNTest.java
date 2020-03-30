package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class MoteurRPNTest {
    MoteurRPN moteurRPN;
    @Before
     public void initialisation()
    {
        moteurRPN=new MoteurRPN();
    }

    @Test
    public void enregistrer() throws OutOfBoundsException {
        CommandeEnregistrer c = new CommandeEnregistrer(moteurRPN, 10.0);
        c.execute();
        c.setValeur(15.0);
        c.execute();
        assertEquals(15.0, moteurRPN.getPileact().pop(), 0);
        assertEquals(10.0, moteurRPN.getPileact().pop(), 0);
    }

    @Test
    public void application() throws OutOfBoundsException {
        CommandeEnregistrer c = new CommandeEnregistrer(moteurRPN, 10.0);
        c.execute();
        c.setValeur(15.0);
        c.execute();
        CommandeCalcul c1 = new CommandeCalcul(moteurRPN, Operation.MULT);
        c1.execute();
        assertEquals(150.0, moteurRPN.getPileact().pop(), 0);
    }

    @Test
    public void retourPile() throws OutOfBoundsException {
        CommandeEnregistrer c1 = new CommandeEnregistrer(moteurRPN, 10.0);
        c1.execute();
        c1.setValeur(15.0);
        c1.execute();
        CommandeRetourner c2 = new CommandeRetourner(moteurRPN);
        c2.execute();
        Stack<Double> test = new Stack <Double>();
        test.push(10.0);
        test.push(15.0);
        assertEquals(test, c2.getPile());
    }
}