package com.springmongo.springmongo.repo;

import com.springmongo.springmongo.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MessageRepo extends MongoRepository<Message, Long> {

}
