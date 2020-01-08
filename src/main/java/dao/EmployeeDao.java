package dao;

import pojo.Employee;

/**
 * @author shipengfei
 * @data 20-1-7
 */
public interface EmployeeDao {
    Employee findByStaffID(String staffID);
    Employee findByStaffName(String staffName);
    void insertEmployeeBasic(Employee employee);
    void updateEmployeeBasic(Employee employee);
    void deleteEmployeeBasic(String staffID);
}
