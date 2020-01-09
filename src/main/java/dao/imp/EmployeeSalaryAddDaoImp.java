package dao.imp;

import dao.EmployeeSalaryAddDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.EmployeeSalaryAdd;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author shipengfei
 * @data 20-1-7
 */
public class EmployeeSalaryAddDaoImp implements EmployeeSalaryAddDao {
    private SqlSession session;

    @Override
    public EmployeeSalaryAdd addFind(String staffID, String time) {
        EmployeeSalaryAdd employeeSalaryAdd=new EmployeeSalaryAdd();

        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            session=sqlSessionFactory.openSession();

            EmployeeSalaryAddDao employeeDao=session.getMapper(EmployeeSalaryAddDao.class);
            employeeSalaryAdd=employeeDao.addFind(staffID,time);

            session.commit();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return employeeSalaryAdd;
    }

    @Override
    public void insertEmployeeSalaryAdd(EmployeeSalaryAdd employeeSalaryAdd) {
        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session=sqlSessionFactory.openSession();
            session.insert("insertEmployeeSalaryAdd",employeeSalaryAdd);

            session.commit();

        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void updateEmployeeSalaryAdd(EmployeeSalaryAdd employeeSalaryAdd) {
        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session=sqlSessionFactory.openSession();
            session.update("updateEmployeeSalaryAdd",employeeSalaryAdd);

            session.commit();

        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void deleteEmployeeSalaryAdd(String staffID) {
        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            session=sqlSessionFactory.openSession();

            EmployeeSalaryAddDao employeeDao=session.getMapper(EmployeeSalaryAddDao.class);
            employeeDao.deleteEmployeeSalaryAdd(staffID);

            session.commit();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
