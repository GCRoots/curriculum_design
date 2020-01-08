package dao;


import pojo.Admins;

public interface AdminDao {
    Admins findAdmin(String user);
    void insertAdmin(Admins admins);
    void updateAdmin(Admins admins);
    void deleteAdmin(String user);
}
