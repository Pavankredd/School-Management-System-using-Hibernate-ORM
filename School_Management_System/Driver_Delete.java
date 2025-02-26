package School_Management_System;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Driver_Delete {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pavan");
        EntityManager em = emf.createEntityManager();

      
        deleteStudent(em, 114);
        deleteTeacher(em, 1114);
        deleteSchool(em, 1);

    }

    public static void deleteStudent(EntityManager em, int studentId) {
        em.getTransaction().begin();

        Students student = em.find(Students.class, studentId); 
        if (student != null) {
            em.remove(student); 
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found!");
        }

        em.getTransaction().commit();
    }

    
    public static void deleteTeacher(EntityManager em, int teacherId) 
    {
        em.getTransaction().begin();

        Teachers teacher = em.find(Teachers.class, teacherId); 
        if (teacher != null) 
        {
            em.remove(teacher); 
            System.out.println("Teacher deleted successfully.");
        }
        else 
        {
            System.out.println("Teacher not found!");
        }

        em.getTransaction().commit();
    }

    public static void deleteSchool(EntityManager em, int schoolId) {
        em.getTransaction().begin();

        School school = em.find(School.class, schoolId);
        if (school != null) {
            em.remove(school); 
            System.out.println("School deleted successfully.");
        } else {
            System.out.println("School not found!");
        }

        em.getTransaction().commit();
    }
}
