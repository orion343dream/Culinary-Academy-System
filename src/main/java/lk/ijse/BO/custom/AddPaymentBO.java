package lk.ijse.BO.custom;

import lk.ijse.BO.SuperBO;

public interface AddPaymentBO extends SuperBO {

    void updateEnrollment(String studentId,String programName,double payment);
}
