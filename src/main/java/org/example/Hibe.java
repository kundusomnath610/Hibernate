package org.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class Hibe {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        String hql = "FROM Student";
        Query query = session.createQuery(hql , Student.class);

        List<Student> students = query.getResultList();

        for (Student student : students) {
            System.out.println("Student Roll: " + student.getRoll());
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Marks: " + student.getCgpa());
            System.out.println("Student Branch: " + student.getBranch());
            System.out.println("------------------------------------");
        }
    }
}