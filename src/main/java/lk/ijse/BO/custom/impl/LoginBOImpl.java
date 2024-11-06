package lk.ijse.BO.custom.impl;

import lk.ijse.BO.custom.LoginBO;
import lk.ijse.DAO.DAOFactory;
import lk.ijse.DAO.custom.UserDAO;
import lk.ijse.DTO.UserDTO;
import lk.ijse.Entity.User;
import lk.ijse.Exceptions.InvalidCredentialsException;

public class LoginBOImpl implements LoginBO {

    UserDAO userDAO = (UserDAO) DAOFactory.getDAO(DAOFactory.DAOType.USER);

    @Override
    public UserDTO getUser(String userName) throws InvalidCredentialsException {
        try {
            User user = userDAO.getUser(userName);
            return new UserDTO(user.getUserId(),user.getUserName(),user.getPassword(),user.getRole());
        } catch (Exception e) {
            throw new InvalidCredentialsException(e.getMessage());
        }
    }
}
