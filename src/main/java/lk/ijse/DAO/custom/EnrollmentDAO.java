package lk.ijse.DAO.custom;

import lk.ijse.DAO.SuperDAO;
import lk.ijse.Entity.Enrollment;

public interface EnrollmentDAO extends SuperDAO {

    void save(Enrollment enrollment);
    void update(Enrollment enrollment);
    Enrollment getEnrollment(String studentId,String programName);
}
