package com.schoolProject.service;

import com.schoolProject.domain.Adress;

public interface IAdressService {
	
	public void saveAdress(Adress adress);
	public Adress getAdress(Integer id);
	public void removeAdress(Adress adress);

}
