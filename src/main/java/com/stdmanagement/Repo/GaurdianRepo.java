package com.stdmanagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stdmanagement.Entity.Gaurdian;

@Repository
public interface GaurdianRepo extends JpaRepository<Gaurdian, Integer>{

}
