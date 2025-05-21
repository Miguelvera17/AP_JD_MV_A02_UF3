package com.example.iticbcn.mongoAPI.Controller;
import com.example.iticbcn.mongoAPI.Service.StudentService;
import com.example.iticbcn.mongoAPI.DTO.StudentDTO;
import com.example.iticbcn.mongoAPI.Model.Student; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Mono<Student> save(@RequestBody StudentDTO studentDTO) {
        return studentService.save(studentDTO);
    }

    @GetMapping
    public Flux<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Student> findById(@PathVariable String id) {
        return studentService.findById(id);
    }

    @PutMapping
    public Mono<Student> update(@RequestBody StudentDTO studentDTO) {
        return studentService.update(studentDTO);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return studentService.delete(id);
    }
}


