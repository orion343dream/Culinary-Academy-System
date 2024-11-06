package lk.ijse.DAO.custom;

import lk.ijse.DAO.SuperDAO;
import lk.ijse.Entity.Student;

import java.util.List;

public interface QueryDAO extends SuperDAO {

    List<Student> getAllProgramsStudent();
    List<Object[]> getAllEqualByProgramName(String programName);
}
