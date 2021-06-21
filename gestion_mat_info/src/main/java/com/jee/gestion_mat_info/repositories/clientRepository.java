package com.jee.gestion_mat_info.repositories;

import org.springframework.data.jpa.repository.JpaRepository;



import com.jee.gestion_mat_info.models.client;

public interface clientRepository extends JpaRepository<client, Integer > {
// reduce the amount of code required to implement data access liers ;
}

