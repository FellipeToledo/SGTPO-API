package com.spring.sgtpoapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.sgtpoapi.entity.SgtpoApiEntity;

@Repository
public interface SgtpoApiRepository extends JpaRepository<SgtpoApiEntity, Long>{

}
