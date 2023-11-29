package ru.study.repositories;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ru.study.models.RoomsEntity;
import ru.study.models.StudentsEntity;

import java.util.List;

@Stateless
public class RoomsRepository {
    @PersistenceContext
    private EntityManager em;

    public List<RoomsEntity> findAll() {
        return em.createQuery("select i from RoomsEntity i", RoomsEntity.class).getResultList();
    }

    public void persist(RoomsEntity entity) {
        em.persist(entity);
    }
}
