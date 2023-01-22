package com.spring.sgtpoapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.sgtpoapi.entity.ConsortiumEntity;

@Repository
public interface ConsortiumRepository extends JpaRepository<ConsortiumEntity, Long>{

}
