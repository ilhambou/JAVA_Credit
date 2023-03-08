package presentation;

import Metier.IB_CreditMetier;
import Metier.IB_IMetier;
import Modele.IB_Credit;

public class IB_CreditControleur implements IB_IControleur{

   //IB_CreditMetier creditMetier;
   IB_IMetier creditMetier;


    public void setCreditMetier(IB_IMetier creditMetie) {
        this.creditMetier = creditMetie;
    }


    @Override
    public void afficher_Mensualite(Long idCredit) throws Exception {
       // IB_Credit creditAvecMensualite = creditMetier.calculer_mensualite(idCredit);
        var creditAvecMensualite = creditMetier.calcule_Mensualite(idCredit);
        System.out.println(creditAvecMensualite);
    }
}
