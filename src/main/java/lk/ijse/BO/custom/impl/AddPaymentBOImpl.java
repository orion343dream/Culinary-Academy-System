package lk.ijse.BO.custom.impl;

import lk.ijse.BO.custom.AddPaymentBO;
import lk.ijse.DAO.DAOFactory;
import lk.ijse.DAO.custom.CulinaryProgramDAO;
import lk.ijse.DAO.custom.EnrollmentDAO;
import lk.ijse.DAO.custom.StudentDAO;
import lk.ijse.Entity.CulinaryProgram;
import lk.ijse.Entity.Enrollment;
import lk.ijse.Entity.Student;

public class AddPaymentBOImpl implements AddPaymentBO {

    CulinaryProgramDAO culinaryProgramDAO = (CulinaryProgramDAO) DAOFactory.getDAO(DAOFactory.DAOType.PROGRAM);
    StudentDAO studentDAO = (StudentDAO) DAOFactory.getDAO(DAOFactory.DAOType.STUDENT);
    EnrollmentDAO enrollmentDAO = (EnrollmentDAO) DAOFactory.getDAO(DAOFactory.DAOType.ENROLLMENT);

    @Override
    public void updateEnrollment(String studentId,String programName,double payment) {
        Student student = studentDAO.getStudent(studentId);
        CulinaryProgram culinaryProgram = culinaryProgramDAO.getProgramsCheckName(programName);
        Enrollment enrollment = enrollmentDAO.getEnrollment(studentId, programName);
        enrollmentDAO.update(new Enrollment(enrollment.getEnrollId(),enrollment.getFirstInstallment(),enrollment.getBalance()-payment,student,culinaryProgram));
    }
}
