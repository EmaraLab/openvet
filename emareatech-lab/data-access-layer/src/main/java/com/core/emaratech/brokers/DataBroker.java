package com.core.emaratech.brokers;

import java.util.List;

/**
 * The Data broker represents an abstract concept of communicating with the under lying data source.
 * The underlying data source could be anything jdbc data source, hibernate, jpa or even a web service.
 * The client services/business logic is only supposed to communicate to the data repositories through the
 * data broker.
 */
public interface DataBroker {
    <T> List<T> findByExample(T example);

    <T> List<T> findItemsByRange(T example, int pageNo, int pageSize,
                                 String orderBy, boolean isAsc, int[] totalRowCount);

    <T,U> T findById(Class<T> clss, U id);

    <T> List<T> findAll(Class<T> clss);

    <T> void save(T addMe);

    <T> void update(T updateMe);

    <T> void delete(T deleteMe);
}
