package lk.ijse.BO.custom;

import lk.ijse.BO.SuperBO;
import lk.ijse.DTO.CulinaryProgramDTO;

import java.util.List;

public interface ViewAllBO extends SuperBO {

    List<CulinaryProgramDTO> getAllCulinaryProgram();
    List<Object[]> getAllEqualByProgramName(String programName);
}
