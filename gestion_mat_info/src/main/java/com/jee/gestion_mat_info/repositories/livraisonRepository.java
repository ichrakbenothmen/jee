package com.jee.gestion_mat_info.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jee.gestion_mat_info.models.livraison;


public interface livraisonRepository extends JpaRepository<livraison, Long> {

}
