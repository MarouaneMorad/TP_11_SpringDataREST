package com.tp.tp_11_springdatarest.reposirories;

import com.tp.tp_11_springdatarest.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource permet de personnaliser le chemin d'accès des endpoints REST.
// pour les personnaliser
@RepositoryRestResource(path = "comptes", collectionResourceRel = "comptes", itemResourceRel = "compte")
public interface CompteRepository extends JpaRepository<Compte, Long> {
}