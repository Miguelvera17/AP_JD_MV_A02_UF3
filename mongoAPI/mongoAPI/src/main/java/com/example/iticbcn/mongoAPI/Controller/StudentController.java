import com.tu.paquete.dto.StudentDTO;
import com.tu.paquete.model.Student;
import com.tu.paquete.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save")
    public Mono<Student> save(@RequestBody StudentDTO studentDTO) {
        return studentService.save(studentDTO);
    }

    @GetMapping("/{id}")
    public Mono<Student> findById(@PathVariable String id) {
        return studentService.findById(id);
    }

    @GetMapping("/all")
    public Flux<Student> findAll() {
        return studentService.findAll();
    }

    @PutMapping("/update")
    public Mono<Student> update(@RequestBody StudentDTO studentDTO) {
        return studentService.update(studentDTO);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return studentService.delete(id);
    }
}

