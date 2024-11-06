package lk.ijse.DAO.custom;

import lk.ijse.DAO.SuperDAO;
import lk.ijse.Entity.CulinaryProgram;

import java.util.List;

public interface CulinaryProgramDAO extends SuperDAO {

    void saveCulinaryProgram(CulinaryProgram culinaryProgram);
    void deleteCulinaryProgram(CulinaryProgram culinaryProgram);
    void updateCulinaryProgram(CulinaryProgram culinaryProgram);
    List<CulinaryProgram> getAllCulinaryProgram();
    CulinaryProgram getProgramsCheckName(String programName);
    CulinaryProgram getCulinaryProgram(String programId);
    Long getCulinaryProgramCount();
}
