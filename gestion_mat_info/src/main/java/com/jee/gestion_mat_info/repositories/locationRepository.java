package com.jee.gestion_mat_info.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jee.gestion_mat_info.models.location;

public interface locationRepository extends JpaRepository<location, Long> {

}
