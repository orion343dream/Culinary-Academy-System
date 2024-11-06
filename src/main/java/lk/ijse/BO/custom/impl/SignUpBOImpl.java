package lk.ijse.BO.custom.impl;

import lk.ijse.BO.custom.SignUpBO;
import lk.ijse.DAO.DAOFactory;
import lk.ijse.DAO.custom.UserDAO;
import lk.ijse.DTO.UserDTO;
import lk.ijse.Entity.User;
import lk.ijse.Exceptions.UserAlreadyExistsException;

public class SignUpBOImpl implements SignUpBO {

    UserDAO userDAO = (UserDAO) DAOFactory.getDAO(DAOFactory.DAOType.USER);

    @Override
    public void signUp(UserDTO userDTO) throws UserAlreadyExistsException {
        User user = new User(userDTO.getUserName(), userDTO.getPassword(), userDTO.getRole());
        userDAO.save(user);
    }
}
