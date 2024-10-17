package gr.aueb.cf.springhello5ult.rest;


import gr.aueb.cf.springhello5ult.dto.StudentReadOnlyDTO;
import gr.aueb.cf.springhello5ult.maapper.Mapper;
import gr.aueb.cf.springhello5ult.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloRestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello PAOKARA";
    }
    @RequestMapping("/students/{id}")
    public ResponseEntity<StudentReadOnlyDTO> getOneStudent(@PathVariable("id") Long id) {
        Student student = new Student(1L,"Dimi","Siskos");
        StudentReadOnlyDTO dto = Mapper.mapToReadOnlyDTO(student);
//        return new ResponseEntity<>(dto, HttpStatus.OK);
        return  ResponseEntity.ok(dto);
    }

    @RequestMapping("/students")
    public ResponseEntity<List<StudentReadOnlyDTO>> getAllStudents() {
        List<Student> students = List.of(new Student(1L,"Dimi","Siskos"),new Student(2L,"Lakis","Papadopoulos"),
                new Student(3L,"Samara","Georgiou"),
                new Student(4L,"George","Nikolaou"));

        List<StudentReadOnlyDTO> readOnlyDTOs = new ArrayList<>();
        for (Student student : students) {
            readOnlyDTOs.add(Mapper.mapToReadOnlyDTO(student));
        }
        return  ResponseEntity.ok(readOnlyDTOs);
    }
}
