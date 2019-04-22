package com.sdl.pointTable;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sdl.pointTable.models.pointTable;
import com.sdl.pointTable.repositories.pointTableRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pointTable")

public class pointTableController {
	@Autowired
	  private pointTableRepository repository;
	  
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<pointTable> getAllUsers() {
		  
	    return repository.findAll();
	  }

	  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  public pointTable getUsertById(@PathVariable("id") ObjectId id) {
		  System.out.println(repository.findBy_id(id).getTeam_Name());
	      return repository.findBy_id(id);
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public void modifyUserById(@PathVariable("id") ObjectId id, @Valid @RequestBody pointTable users) {
	    users.set_id(id);
	    repository.save(users);
	  }
	  
	  @RequestMapping(value = "/", method = RequestMethod.POST)
	  public pointTable createUser(@Valid @RequestBody pointTable users) {
	    users.set_id(ObjectId.get());
	    repository.save(users);
	    return users;
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	  public void deleteUser(@PathVariable ObjectId id) {
	    repository.delete(repository.findBy_id(id));
	  }
}
