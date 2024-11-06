package lk.ijse.DAO.custom;

import lk.ijse.DAO.SuperDAO;
import lk.ijse.Entity.Student;

import java.util.List;

public interface StudentDAO extends SuperDAO {

    void saveStudent(Student student);
    void deleteStudent(Student student);
    void updateStudent(Student student);
    List<Student> getAllStudent();
    Student getStudent(String studentId);
    Long getStudentCount();
}
