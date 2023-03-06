package presentation;

import Metier.IB_CreditMetier;
import Modele.IB_Credit;

public class IB_CreditControleur {
    IB_CreditMetier creditMetier;
    public void afficher_mensualite(Long idCredit) throws Exception
    {
        IB_Credit creditAvecMensualite = creditMetier.calculer_mensualite(idCredit);
        System.out.println(creditAvecMensualite);
    }
}
