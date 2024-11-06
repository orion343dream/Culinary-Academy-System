package lk.ijse.BO.custom;

import lk.ijse.BO.SuperBO;
import lk.ijse.DTO.StudentDTO;

import java.util.List;

public interface DashboardBO extends SuperBO {

    Long getCulinaryProgramCount();
    Long getStudentCount();
    List<StudentDTO> getAllProgramStudents();
}
