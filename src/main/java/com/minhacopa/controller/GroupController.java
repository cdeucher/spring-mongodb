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

import com.minhacopa.repository.GroupRepository;
import com.minhacopa.model.Group;

/*
 * http://localhost:8102/api/create
 * 
 * {
  "groupId": "5af39d74f7185d2e94f9a6ba",
  "name": "1111111111",
  "creationDate": 1516165830856,
  "groupSettings": {
    "bike" : "1111"
  }
}
 * */

@RestController
@CrossOrigin(origins = "http://www:4200")
@RequestMapping(value = "/")
public class GroupController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	private final GroupRepository groupRepository;
	
	
	public GroupController(GroupRepository groupRepository) {
		this.groupRepository = groupRepository;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Group All() {
		LOG.info("All.");
		Group group = new Group();
		return group;
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Group> getAllGroups() {
		LOG.info("Getting all Group.");
		return groupRepository.findAll();
	}
	
	@RequestMapping(value = "/{groupId}", method = RequestMethod.GET)
	public Group getGroup(@PathVariable String groupId) {
		LOG.info("Getting Group with ID: {}.", groupId);
		return groupRepository.findOne(groupId);
	}
	
	@RequestMapping(value = "/del/{groupId}", method = RequestMethod.POST)
	public Group delGroup(@PathVariable String groupId) {
		LOG.info("Getting Group with ID: {}.", groupId);
		Group group = groupRepository.findOne(groupId);
		
		groupRepository.delete(group);
		return group;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Group addNewGroups(@RequestBody Group group) {
		LOG.info("Saving Group.");	
		return groupRepository.save(group);
	}
	
	@RequestMapping(value = "/settings/{userId}", method = RequestMethod.GET)
	public Object getAllGroupSettings(@PathVariable String groupId) {
		Group group = groupRepository.findOne(groupId);
		if (group != null) {
			return group.getGroupSettings();
		} else {
			return "Group not found.";
		}
	}
	
	@RequestMapping(value = "/settings/{userId}/{key}", method = RequestMethod.GET)
	public String getGroupSetting(@PathVariable String groupId, @PathVariable String key) {
		Group group = groupRepository.findOne(groupId);
		if (group != null) {
			return group.getGroupSettings().get(key);
		} else {
			return "Group not found.";
		}
	}
	
	@RequestMapping(value = "/settings/{groupId}/{key}/{value}", method = RequestMethod.GET)
	public String addGroupSetting(@PathVariable String groupId, @PathVariable String key, @PathVariable String value) {
		Group group = groupRepository.findOne(groupId);
		if (group != null) {
			group.getGroupSettings().put(key, value);
			groupRepository.save(group);
			return "Key added";
		} else {
			return "Group not found.";
		}
	}
}
