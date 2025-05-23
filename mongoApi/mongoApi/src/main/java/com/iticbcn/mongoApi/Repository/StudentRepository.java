package com.iticbcn.mongoApi.Repository;

import com.iticbcn.mongoApi.Model.Student;

import reactor.core.publisher.Flux;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableReactiveMongoRepositories
public interface StudentRepository extends ReactiveMongoRepository<Student, String> {

    Flux<Student> findByNameRegex(String regex);
}