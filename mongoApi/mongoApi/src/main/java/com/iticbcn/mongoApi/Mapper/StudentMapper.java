package com.iticbcn.mongoApi.Mapper;

import com.iticbcn.mongoApi.DTO.StudentDTO;
import com.iticbcn.mongoApi.Model.Student;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDTO studentToStudentDTO(Student student);
    Student studentDTOToStudent(StudentDTO studentDTO);

    List<StudentDTO> studentListToDTOList(List<Student> students);
    List<Student> dtoListToStudentList(List<StudentDTO> studentDTOs);
}
