package com.example.hivapp.dao;

import com.example.hivapp.pojo.Notification;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class NotificationDAO {
    private static EntityManagerFactory entityManagerFactory;

    public NotificationDAO(String persistenceUnitName) {
        entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
    }

    public void save(Notification notification) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(notification);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public Notification findById(Long id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            return em.find(Notification.class, id);
        } finally {
            em.close();
        }
    }

    public List<Notification> findAll() {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            return em.createQuery("SELECT n FROM Notification n", Notification.class).getResultList();
        } finally {
            em.close();
        }
    }

    public void update(Notification notification) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(notification);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void delete(Long id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            em.getTransaction().begin();
            Notification notification = em.find(Notification.class, id);
            if (notification != null) {
                em.remove(notification);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}
