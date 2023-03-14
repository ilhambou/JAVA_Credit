package Metier;

import Modele.IB_Credit;
import dao.IB_CreditDao;
import dao.IB_IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;



@Service("metier")
public class IB_CreditMetier implements IB_IMetier{
    @Autowired
    @Qualifier("dao")
    //IB_CreditDao ib_creditDao;
    IB_IDao<IB_Credit,Long> creditDao;

    public IB_IDao<IB_Credit, Long> setCreditDao(IB_IDao<IB_Credit,Long> dao){
        return this.creditDao=dao;
    }

   /* public void setIb_creditDao(IB_CreditDao ib_creditDao) {
        this.ib_creditDao = ib_creditDao;
    }*/



    @Override
    public IB_Credit calcule_Mensualite(Long idCredit) throws Exception {
        var credit = creditDao.trouverParId(idCredit);
        if (credit == null) {
            throw new Exception("l id du credit est incorrecte ");

        } else {
            double IB_taux = credit.getIB_taux_Mensuel();
            IB_taux = IB_taux / 1200;
            double IB_capitale = credit.getIB_capilate_Emprunte();
            int IB_nbr_mois = credit.getIB_nombre_mois();
            double IB_mensualite = (IB_capitale * IB_taux) / (1 - (Math.pow(1 + IB_taux, -1 * IB_nbr_mois)));
            IB_mensualite = Math.round(IB_mensualite * 100) / 100;
            credit.setIB_mensualite(IB_mensualite);
            return credit;
        }

    }
}
