package repositories;

import entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indique que cette interface est un composant Spring (un bean) représentant un dépôt
public interface CompteRepository extends JpaRepository<Compte, Long> {
    // Cette interface étend JpaRepository avec Compte en tant que type d'entité et Long en tant que type d'ID

    // Par héritage de JpaRepository, CompteRepository dispose déjà de méthodes pour effectuer des opérations CRUD

}
