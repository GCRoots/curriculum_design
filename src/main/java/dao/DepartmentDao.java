package dao;

import pojo.Department;

/**
 * @author shipengfei
 * @data 20-1-7
 */
public interface DepartmentDao {
    Department findByDepID(String depID);
    Department findByDepName(String depName);
    void insertDepartment(Department department);
    void updateDepartment(Department department);
    void deleteDepartment(String depID);
}
