package lk.ijse.BO.custom;

import lk.ijse.BO.SuperBO;
import lk.ijse.DTO.CulinaryProgramDTO;

import java.util.List;

public interface ProgramBO extends SuperBO {

    void saveCulinaryProgram(CulinaryProgramDTO culinaryProgramDTO);
    void deleteCulinaryProgram(CulinaryProgramDTO culinaryProgramDTO);
    void updateCulinaryProgram(CulinaryProgramDTO culinaryProgramDTO);
    List<CulinaryProgramDTO> getAllCulinaryProgram();
    CulinaryProgramDTO getCulinaryProgram(String programId);
}
