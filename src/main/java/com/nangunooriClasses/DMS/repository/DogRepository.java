package com.nangunooriClasses.DMS.repository;

import java.util.List;



import org.springframework.data.repository.CrudRepository;

import com.nangunooriClasses.DMS.Models.Dog;

/**
*
* @author Vinaychary Nangunoori
*/

public interface DogRepository extends CrudRepository<Dog,Integer> {
	
	List<Dog>findByName(String name);

}
