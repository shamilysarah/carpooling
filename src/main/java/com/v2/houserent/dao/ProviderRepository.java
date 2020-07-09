package com.v2.houserent.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.v2.houserent.model.Provider;
@Repository
public interface ProviderRepository extends JpaRepository<Provider, String> {

	


	//List<Provider> findAll();

}
