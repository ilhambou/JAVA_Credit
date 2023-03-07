package Metier;

import Modele.IB_Credit;
import dao.IB_CreditDao;
import dao.IB_IDao;

public class IB_CreditMetier implements IB_IMetier{
    IB_CreditDao ib_creditDao;
    IB_IDao<IB_Credit,Long> creditDao;

    public void setIb_creditDao(IB_CreditDao ib_creditDao) {
        this.ib_creditDao = ib_creditDao;
    }

    public IB_Credit calculer_mensualite(Long idCredit) throws Exception
    {
        IB_Credit credit = ib_creditDao.trouverParId(idCredit);
        if(credit == null)
        {
            throw new Exception("l id du credit est incorrecte ");

        }
        else
        {
            double IB_taux = credit.getIB_taux_Mensuel();
            IB_taux = IB_taux/1200;
            double IB_capitale = credit.getIB_capilate_Emprunte();
            int IB_nbr_mois = credit.getIB_nombre_mois();
            double IB_mensualite = (IB_capitale * IB_taux) / (1- (Math.pow(1+IB_taux, -1 * IB_nbr_mois)));
            IB_mensualite = Math.round(IB_mensualite*100)/100;
            credit.setIB_mensualite(IB_mensualite);
            return credit;
        }
    }

    @Override
    public IB_Credit calcule_Mensualite(Long idCredit) throws Exception {
        return null;
    }

}
