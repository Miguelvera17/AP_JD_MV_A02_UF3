package com.iticbcn.mongoApi.Service;

import com.iticbcn.mongoApi.DTO.StudentDTO;
import com.iticbcn.mongoApi.Model.Student;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentService {

    Mono<Student> save(StudentDTO studentDTO);

    Mono<Student> findById(String id);

    Flux<Student> findAll();

    Mono<Student> update(StudentDTO studentDTO);

    Mono<Void> delete(String id);

    public Flux<Student> findByNamePattern(String pattern);
}