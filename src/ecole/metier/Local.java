package ecole.metier;

import java.util.Objects;

/**
 * Class métier de gestion d'un local
 * @author Arnaud
 * @version 1.0
 */

public class Local {

    /**
     * Identifiant unqiue du local
     */
    protected int idLocal;

    /**
     * Sigle du local
     */
    protected String sigle;

    /**
     * Nombre de place disponibles pour le local
     */
    protected int places;

    /**
     * Constructeur par défaut
     */
    public Local(){};

    /**
     * Constructeur Paramétrés
     * @param idLocal id numérique unique du local
     * @param sigle sigle du local
     * @param places Nombre de places disponibles dans le local
     */
    public Local(int idLocal, String sigle, int places) {
        this.idLocal = idLocal;
        this.sigle = sigle;
        this.places = places;
    }

    /**
     * Getter idLocal
     * @return l'identifiant du local
     */
    public int getIdLocal() {
        return idLocal;
    }

    /**
     * Setter identifiant du local
     * @param idLocal identifiant du local
     */
    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    /**
     * Getter sigle
     * @return sigle du local
     */
    public String getSigle() {
        return sigle;
    }

    /**
     * Setter sigle
     * @param sigle Sigle du local
     */
    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    /**
     * Getter places
     * @return places disponibles
     */
    public int getPlaces() {
        return places;
    }

    /**
     * Setter places
     * @param places Places du local
     */
    public void setPlaces(int places) {
        this.places = places;
    }

    /**
     * égalité de deux locaux basée sur le sigle du local
     * @param o Autre local
     * @return égalité ou pas
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Local local)) return false;
        return sigle.equals(local.sigle);
    }

    /**
     * calcul du hashcode du local basé sur le sigle du local
     * @return hashcode du local
     */
    @Override
    public int hashCode() {
        return Objects.hash( sigle);
    }

    /**
     * Méthode toString
     * @return Les informations complétes d'un Local
     */
    @Override
    public String toString() {
        return "Local{" +
                "idLocal=" + idLocal +
                ", sigle='" + sigle + '\'' +
                ", places=" + places +
                '}';
    }
}
