package ecole.metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class SessionCours {
    /**
     * Identifiant de la session de cours
     */
    protected int idSessionCours;

    /**
     * Date de début de la sesison de cours
     */
    protected Date dateDebut;

    /**
     * Date de fin de la session de cours
     */
    protected Date dateFin;

    /**
     * Nombre d'inscrits pour la session de cours
     */
    protected int nbreInscrits;

    /**
     * Liste des formateurs prévus pour la session de cours
     */
    protected ArrayList<Formateur> listFormateurs = new ArrayList();

    /**
     * Liste des cours qui sont prévus pour la session de cours
     */
    protected ArrayList<Cours> listeCours = new ArrayList<>();


    /**
     * getter idSessionCours
     *
     * @return identifiant de la session de cours
     */
    public int getIdSessionCours() {
        return idSessionCours;
    }

    /**
     * setter idSessionCours
     *
     * @param idSessionCours identifiant de la session de cours
     */
    public void setIdSessionCours(int idSessionCours) {
        this.idSessionCours = idSessionCours;
    }

    /**
     * getter dateDebut
     *
     * @return date de début de la session
     */
    public Date getDateDebut() {
        return dateDebut;
    }

    /**
     * setter dateDebut
     *
     * @param dateDebut date de début de la session
     */
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * getter dateFin
     *
     * @return date de fin de la session
     */
    public Date getDateFin() {
        return dateFin;
    }

    /**
     * setter dateFin
     *
     * @param dateFin date de fin de la session
     */
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * getter nbreInscrits
     *
     * @return identifiant du client
     */
    public int getNbreInscrits() {
        return nbreInscrits;
    }

    /**
     * setter nbreInscrits
     *
     * @param nbreInscrits nombre d'inscrits dans la session de cours
     */
    public void setNbreInscrits(int nbreInscrits) {
        this.nbreInscrits = nbreInscrits;
    }

    /**
     * getter listFormateurs
     *
     * @return la liste des formateurs
     */
    public ArrayList<Formateur> getListFormateurs() {
        return listFormateurs;
    }

    /**
     * setter listeFormateurs
     *
     * @param listFormateurs liste des formateurs
     */
    public void setListFormateurs(ArrayList<Formateur> listFormateurs) {
        this.listFormateurs = listFormateurs;
    }

    /**
     * getter listeCours

     * @return la liste des cours
     */
    public ArrayList<Cours> getListeCours() {
        return listeCours;
    }

    /**
     * setter listeCours
     *
     * @param listeCours liste des cours
     */
    public void setListeCours(ArrayList<Cours> listeCours) {
        this.listeCours = listeCours;
    }

    /**
     * égalité de deux sessions  basées sur le triplet nombre d'inscrits, date de début et date de fin
     * @param o autre élément
     * @return égalité ou pas
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SessionCours that)) return false;
        return nbreInscrits == that.nbreInscrits && Objects.equals(dateDebut, that.dateDebut) && Objects.equals(dateFin, that.dateFin);
    }

    /**
     * calcul du hashcode de la session basé sur le duo date de début et date de fin de la session
     * @return valeur du hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(dateDebut, dateFin);
    }

    /**
     * méthode toString
     *
     * @return informations complètes de la session de cours
     */
    @Override
    public String toString() {
        return "SessionCours{" +
                "idSessionCours=" + idSessionCours +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", nbreInscrits=" + nbreInscrits +
                ", listFormateurs=" + listFormateurs +
                ", listeCours=" + listeCours +
                '}';
    }
}
