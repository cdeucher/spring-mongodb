package com.minhacopa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.minhacopa.model.Caso;

@Repository
public interface CasoRepository extends MongoRepository<Caso, String> {

}
