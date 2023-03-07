package presentation;

import Metier.IB_CreditMetier;
import Modele.IB_Credit;

public class IB_CreditControleur implements IB_IControleur{

    IB_CreditMetier creditMetier;
    public void afficher_mensualite(Long idCredit) throws Exception
    {
        IB_Credit creditAvecMensualite = creditMetier.calculer_mensualite(idCredit);
        System.out.println(creditAvecMensualite);
    }

    public void setCreditMetier(IB_CreditMetier creditMetier) {
        this.creditMetier = creditMetier;
    }


    @Override
    public void afficher_Mensualite(Long idCredit) throws Exception {

    }
}
