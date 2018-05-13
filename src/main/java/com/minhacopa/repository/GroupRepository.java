package com.minhacopa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.minhacopa.model.Group;

@Repository
public interface GroupRepository extends MongoRepository<Group, String> {
    // 
}