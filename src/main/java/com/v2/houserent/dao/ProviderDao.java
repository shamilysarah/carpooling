package com.v2.houserent.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.v2.houserent.model.Provider;
import com.v2.houserent.model.User;
@Repository
public class ProviderDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public void upload(Provider provider) {
		 String sql = "insert into providers values(?,?,?,?,?,?,?)";
		    jdbcTemplate.update(sql, new Object[] { provider.getUsername(), provider.getCarnum(), provider.getOrigin(),
		    		provider.getDestination(), provider.getStarttime(), provider.getVacancy(), provider.getAmount() });
		    }

		
	}

	
		
	


