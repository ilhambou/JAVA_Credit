package dao;

import Modele.IB_Credit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IB_CreditDao implements IB_IDao{

    public static Set<IB_Credit> IB_BDCredits()
    {
        return new HashSet<IB_Credit>(
                Arrays.asList(
                        new IB_Credit(1L,40000.0,120,2.5,"ilham",0.0),
                        new IB_Credit(2L,860000.0,240,2.5,"ilham2",0.0),

                        new IB_Credit(2L,860000.0,240,2.5,"bouich",0.0)


                )
        );


    }




    public IB_Credit trouverParId(Long id)
    {
        System.out.println("touver le id num : " + id);
        return IB_BDCredits().stream().filter(credit -> credit.getIB_id() == id).findFirst().orElse(null);

    }

    @Override
    public Object trouverParId(Object o) {
        return null;
    }


}
