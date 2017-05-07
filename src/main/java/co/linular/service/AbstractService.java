package co.linular.service;

import co.linular.persistence.model.IEntity;
import co.linular.persistence.model.impl.Cost;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractService<T extends IEntity> implements IService<T> {
    public AbstractService() {
        super();
    }

    public T findOne(String id) {
        return null;
    }

    public List<T> findAll() {
        return null;
    }

    public List<T> findAllSorted(String sortBy, String sortOrder) {
        return null;
    }

    public List<T> findAllPaginated(int page, int size) {
        return null;
    }

    public List<T> findAllPaginatedAndSorted(int page, int size, String sortBy, String sortOrder) {
        return null;
    }

    public T create(T resource) {
        return null;
    }

    public void update(T resource) {

    }

    public void delete(String id) {

    }

    public void deleteAll() {

    }

    public long count() {
        return 0;
    }

    public T findById(String id) {
        return null;
    }
}
