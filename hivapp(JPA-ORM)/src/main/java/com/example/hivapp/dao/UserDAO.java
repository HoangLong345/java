package com.example.hivapp.dao;

import com.example.hivapp.pojo.User;
import javax.persistence.*;
import java.util.List;

public class UserDAO {
    private static EntityManager entityManager;
    private static EntityManagerFactory entityManagerFactory;

    public UserDAO(String persistencName) {
        entityManagerFactory = Persistence.createEntityManagerFactory(persistencName);
        entityManager = entityManagerFactory.createEntityManager();
    }
    
    public void save(User user) {
        try {
            entityManager = entityManagerFactory. createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
            entityManager.close();
            }
        }
    }

    public void update(User user) {
        try {
            entityManager = entityManagerFactory. createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.merge(user);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
            entityManager.close();
            }
        }
    }

    public void delete(Long id) {
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            User user = entityManager. find(User.class, id);
            if (user != null) {
            entityManager.remove(user);
            entityManager.getTransaction().commit();
            }
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
            entityManager.close();
            }
        }
    }

    public User findById(Long id) {
        try {
            entityManager = entityManagerFactory.createEntityManager();
            return entityManager. find(User.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (entityManager != null) {
            entityManager.close();
            }
        }
    }

    public List<User> findAll() {
        try {
            entityManager = entityManagerFactory. createEntityManager();
            return entityManager.createQuery("SELECT s FROM User s", User.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (entityManager != null) {
            entityManager.close();
            }
        }
    }
}