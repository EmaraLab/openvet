package com.core.emaratech.brokers;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.internal.util.StringHelper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ABC
 * Date: 1/31/14
 * Time: 1:10 AM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class JpaDataBroker implements com.core.emaratech.brokers.DataBroker {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public <T> List<T> findByExample(T example) {
        Session session = entityManager.unwrap(Session.class);
        Example exampleCriteria = Example.create(example).excludeZeroes();
        Criteria criteria = session.createCriteria(example.getClass()).add(exampleCriteria);
        return criteria.list();

    }

    //TODO: fix me
    @Override
    public <T> List<T> findItemsByRange(T example, int pageNo, int pageSize, String orderBy,
                                        boolean isAsc, int[] totalRowCount) {
        Session session = entityManager.unwrap(Session.class);
        Example exampleCriteria = Example.create(example).excludeZeroes();
        Criteria criteria = session.createCriteria(example.getClass()).add(exampleCriteria);
        criteria.setFirstResult(pageNo == 1 ? pageNo : (pageNo - 1) * pageSize);
        criteria.setMaxResults(pageSize);
        if (StringHelper.isNotEmpty(orderBy)) {
            if (isAsc) {
                criteria.addOrder(Order.asc(orderBy));
            } else {
                criteria.addOrder(Order.desc(orderBy));
            }
        }
        return criteria.list();
    }

    @Override
    public <T, U> T findById(Class<T> clss, U id) {
        return entityManager.find(clss, id);
    }

    @Override
    public <T> List<T> findAll(Class<T> clss) {
        CriteriaQuery<T> criteria = entityManager.getCriteriaBuilder().createQuery(clss);
        criteria.select(criteria.from(clss));
        return entityManager.createQuery(criteria).getResultList();
    }

    @Override
    public <T> void save(T addMe) {
        entityManager.persist(addMe);
    }

    @Override
    public <T> void update(T updateMe) {
        entityManager.merge(updateMe);
    }

    @Override
    public <T> void delete(T deleteMe) {
        entityManager.remove(deleteMe);
    }
}
