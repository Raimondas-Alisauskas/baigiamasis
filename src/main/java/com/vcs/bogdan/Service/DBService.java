package com.vcs.bogdan.Service;

import java.util.List;

public interface DBService<T> {

    T get(String id);

    void add(T obj);

    List<T> getAll();

    void remove(String id);
}
