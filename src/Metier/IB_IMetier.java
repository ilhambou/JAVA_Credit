package Metier;

import Modele.IB_Credit;

public interface IB_IMetier {
    IB_Credit calcule_Mensualite(Long idCredit) throws Exception;

}
