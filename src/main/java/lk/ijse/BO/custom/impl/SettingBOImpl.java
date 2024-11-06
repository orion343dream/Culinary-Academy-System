package lk.ijse.BO.custom.impl;

import lk.ijse.BO.custom.SettingBO;
import lk.ijse.DAO.DAOFactory;
import lk.ijse.DAO.custom.UserDAO;
import lk.ijse.DTO.UserDTO;
import lk.ijse.Entity.User;

import java.util.ArrayList;
import java.util.List;

public class SettingBOImpl implements SettingBO {

    UserDAO userDAO = (UserDAO) DAOFactory.getDAO(DAOFactory.DAOType.USER);

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserDTO> userDTOS = new ArrayList<>();
        List<User> allUsers = userDAO.getAllUsers();

        for (User user : allUsers) {
            userDTOS.add(new UserDTO(user.getUserId(), user.getUserName(), user.getPassword(), user.getRole()));
        }
        return userDTOS;
    }

    @Override
    public void deleteUser(UserDTO userDTO){
        User user = new User(userDTO.getUserId(), userDTO.getUserName(), userDTO.getPassword(), userDTO.getRole());
        userDAO.delete(user);
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        User user = new User(userDTO.getUserId(), userDTO.getUserName(), userDTO.getPassword(), userDTO.getRole());
        userDAO.update(user);
    }
}
