package lk.ijse.BO.custom.impl;

import lk.ijse.BO.custom.AddProgramBO;
import lk.ijse.DAO.DAOFactory;
import lk.ijse.DAO.custom.CulinaryProgramDAO;
import lk.ijse.DAO.custom.EnrollmentDAO;
import lk.ijse.DAO.custom.StudentDAO;
import lk.ijse.DTO.CulinaryProgramDTO;
import lk.ijse.Entity.CulinaryProgram;
import lk.ijse.Entity.Enrollment;
import lk.ijse.Entity.Student;

import java.util.ArrayList;
import java.util.List;

public class AddProgramBOImpl implements AddProgramBO {

    CulinaryProgramDAO culinaryProgramDAO = (CulinaryProgramDAO) DAOFactory.getDAO(DAOFactory.DAOType.PROGRAM);
    StudentDAO studentDAO = (StudentDAO) DAOFactory.getDAO(DAOFactory.DAOType.STUDENT);
    EnrollmentDAO enrollmentDAO = (EnrollmentDAO) DAOFactory.getDAO(DAOFactory.DAOType.ENROLLMENT);

    @Override
    public List<CulinaryProgramDTO> getAllCulinaryProgram(){
        List<CulinaryProgram> allCulinaryProgram = culinaryProgramDAO.getAllCulinaryProgram();
        List<CulinaryProgramDTO> allCulinaryProgramDTO = new ArrayList<>();

        for (CulinaryProgram program : allCulinaryProgram) {
            allCulinaryProgramDTO.add(new CulinaryProgramDTO(program.getProgramId(), program.getProgramName(), program.getDuration(), program.getFee(), program.getEnrollments()));
        }
        return allCulinaryProgramDTO;
    }

    @Override
    public void saveProgram(String studentId,String programName,double installment){
        Student student = studentDAO.getStudent(studentId);
        CulinaryProgram culinaryProgram = culinaryProgramDAO.getProgramsCheckName(programName);
        Enrollment enrollment = new Enrollment(installment,culinaryProgram.getFee()-installment,student,culinaryProgram);
        enrollmentDAO.save(enrollment);
    }
}
