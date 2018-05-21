package com.minhacopa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.minhacopa.model.Warning;

@Repository
public interface WarningRepository extends MongoRepository<Warning, String> {
    // 
}