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
     *
     * @param id id
     * @param birth birth
     * @param couleur couleur
     * @param petStore petStore
     * @param livingEnv livingEnv
     */
    public Fish(Long id, Date birth, String couleur, PetStore petStore, FishLivEnv livingEnv) {
        super(id, birth, couleur, petStore);
        this.livingEnv = livingEnv;
    }

    /** Setter
     *@param livingEnv livingEnv
     */
    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }
}
