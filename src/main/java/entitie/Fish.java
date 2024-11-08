package entitie;

import enumPack.FishLivEnv;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Classe charactérise des poissons, format JPA POJO pour créer une table "fish" dans la base de données.
 * Cette classe hérite de la classe Animal
 */
@Entity
@Table(name = "fish")
public class Fish extends Animal implements Serializable {
    /**
     * Enum du type d'envionnement où vive un animal
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "LIVING_ENV")
    private FishLivEnv livingEnv;

    /**
     *Constructeur vide pour que la classe soit POJO
     */
    public Fish() {
    }

    /**
     * Constructeur
     * @param id
     * @param birth
     * @param couleur
     * @param livingEnv
     */
    public Fish(Long id, Date birth, String couleur, FishLivEnv livingEnv) {
        super(id, birth, couleur);
        this.livingEnv = livingEnv;
    }

    /** Getter
     *@return livingEnv
     */
    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }

    /** Setter
     *@param livingEnv livingEnv
     */
    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }
}
