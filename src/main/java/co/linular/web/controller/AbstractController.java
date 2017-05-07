package co.linular.web.controller;

import co.linular.persistence.model.IEntity;
import co.linular.service.IService;

public abstract class AbstractController<T extends IEntity> {

    public abstract IService getService();

    public void createInternal(T resource){
        getService().create(resource);
    }

    public void updateInternal(T resource){
        getService().update(resource);
    }

    public void deleteInternal(String id){
        getService().delete(id);
    }

}
