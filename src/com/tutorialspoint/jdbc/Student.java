package com.tutorialspoint.jdbc;

import com.tutorialspoint.jdbc.dao.impl.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

/**
 * Created by wug on 2016/1/25 0025 10:08.
 * email wug@shinemo.com
 */
public class Student {
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        StudentDaoImpl studentDaoImpl = (StudentDaoImpl)context.getBean("studentDaoImpl");
        System.out.println("------Records Creation--------" );
        studentDaoImpl.create("Zara", 11);
        studentDaoImpl.create("Nuha", 2);
        studentDaoImpl.create("Ayan", 15);
        System.out.println("------Listing Multiple Records--------");
        List<Student> students = studentDaoImpl.listStudents();
        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }
        System.out.println("----Updating Record with ID = 2 -----");
        studentDaoImpl.update(2, 20);

        System.out.println("----Listing Record with ID = 2 -----");
        Student student = studentDaoImpl.getStudent(2);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());
        System.out.println("----Listing Record by Procedure ID = 3 -----");
        Student std = studentDaoImpl.getStudentProcedure(3);
        System.out.print("ID : " + std.getId() );
        System.out.print(", Name : " + std.getName() );
        System.out.println(", Age : " + std.getAge());
    }
}
