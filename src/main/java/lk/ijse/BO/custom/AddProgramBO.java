package lk.ijse.BO.custom;

import lk.ijse.BO.SuperBO;
import lk.ijse.DTO.CulinaryProgramDTO;

import java.util.List;

public interface AddProgramBO extends SuperBO {

    List<CulinaryProgramDTO> getAllCulinaryProgram();
    void saveProgram(String studentId,String programName,double installment);
}
