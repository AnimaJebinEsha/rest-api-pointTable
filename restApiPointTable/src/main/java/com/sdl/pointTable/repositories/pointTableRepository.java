package com.sdl.pointTable.repositories;

import com.sdl.pointTable.models.pointTable;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface pointTableRepository extends MongoRepository<pointTable, String> {
	pointTable findBy_id(ObjectId _id);
}
