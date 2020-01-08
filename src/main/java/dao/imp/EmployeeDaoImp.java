package dao.imp;

import dao.EmployeeDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Department;
import pojo.Employee;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author shipengfei
 * @data 20-1-7
 */
public class EmployeeDaoImp implements EmployeeDao {
    private SqlSession session;

    @Override
    public Employee findByStaffID(String staffID) {
        Employee employee=new Employee();

        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            session=sqlSessionFactory.openSession();

            EmployeeDao employeeDao=session.getMapper(EmployeeDao.class);
            employee=employeeDao.findByStaffID(staffID);

            session.commit();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return employee;
    }

    @Override
    public Employee findByStaffName(String staffName) {
        Employee employee=new Employee();

        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            session=sqlSessionFactory.openSession();

            EmployeeDao employeeDao=session.getMapper(EmployeeDao.class);
            employee=employeeDao.findByStaffName(staffName);

            session.commit();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return employee;
    }

    @Override
    public void insertEmployeeBasic(Employee employee) {
        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session=sqlSessionFactory.openSession();
            session.insert("insertEmployeeBasic",employee);

            session.commit();

        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void updateEmployeeBasic(Employee employee) {
        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session=sqlSessionFactory.openSession();
            session.update("updateEmployeeBasic",employee);

            session.commit();

        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void deleteEmployeeBasic(String staffID) {
        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session=sqlSessionFactory.openSession();
            session.delete("deleteEmployeeBasic",staffID);

            session.commit();

        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
