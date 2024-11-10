TP réalisé par Abel Correia

------------------------------------

Pour le persistence.xml :

- Ci-dessous mon persistence.xml joint dans le dépôt.

"<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<persistence xmlns="https://jakarta.ee/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="https://jakarta.ee/xml/ns/persistence https://jakarta.ee/xml/ns/persistence/persistence_3_1.xsd"
             version="3.1">
    <persistence-unit name="tp-eval-pet-store">
        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
        <properties>
            <property name="jakarta.persistence.jdbc.url" value="jdbc:mariadb://localhost:3307/petstore"/>
            <property name="jakarta.persistence.jdbc.user" value="root"/>
            <property name="jakarta.persistence.jdbc.password" value=""/>
            <property name="jakarta.persistence.jdbc.driver" value="org.mariadb.jdbc.Driver"/>
            <property name="hibernate.show_sql" value="true"/>
            <property name="hibernate.format_sql" value="true"/>
        </properties>
    </persistence-unit>
</persistence>"

- Changez la partie <proprities> pour qu'elle soit utilisable sur votre  machine, soit :
  - verifiez que la partie "jdbc:mariadb://localhost:3307/" soit renseigné adéquatement pour vous (en fonction de si vous utilisez mariDB, SQL ou autre ; et en fonction de votre port)
  - remplacez la partie "root" dans "<property name="jakarta.persistence.jdbc.user" value="root"/>" avec votre nom utilisateur d'accès à votre serveur
  - remplacez la partie "" dans "<property name="jakarta.persistence.jdbc.password" value=""/>" avec votre mot de passe utilisateur d'accès à votre serveur
  - verifiez que la partie "value="org.mariadb.jdbc.Driver" soit renseigné adéquatement pour vous (en fonction de si vous utilisez mariDB, SQL ou autre)
  
------------------------------------
