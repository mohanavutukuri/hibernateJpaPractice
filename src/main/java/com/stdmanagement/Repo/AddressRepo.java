package com.stdmanagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stdmanagement.Entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{

}
