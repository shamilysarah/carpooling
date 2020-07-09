package com.v2.houserent.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.v2.houserent.dao.ProviderDao;
import com.v2.houserent.dao.ProviderRepository;
import com.v2.houserent.model.Provider;
@Service
public class ProviderService {
	@Autowired
	ProviderDao providerDao;
	@Autowired
	ProviderRepository providerRepository;
	
	public void upload(Provider provider) {
		providerDao.upload(provider);
		}
		
         	public List<Provider> getAllProviders() {
			 return  (List<Provider>)providerRepository.findAll();

	
	}
			
}
