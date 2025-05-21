package com.example.iticbcn.mongoAPI.Mapper;
import com.example.iticbcn.mongoAPI.DTO.StudentDTO;
import com.example.iticbcn.mongoAPI.Model.Student;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDTO studentToStudentDTO(Student student);
    Student studentDTOToStudent(StudentDTO studentDTO);

    List<StudentDTO> studentListToDTOList(List<Student> students);
    List<Student> dtoListToStudentList(List<StudentDTO> studentDTOs);
}
