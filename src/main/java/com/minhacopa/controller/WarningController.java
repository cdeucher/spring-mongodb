package com.minhacopa.controller;

import java.util.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.minhacopa.repository.WarningRepository;
import com.minhacopa.model.Warning;

@RestController
@CrossOrigin(origins = "http://www:4200")
@RequestMapping(value = "/war")
public class WarningController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	private final WarningRepository warningRepository;
	
	public WarningController(WarningRepository warningRepository) {
		this.warningRepository = warningRepository;
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Warning> getAllWarnings() {
		LOG.info("Getting all Warnings.");
		return warningRepository.findAll();
	}
		
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Warning addNewWarnings(@RequestBody Warning warning) {
		LOG.info("Saving Warning.");
		System.out.println(warning.getName());		
		return warningRepository.save(warning);
	}	
	
	@RequestMapping(value = "/del/{warningId}", method = RequestMethod.POST)
	public Warning delWarning(@PathVariable String warningId) {
		LOG.info("Getting warning with ID: {}.", warningId);
		Warning warning = warningRepository.findOne(warningId);
		
		warningRepository.delete(warning);
		return warning;
	}	
	
	@RequestMapping(value = "/run", method = RequestMethod.GET)
	public ArrayList<String> run() {
		LOG.info("Run.");
		ArrayList<String> log = new ArrayList();
		log.add("Start run");
		
		
		///
		Warning tmp = new Warning();
		tmp.setName("go..");
		warningRepository.save(tmp);
		///
		log.add("add go");
		
		return log;
	}	
}
