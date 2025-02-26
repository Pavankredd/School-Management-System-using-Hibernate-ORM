package School_Management_System;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Driver_Update {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pavan");
        EntityManager em = emf.createEntityManager();

        
        updateStudentDetails(em, 112, "John Doe", "12th Grade");
        updateTeacherDetails(em, 1113, "Smith");
        updateSchoolDetails(em, 1, "St Philomena's High School", "Bommasandra");

    }

    
    public static void updateStudentDetails(EntityManager em, int studentId, String newName, String newClass) {
        em.getTransaction().begin();

        Students student = em.find(Students.class, studentId);
        if (student != null) {
            student.setSt_name(newName); 
            student.setSt_class(newClass); 
            em.merge(student); 
            System.out.println("Student details updated successfully.");
        } else {
            System.out.println("Student not found!");
        }

        em.getTransaction().commit();
    }

    public static void updateTeacherDetails(EntityManager em, int teacherId, String newName) {
        em.getTransaction().begin();

        Teachers teacher = em.find(Teachers.class, teacherId); 
        if (teacher != null) {
            teacher.setT_name(newName); 
            em.merge(teacher); 
            System.out.println("Teacher details updated successfully.");
        } else {
            System.out.println("Teacher not found!");
        }

        em.getTransaction().commit();
    }

    public static void updateSchoolDetails(EntityManager em, int schoolId, String newName, String newAddress) {
        em.getTransaction().begin();

        School school = em.find(School.class, schoolId); 
        if (school != null) {
            school.setSc_name(newName);
            school.setSc_address(newAddress);
            em.merge(school);
            System.out.println("School details updated successfully.");
        } else {
            System.out.println("School not found!");
        }

        em.getTransaction().commit();
    }
}
