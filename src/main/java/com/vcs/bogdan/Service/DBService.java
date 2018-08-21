package com.vcs.bogdan.Service;

import java.util.List;

public interface DBService<T> {

    T get(List<Object> id);

    T get(String id);

    void add(T obj);

    List<T> getAll();

    void remove(List<Object> id);

    void remove(String id);
}
