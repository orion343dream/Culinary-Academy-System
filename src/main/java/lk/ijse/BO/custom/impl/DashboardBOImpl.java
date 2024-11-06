package lk.ijse.BO.custom.impl;

import lk.ijse.BO.custom.DashboardBO;
import lk.ijse.DAO.DAOFactory;
import lk.ijse.DAO.custom.CulinaryProgramDAO;
import lk.ijse.DAO.custom.QueryDAO;
import lk.ijse.DAO.custom.StudentDAO;
import lk.ijse.DTO.StudentDTO;
import lk.ijse.Entity.Student;

import java.util.ArrayList;
import java.util.List;

public class DashboardBOImpl implements DashboardBO {

    CulinaryProgramDAO culinaryProgramDAO = (CulinaryProgramDAO) DAOFactory.getDAO(DAOFactory.DAOType.PROGRAM);
    StudentDAO studentDAO = (StudentDAO) DAOFactory.getDAO(DAOFactory.DAOType.STUDENT);
    QueryDAO queryDAO = (QueryDAO) DAOFactory.getDAO(DAOFactory.DAOType.QUERY);

    @Override
    public Long getCulinaryProgramCount(){
        return culinaryProgramDAO.getCulinaryProgramCount();
    }

    @Override
    public Long getStudentCount(){
        return studentDAO.getStudentCount();
    }

    @Override
    public List<StudentDTO> getAllProgramStudents(){
        List<StudentDTO> studentDTOS = new ArrayList<>();
        List<Student> allProgramsStudent = queryDAO.getAllProgramsStudent();

        for (Student student : allProgramsStudent) {
            studentDTOS.add(new StudentDTO(student.getStudentId(),student.getName(),student.getAddress(),student.getTel(),student.getRegistrationDate(),student.getEnrollments()));
        }
        return studentDTOS;
    }
}
