package com.stdmanagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stdmanagement.Entity.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Integer>{

}
