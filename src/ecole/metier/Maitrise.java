package ecole.metier;

import java.util.Objects;

/**
 * Classe Métier de la maitrise
 * @author Arnaud
 * @version 1.0
 * @see Formateur
 * @see Cours
 */
public class Maitrise {
    /**
     * Identifiant unique de la maitrise
     */
    protected int idMaitrise;

    /**
     * Degrès de maitrise
     */
    protected int degreMaitrise;


    /**
     * Formateur relié à la maitise
     */
    protected Formateur formateur;

    /**
     * Constructeur par défaut
     */
    public Maitrise(){}

    /**
     * Constructeur Paramétré
     * @param idMaitrise identifiant de la maitrise
     * @param degreMaitrise Degré de la maitrise 1 2 ou 3
     */
    public Maitrise(int idMaitrise, int degreMaitrise, Formateur formateur) {
        this.idMaitrise = idMaitrise;
        this.degreMaitrise = degreMaitrise;
        this.formateur = formateur;
    }

    public int getIdMaitrise() {
        return idMaitrise;
    }

    public void setIdMaitrise(int idMaitrise) {
        this.idMaitrise = idMaitrise;
    }

    public int getDegreMaitrise() {
        return degreMaitrise;
    }

    public void setDegreMaitrise(int degreMaitrise) {
        this.degreMaitrise = degreMaitrise;
    }

    /**
     * test d'égalité base sur le degré de maitrise
     * @param o autre degré de maitrise
     * @return égalité ou pas
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Maitrise maitrise)) return false;
        return degreMaitrise == maitrise.degreMaitrise;
    }

    /**
     * calcul du hashcode basé sur le degreMaitrise
     * @return hashcode du degré de maitrise
     */
    @Override
    public int hashCode() {
        return Objects.hash(degreMaitrise);
    }

    /**
     * méthode toString
     *
     * @return informations complètes de la maitrise
     */
    @Override
    public String toString() {
        return "Maitrise{" +
                "idMaitrise=" + idMaitrise +
                ", degreMaitrise=" + degreMaitrise +
                ", formateur=" + formateur +
                '}';
    }
}
