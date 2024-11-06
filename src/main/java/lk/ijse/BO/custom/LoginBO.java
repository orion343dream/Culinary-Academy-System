package lk.ijse.BO.custom;

import lk.ijse.BO.SuperBO;
import lk.ijse.DTO.UserDTO;
import lk.ijse.Exceptions.InvalidCredentialsException;

public interface LoginBO extends SuperBO {

    UserDTO getUser(String userName) throws InvalidCredentialsException;
}
