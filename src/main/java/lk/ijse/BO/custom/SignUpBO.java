package lk.ijse.BO.custom;

import lk.ijse.BO.SuperBO;
import lk.ijse.DTO.UserDTO;
import lk.ijse.Exceptions.UserAlreadyExistsException;

public interface SignUpBO extends SuperBO {

    void signUp(UserDTO userDTO) throws UserAlreadyExistsException;
}
