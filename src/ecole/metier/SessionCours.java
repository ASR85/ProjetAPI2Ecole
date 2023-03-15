package ecole.metier;

import java.time.LocalDate;
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
    protected LocalDate dateDebut;

    /**
     * Date de fin de la session de cours
     */
    protected LocalDate dateFin;

    /**
     * Nombre d'inscrits pour la session de cours
     */
    protected int nbreInscrits;


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
    public LocalDate getDateDebut() {
        return dateDebut;
    }

    /**
     * setter dateDebut
     *
     * @param dateDebut date de début de la session
     */
    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * getter dateFin
     *
     * @return date de fin de la session
     */
    public LocalDate getDateFin() {
        return dateFin;
    }

    /**
     * setter dateFin
     *
     * @param dateFin date de fin de la session
     */
    public void setDateFin(LocalDate dateFin) {
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
                '}';
    }
}