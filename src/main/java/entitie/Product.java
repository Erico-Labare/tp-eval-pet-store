package entitie;

import enumPack.ProdType;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

/**
 * Classe charactérisant des produits, format JPA POJO pour créer une table "product" dans la base de données
 */
@Entity
@Table(name = "product")
public class Product implements Serializable {
    /**
     * Id qui sert de clef primaire dans la table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    /**
     * Code identifiant un produit
     */
    @Column(name = "CODE")
    private String code;
    /**
     * Nom du produit
     */
    @Column(name = "LABEL")
    private String label;
    /**
     * Catégorie du produit issue de l'enum "ProdType"
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE")
    private ProdType type;
    /**
     * Prix du produit
     */
    @Column(name = "PRICE")
    private double price;

    /**
     * Liaison Many to Many avec la table "pet_store" représentée dans la classe Product
     */
    @ManyToMany(mappedBy = "products")
    private Set<PetStore> petStores;

    /**
     *Constructeur vide pour que la classe soit POJO
     */
    public Product() {
    }

    /**
     * Constructeur
     * @param code code
     * @param label label
     * @param type type
     * @param price price
     */
    public Product(String code, String label, ProdType type, double price) {
        this.code = code;
        this.label = label;
        this.type = type;
        this.price = price;
    }

    /** Setter
     *@param code code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** Setter
     *@param label label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /** Setter
     *@param type type
     */
    public void setType(ProdType type) {
        this.type = type;
    }

    /** Setter
     *@param price price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}

