package ecole.metier;

import javax.sound.midi.MidiChannel;
import java.util.Objects;

/**
 * Class Cours de l'école
 * @author Arnaud
 * @version 1.0
 */
public class Cours {

    /**
     * Identifiant unique du cours
     */
    private int idCours;

    /**
     * Matière du cours
     */
    private String matiere;

    /**
     * Description du cours
     */
    private String description;

    /**
     * Constructeur par défaut
     */
    public Cours(){}

    /***
     * Constructeur Paramétré
     * @param idCours identifiant du cours
     * @param matiere Matière du cours
     * @param description Description du cours
     */
    public Cours (int idCours, String matiere, String description){

        this.idCours = idCours;
        this.matiere = matiere;
        this.description = description;
    }

    /**
     * Getter idCours
     * @return identifiant du cours
     */
    public int getIdCours() {
        return idCours;
    }

    /**
     * Setter idCours
     * @param id Identifiant du cours
     */
    public void setIdCours(int id) {
        this.idCours = idCours;
    }

    /**
     * Getter Matiere
     * @return matière du cours
     */
    public String getMatiere() {
        return matiere;
    }

    /**
     * Setter matiere
     * @param matiere Matière du cours
     */
    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    /**
     * Getter description
     * @return Description du cours
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter description
     * @param description Descrption du cours
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Egalité de deux cours basée sur le duo matiere, descrption
     * @param o autre élément
     * @return égalité ou pas
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cours cours)) return false;
        return  matiere.equals(cours.matiere) && description.equals(cours.description);
    }

    /**
     * calcul du hashcode du cours basé sur le duo matiere, description
     * @return valeur du hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(matiere, description);
    }

    /**
     * Méthode toString
     * @return Toutes les informations d'un cours
     */
    @Override
    public String toString() {
        return "Cours{" +
                "id=" + idCours +
                ", matiere='" + matiere + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
