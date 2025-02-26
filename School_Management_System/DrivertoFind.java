package School_Management_System;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DrivertoFind {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pavan");
        EntityManager em = emf.createEntityManager();

       
        findStudentById(em, 111);
        findTeacherById(em, 1111);
        findSchoolById(em, 1);
    }
    
    public static void findStudentById(EntityManager em, int id) {
        Students student = em.find(Students.class, id);
        if (student != null) {
            System.out.println("Student found: " + student.getSt_name());
        } else {
            System.out.println("Student not found!");
        }
    }

    public static void findTeacherById(EntityManager em, int id) {
        Teachers teacher = em.find(Teachers.class, id);
        if (teacher != null) {
            System.out.println("Teacher found: " + teacher.getT_name());
        } else {
            System.out.println("Teacher not found!");
        }
    }

    public static void findSchoolById(EntityManager em, int id) {
        School school = em.find(School.class, id);
        if (school != null) {
            System.out.println("School found: " + school.getSc_name());
        } else {
            System.out.println("School not found!");
        }
    }
}
