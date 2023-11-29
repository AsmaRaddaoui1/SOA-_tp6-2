package entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity // Cette annotation indique que cette classe est une entité JPA
public class Compte {

    @Id // Annotation définissant cet attribut comme clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Définit la stratégie de génération de la clé primaire
    private Long id; // Identifiant unique du compte

    private double solde; // Solde du compte

    private Date dateCreation; // Date de création du compte

    @Enumerated(EnumType.STRING) // Indique que cet attribut est une énumération enregistrée sous forme de chaîne de caractères
    private etatCompte etat; // État du compte, utilise l'énumération etatCompte

    @Enumerated(EnumType.STRING) // Indique que cet attribut est une énumération enregistrée sous forme de chaîne de caractères
    private typeCompte type; // Type de compte, utilise l'énumération typeCompte

    // Méthodes setter et getter pour chaque attribut
    // Ces méthodes permettent de définir et d'obtenir les valeurs des attributs de la classe

    // Enumération pour les différents types de compte possibles
    public enum typeCompte {
        COURANT, // Compte courant
        EPARGNE // Compte épargne
    }

    // Enumération pour les différents états du compte possibles
    public enum etatCompte {
        CREE, // Compte créé
        ACTIVE, // Compte actif
        SUSPENDU, // Compte suspendu
        BLOQUE // Compte bloqué
    }
}
