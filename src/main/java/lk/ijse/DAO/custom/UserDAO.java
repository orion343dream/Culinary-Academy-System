package lk.ijse.DAO.custom;

import lk.ijse.DAO.SuperDAO;
import lk.ijse.Entity.User;
import lk.ijse.Exceptions.UserAlreadyExistsException;

import java.util.List;

public interface UserDAO extends SuperDAO {

    void save(User user) throws UserAlreadyExistsException;
    void update(User user);
    void delete(User user);
    User getUser(String userName);
    List<User> getAllUsers();
}
