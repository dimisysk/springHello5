package gr.aueb.cf.springhello5ult.maapper;

import gr.aueb.cf.springhello5ult.dto.StudentReadOnlyDTO;
import gr.aueb.cf.springhello5ult.model.Student;

public class Mapper {

    private Mapper() {}

    public static StudentReadOnlyDTO mapToReadOnlyDTO(Student student) {
        return  new StudentReadOnlyDTO(student.getId(), student.getFirstname(), student.getLastname());
    }
}
