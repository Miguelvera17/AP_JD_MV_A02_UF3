package com.example.iticbcn.mongoAPI.Repository;

import com.example.iticbcn.mongoAPI.Model.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends ReactiveMongoRepository<Student, String> {
}
