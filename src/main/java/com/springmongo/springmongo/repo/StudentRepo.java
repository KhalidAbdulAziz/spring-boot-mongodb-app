package com.springmongo.springmongo.repo;

import com.springmongo.springmongo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student, Long> {
}
