package com.jee.gestion_mat_info.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jee.gestion_mat_info.models.commande;

public interface commandeRepository extends JpaRepository<commande, Long> {

}
