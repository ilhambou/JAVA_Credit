package Modele;

public class IB_Credit {
    private Long IB_id;
    private Double IB_capilate_Emprunte;
    private Integer IB_nombre_mois;
    private Double IB_taux_Mensuel;
    private String IB_nom_damandeur;
    private Double IB_mensualite;

    public IB_Credit(Long IB_id, Double IB_capilate_Emprunte , Integer IB_nombre_mois,Double IB_taux_Mensuel ,String IB_nom_damandeur,Double IB_mensualite)
    {
        this.IB_id = IB_id;
        this.IB_mensualite = IB_mensualite;
        this.IB_taux_Mensuel = IB_taux_Mensuel;
        this.IB_nom_damandeur = IB_nom_damandeur;
        this.IB_capilate_Emprunte = IB_capilate_Emprunte;
        this.IB_nombre_mois = IB_nombre_mois;
    }


    public Long getIB_id() {
        return IB_id;
    }

    public String getIB_nom_damandeur() {
        return IB_nom_damandeur;
    }

    public Double getIB_mensualite() {
        return IB_mensualite;
    }

    public Double getIB_taux_Mensuel() {
        return IB_taux_Mensuel;
    }

    public Integer getIB_nombre_mois() {
        return IB_nombre_mois;
    }

    public Double getIB_capilate_Emprunte() {
        return IB_capilate_Emprunte;
    }

    public void setIB_mensualite(Double IB_mensualite) {
        this.IB_mensualite = IB_mensualite;
    }

    @Override
    public String toString() {
        String IB_creditStr= "---------------------------------------------";
        IB_creditStr += "credit num : "+ getIB_id() + "\n";
        IB_creditStr += "nom du demandeur : "+ getIB_nom_damandeur() + "\n";
        return IB_creditStr;
    }
}
