import com.tu.paquete.model.Student;
import com.tu.paquete.dto.StudentDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentService {

    Mono<Student> save(StudentDTO studentDTO);

    Mono<Student> findById(String id);

    Flux<Student> findAll();

    Mono<Student> update(StudentDTO studentDTO);

    Mono<Void> delete(String id);
}
