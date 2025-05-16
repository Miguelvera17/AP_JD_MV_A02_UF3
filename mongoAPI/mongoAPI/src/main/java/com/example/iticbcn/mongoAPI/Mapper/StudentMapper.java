package com.tu.paquete.mapper;

import com.tu.paquete.model.Student;
import com.tu.paquete.dto.StudentDTO;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDTO studentToStudentDTO(Student student);
    Student studentDTOToStudent(StudentDTO studentDTO);

    List<StudentDTO> studentListToDTOList(List<Student> students);
    List<Student> dtoListToStudentList(List<StudentDTO> studentDTOs);
}
