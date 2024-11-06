package lk.ijse.BO.custom.impl;

import lk.ijse.BO.custom.ViewAllBO;
import lk.ijse.DAO.DAOFactory;
import lk.ijse.DAO.custom.CulinaryProgramDAO;
import lk.ijse.DAO.custom.QueryDAO;
import lk.ijse.DTO.CulinaryProgramDTO;
import lk.ijse.Entity.CulinaryProgram;

import java.util.ArrayList;
import java.util.List;

public class ViewAllBOImpl implements ViewAllBO {

    CulinaryProgramDAO culinaryProgramDAO = (CulinaryProgramDAO) DAOFactory.getDAO(DAOFactory.DAOType.PROGRAM);
    QueryDAO queryDAO = (QueryDAO) DAOFactory.getDAO(DAOFactory.DAOType.QUERY);

    @Override
    public List<CulinaryProgramDTO> getAllCulinaryProgram() {
        List<CulinaryProgram> allCulinaryProgram = culinaryProgramDAO.getAllCulinaryProgram();
        List<CulinaryProgramDTO> allCulinaryProgramDTO = new ArrayList<>();

        for (CulinaryProgram culinaryProgram : allCulinaryProgram) {
            allCulinaryProgramDTO.add(new CulinaryProgramDTO(culinaryProgram.getProgramId(), culinaryProgram.getProgramName(), culinaryProgram.getDuration(), culinaryProgram.getFee(), culinaryProgram.getEnrollments()));
        }
        return allCulinaryProgramDTO;
    }

    @Override
    public List<Object[]> getAllEqualByProgramName(String programName){
        return queryDAO.getAllEqualByProgramName(programName);
    }
}
