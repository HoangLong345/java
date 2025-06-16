package com.example.hivapp.dao;

import com.example.hivapp.pojo.MedicalRecord;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class MedicalRecordDAO {
    private static EntityManagerFactory entityManagerFactory;

    public MedicalRecordDAO(String persistenceUnitName) {
        entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
    }

    public void save(MedicalRecord record) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(record);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public MedicalRecord findById(Long id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            return em.find(MedicalRecord.class, id);
        } finally {
            em.close();
        }
    }

    public List<MedicalRecord> findAll() {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            return em.createQuery("SELECT r FROM MedicalRecord r", MedicalRecord.class).getResultList();
        } finally {
            em.close();
        }
    }

    public void update(MedicalRecord record) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(record);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void delete(Long id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            em.getTransaction().begin();
            MedicalRecord record = em.find(MedicalRecord.class, id);
            if (record != null) {
                em.remove(record);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}