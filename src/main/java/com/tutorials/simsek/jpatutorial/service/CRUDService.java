package com.tutorials.simsek.jpatutorial.service;

import java.util.List;

/**
 * Created by jt on 11/14/15.
 */
public interface CRUDService<T,V> {
    List<?> listAll();

    T getById(V id);

    T saveOrUpdate(T domainObject);

    void delete(V id);
}