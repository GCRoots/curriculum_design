package dao;

import pojo.Users;

public interface UsersDao {
    Users findUsers(String user);
    void insertUsers(Users users);
    void updateUsers(Users users);
    void deleteUsers(String user);
}
