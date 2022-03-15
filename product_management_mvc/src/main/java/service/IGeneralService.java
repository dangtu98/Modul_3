package service;

import java.util.List;

public interface IGeneralService <T>{
    List <T> findAll();

    T findById(int id);

    void create(T t);

    void updateById(int id, T t);

    void deleteById(int id);
}
