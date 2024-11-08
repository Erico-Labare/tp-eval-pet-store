package entitie;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Classe charactérise des animaux, format JPA POJO pour créer une table "animal" dans la base de données.
 * Cette classe est la class mère de plusieurs classes filles
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "animal")
public abstract class Animal implements Serializable {
    /**
     * Id qui sert de clef primaire dans la table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    /**
     * Date de naissance
     */
    @Column(name = "BIRTH")
    private Date birth;
    /**
     * Couleur de la peau/poils/écailles
     */
    @Column(name = "COULEUR")
    private String couleur;

    /**
     *Constructeur vide pour que la classe soit POJO
     */
    public Animal() {
    }

    /**
     * Constructeur
     * @param id
     * @param birth
     * @param couleur
     */
    public Animal(Long id, Date birth, String couleur) {
        this.id = id;
        this.birth = birth;
        this.couleur = couleur;
    }

    /** Getter
     *@return id
     */
    public Long getId() {
        return id;
    }

    /** Setter
     *@param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** Getter
     *@return birth
     */
    public Date getBirth() {
        return birth;
    }

    /** Setter
     *@param birth birth
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /** Getter
     *@return couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /** Setter
     *@param couleur couleur
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
