package com.tutorialspoint.jdbc;

import com.tutorialspoint.jdbc.dao.StudentDao;
import com.tutorialspoint.jdbc.dao.impl.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by wug on 2016/1/27 0027 16:23.
 * email wug@shinemo.com
 */
public class StudentMarks {
    private Integer age;
    private String name;
    private Integer id;
    private Integer marks;
    private Integer year;
    private Integer sid;

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getSid() {
        return sid;
    }

    /**
     * 编程式事务管理
     */
    public static void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        StudentDaoImpl studentDaoImpl = (StudentDaoImpl)context.getBean("studentDaoImpl");
        System.out.println("------Records creation--------" );
        studentDaoImpl.create("Zara", 11, 99, 2010);
        studentDaoImpl.create("Nuha", 20, 97, 2010);
        studentDaoImpl.create("Ayan", 25, 100, 2011);
        System.out.println("------Listing all the records--------" );
        List<StudentMarks> studentMarks = studentDaoImpl.listStudentsMarks();
        for (StudentMarks record : studentMarks) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }
    }

    /**
     * spring 声明式事务管理 aop
     */
    public static void run1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        /**
         * Spring 只能对接口 AOP 所以 StudentDAO接收转型
         */
        StudentDao studentDao = (StudentDao)context.getBean("studentDaoImpl");
        System.out.println("------Records creation--------" );
        studentDao.createTransactionAop("Zara", 11, 99, 2010);
        studentDao.createTransactionAop("Nuha", 20, 97, 2010);
        studentDao.createTransactionAop("Ayan", 25, 100, 2011);
        System.out.println("------Listing all the records--------");
        List<StudentMarks> studentMarks = studentDao.listStudentsMarks();
        for (StudentMarks record : studentMarks) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }
    }
}
