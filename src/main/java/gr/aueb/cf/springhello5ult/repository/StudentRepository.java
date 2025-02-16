package gr.aueb.cf.springhello5ult.repository;

import gr.aueb.cf.springhello5ult.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query("SELECT COUNT (*) > 0 FROM Student s WHERE s.firstname = ?1 AND s.lastname = ?2")
    boolean isStudentExists(String firstname, String lastname);
}
