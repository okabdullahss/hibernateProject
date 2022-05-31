package com.schoolProject.service;

import com.schoolProject.domain.Adress;
import com.schoolProject.repository.AdressRepository;

public class AdressServiceImp implements IAdressService{

	AdressRepository adressRepo = new AdressRepository();

	@Override
	public void saveAdress(Adress adress) {
		adressRepo.saveAdress(adress);
		
	}

	@Override
	public Adress getAdress(Integer id) {
		return adressRepo.getAdress(id);
	}

	@Override
	public void removeAdress(Adress adress) {
		adressRepo.removeAdress(adress);
		
	}
	
	

}
