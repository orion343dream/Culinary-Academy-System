package lk.ijse.BO.custom;

import lk.ijse.BO.SuperBO;
import lk.ijse.DTO.UserDTO;

import java.util.List;

public interface SettingBO extends SuperBO {

    List<UserDTO> getAllUsers();
    void deleteUser(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
}
