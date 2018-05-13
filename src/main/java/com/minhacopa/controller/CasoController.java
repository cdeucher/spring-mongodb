package com.minhacopa.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

import com.minhacopa.model.Caso;
import com.minhacopa.model.Group;
import com.minhacopa.repository.CasoRepository;

@RestController
@CrossOrigin(origins = "http://www:4200")
@RequestMapping(value = "/caso")
public class CasoController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	private final CasoRepository casoRepository;
	
	public CasoController(CasoRepository casoRepository) {
		this.casoRepository = casoRepository;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Caso All() {
		LOG.info("All.");
		Caso caso = new Caso();
		return caso;
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Caso> getAllCasos() {
		LOG.info("Getting all Casos.");
		return casoRepository.findAll();
	}	
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Caso addNewCasos(@RequestBody String data) {
		LOG.info("Saving Caso.");
		LOG.info(data);
		Gson g = new Gson();
		Caso caso = g.fromJson(data, Caso.class);
		System.out.println(caso.getNm_PACIENT());		
		return casoRepository.save(caso);
	}	
	
	@RequestMapping(value = "/del/{casoId}", method = RequestMethod.POST)
	public Caso delCaso(@PathVariable String casoId) {
		LOG.info("Getting Caso with ID: {}.", casoId);
		Caso caso = casoRepository.findOne(casoId);
		
		casoRepository.delete(caso);
		return caso;
	}	
}
