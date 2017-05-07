package co.linular.service;

import co.linular.persistence.model.impl.User;

public interface IUserService extends IService<User> {

    User getCurrentUser();

}
