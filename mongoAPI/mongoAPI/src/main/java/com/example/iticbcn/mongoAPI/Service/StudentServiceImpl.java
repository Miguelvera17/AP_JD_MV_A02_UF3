import com.tu.paquete.model.Student;
import com.tu.paquete.dto.StudentDTO;
import com.tu.paquete.mapper.StudentMapper;
import com.tu.paquete.repository.StudentRepo;
import com.tu.paquete.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepo;

    @Autowired
    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public Mono<Student> save(StudentDTO studentDTO) {
        Student student = StudentMapper.toEntity(studentDTO);
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
            .map(existing -> StudentMapper.toEntity(studentDTO))
            .flatMap(studentRepo::save);
    }

    @Override
    public Mono<Void> delete(String id) {
        return studentRepo.deleteById(id);
    }
}
