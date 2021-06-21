package com.jee.gestion_mat_info.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jee.gestion_mat_info.models.matériel;

public interface matérielRepository extends JpaRepository<matériel , Long> {

}
