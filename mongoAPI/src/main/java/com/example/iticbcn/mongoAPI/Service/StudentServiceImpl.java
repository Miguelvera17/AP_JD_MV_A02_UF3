package com.example.iticbcn.mongoAPI.Service;

import com.example.iticbcn.mongoAPI.DTO.StudentDTO;
import com.example.iticbcn.mongoAPI.Model.Student;
import com.example.iticbcn.mongoAPI.Repository.StudentRepository;
import com.example.iticbcn.mongoAPI.Mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepo;
    private final StudentMapper studentMapper;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepo, StudentMapper studentMapper) {
        this.studentRepo = studentRepo;
        this.studentMapper = studentMapper;
    }

    @Override
    public Mono<Student> save(StudentDTO studentDTO) {
        Student student = studentMapper.studentDTOToStudent(studentDTO);
        return studentRepo.save(student);
    }

    @Override
    public Mono<Student> findById(String id) {
        return studentRepo.findById(id);
    }

    @Override
    public Flux<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Mono<Student> update(StudentDTO studentDTO) {
        return studentRepo.findById(studentDTO.id())
            .map(existing -> studentMapper.studentDTOToStudent(studentDTO))
            .flatMap(studentRepo::save);
    }

    @Override
    public Mono<Void> delete(String id) {
        return studentRepo.deleteById(id);
    }
}
