package com.kaiconkcodes.springbootstarter.vaccine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Annotation converts the return object/type to JSON format automatically 
@RestController
public class VaccineController {
	
	// Inject this service into class
	@Autowired
	private VaccineService vaccineService;
	
	// Spring MVC maps executes method when URL is specified, then takes the return object/type
	// HTTP GET request - don't need to specify the RequestMapping bc GET is the default
	 @RequestMapping("/vxs")
	public List<Vaccine> getAllVaccines() {
		// only hits db once bc this service is a singleton and there is only one copy of it in memory
		return vaccineService.getAllVacines();
	}
	
	// HTTP GET request (default)
	@RequestMapping("/vxs/{id}") // {id} tell Spring this is a variable
	public Vaccine getVaccin(@PathVariable String id) {
		return vaccineService.getVaccine(id);
	}

	// HTTP POST request (create)
	@RequestMapping(method=RequestMethod.POST, value="/vxs")
	// tell Spring MVC that your request payload is going to contain a JSON representation 
	// of the Vaccine instance, convert it to object representation and pass it to the 
	// addVaccine method when this URL is mapped so we can add it to the vaccine list
	public void addVaccine(@RequestBody Vaccine vaccine) {
		vaccineService.addVaccine(vaccine);
	}
	
	// HTTP PUT request (update)
	@RequestMapping(method=RequestMethod.PUT, value="/vxs/{id}")
	public void updateVaccine(@RequestBody Vaccine vaccine, @PathVariable String id) {
		vaccineService.updateVaccine(vaccine, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/vxs/{id}")
	public void deleteVaccine(@PathVariable String id) {
		vaccineService.deleteVaccine(id);
	}
 
}
