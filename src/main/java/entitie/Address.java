
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
     * @param id
     * @param number
     * @param street
     * @param zipCode
     * @param city
     */
    public Address(Long id, String number, String street, String zipCode, String city) {
        this.id = id;
        this.number = number;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
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
     *@return number
     */
    public String getNumber() {
        return number;
    }

    /** Setter
     *@param number number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** Getter
     *@return street
     */
    public String getStreet() {
        return street;
    }

    /** Setter
     *@param street street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /** Getter
     *@return zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /** Setter
     *@param zipCode zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /** Getter
     *@return city
     */
    public String getCity() {
        return city;
    }

    /** Setter
     *@param city city
     */
    public void setCity(String city) {
        this.city = city;
    }
}
