
import java.io.PrintWriter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vladimir
 */
public class Basic extends Free {
    //  String numeSubscriptie;

    Basic() {

    }

 /**
     * Seteaza numele subscriptiei
     */
    @Override
    public void SetNume() {
        this.numeObiect = "Basic";
    }

    /**
     * Decrementeaza subscriptia
     */
    @Override
    public void Decrementare() {

        if (this.nrBasic > 0) {
            this.nrBasic--;
        } else {
            super.Decrementare();
        }

    }
   /**
     * afiseaza in fisierul de output
     * @param out - fisier output
     */
    @Override
    public void display(PrintWriter out) {
        if (this.nrBasic > 0) {
            out.println("Basic");
        } else {
            super.display(out);
        }
    }

}
