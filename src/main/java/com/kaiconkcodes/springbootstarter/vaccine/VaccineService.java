package com.kaiconkcodes.springbootstarter.vaccine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // create a singleton class
public class VaccineService {
	
	@Autowired
	//private VaccineRepository vaccineRepository;

		private List<Vaccine> vaccines = new ArrayList<>(Arrays.asList(
			 new Vaccine("CM1", "COVID Moderna 1", "COVID Moderna Shot 1", "01/21/2021", ""),
			 new Vaccine("CM2", "COVID Moderna 2", "COVID Moderna Shot 2", "02/05/2021", "02/05/2021"),
			 new Vaccine("CM3", "Influenza HB12", "Influenza HB12", "03/20/2020", "03/20/2021")));
	 
	
	 public List<Vaccine> getAllVacines() {
		return vaccines;
	 } 
	 
		/*
	 public List<Vaccine> getAllVacines() {
		// this is intialized only once bc this class is a Spring Service (singleton)
		//List<Vaccine> vaccineList = new ArrayList<>();
		//vaccineRepository.findAll()
		//.forEach(vaccineList::add);
		// return vaccineList;	
		return (List<Vaccine>) vaccineRepository.findAll();
	}
	
	*/
	
	public Vaccine getVaccine(String id) {
		return vaccines.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addVaccine(Vaccine vaccine) {
		vaccines.add(vaccine);
		//vaccineRepository.save(vaccine);
	}

	public void updateVaccine(Vaccine vaccine, String id) {
		for (int i=0; i< vaccines.size(); i++) {
			Vaccine aVaccine = vaccines.get(i);
			if (aVaccine.getId().equals(id)) {
				vaccines.set(i, vaccine);
				return;
			}	
		}	
	}

	public void deleteVaccine(String id) {
		vaccines.removeIf(t -> t.getId().equals(id));
	} 
}
