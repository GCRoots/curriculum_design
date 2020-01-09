package dao.imp;

import dao.EmployeeSalarySubDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.EmployeeSalarySub;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author shipengfei
 * @data 20-1-7
 */
public class EmployeeSalarySubDaoImp implements EmployeeSalarySubDao {
    private SqlSession session;


    @Override
    public EmployeeSalarySub subFind(String staffID, String time) {
        EmployeeSalarySub employeeSalarySub=new EmployeeSalarySub();

        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            session=sqlSessionFactory.openSession();

            EmployeeSalarySubDao employeeDao=session.getMapper(EmployeeSalarySubDao.class);
            employeeSalarySub=employeeDao.subFind(staffID,time);

            session.commit();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return employeeSalarySub;
    }

    @Override
    public void insertEmployeeSalarySub(EmployeeSalarySub employeeSalarySub) {
        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session=sqlSessionFactory.openSession();
            session.insert("insertEmployeeSalarySub",employeeSalarySub);

            session.commit();

        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void updateEmployeeSalarySub(EmployeeSalarySub employeeSalarySub) {
        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session=sqlSessionFactory.openSession();
            session.update("updateEmployeeSalarySub",employeeSalarySub);

            session.commit();

        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void deleteEmployeeSalarySub(String staffID) {
        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            session=sqlSessionFactory.openSession();

            EmployeeSalarySubDao employeeDao=session.getMapper(EmployeeSalarySubDao.class);
            employeeDao.deleteEmployeeSalarySub(staffID);

            session.commit();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
