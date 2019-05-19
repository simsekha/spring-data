package com.tutorials.simsek.jpatutorial.service;

import java.util.List;

public interface ReadOnlyService<T,V> {
    List<?> listAll();

    T getById(V id);

    //T saveOrUpdate(T domainObject);

    //void delete(V id);
}