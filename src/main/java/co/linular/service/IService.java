package co.linular.service;

import co.linular.interfaces.IOperations;
import co.linular.persistence.model.IEntity;

import java.util.List;

public interface IService <T extends IEntity> extends IOperations<T> {

    //T findById(String id);

}
