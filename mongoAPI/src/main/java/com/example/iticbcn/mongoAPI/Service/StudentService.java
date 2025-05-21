package com.example.iticbcn.mongoAPI.Service;

import com.example.iticbcn.mongoAPI.DTO.StudentDTO;
import com.example.iticbcn.mongoAPI.Model.Student;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentService {

    Mono<Student> save(StudentDTO studentDTO);

    Mono<Student> findById(String id);

    Flux<Student> findAll();

    Mono<Student> update(StudentDTO studentDTO);

    Mono<Void> delete(String id);
}
