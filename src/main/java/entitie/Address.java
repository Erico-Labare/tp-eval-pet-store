
package entitie;

import jakarta.persistence.*;

import java.io.Serializable;

/**
 * Classe charactérisant une adresse, format JPA POJO pour créer une table "adresse" dans la base de données
 */
@Entity
@Table(name = "address")
public class Address implements Serializable {
    /**
     * Id qui sert de clef primaire dans la table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    /**
     * Numero de la rue
     */
    @Column(name = "NUMBER")
    private String number;
    /**
     * Nom de rue
     */
    @Column(name = "STREET")
    private String street;
    /**
     * Code zip de d'adresse
     */
    @Column(name = "ZIP_CODE")
    private String zipCode;
    /**
     * Nom de la ville de l'adresse
     */
    @Column(name = "CITY")
    private String city;

    /**
     *Constructeur vide pour que la classe soit POJO
     */
    public Address() {
    }

    /**
     * Constructeur
     * @param number number
     * @param street street
     * @param zipCode zipCode
     * @param city city
     */
    public Address(String number, String street, String zipCode, String city) {
        this.number = number;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

    /** Setter
     *@param number number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** Setter
     *@param street street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /** Setter
     *@param zipCode zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /** Setter
     *@param city city
     */
    public void setCity(String city) {
        this.city = city;
    }
}
