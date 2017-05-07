package co.linular.service.impl;

import co.linular.persistence.model.impl.Privilege;
import co.linular.persistence.model.impl.Role;
import co.linular.persistence.model.impl.User;
import co.linular.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService implements IUserService {
    @Override
    public User getCurrentUser() {
        return getDummy();
    }

    @Override
    public User findOne(String id) {
        return getDummy();
    }

    private User getDummy(){

        //Dummy, for the purposes of PoC
        User user = new User();
        user.setId(88888L);
        user.setEmail("chrisperks@linular.co");
        user.setName("chris");
        user.setPassword("test");
        user.setLocked(false);

        Set<Role> roles = new HashSet<>();
        Role role = new Role();
        role.setId(77777L);
        role.setName("CAN_READ");

        Set<Privilege> privileges = new HashSet<>();
        Privilege privilege = new Privilege();
        privilege.setId(55555L);
        privilege.setName("CAN_READ");
        privilege.setDescription("Has permission to read resources");
        privileges.add(privilege);

        role.setPrivileges(privileges);
        roles.add(role);

        user.setRoles(roles);
        return user;

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findAllSorted(String sortBy, String sortOrder) {
        return null;
    }

    @Override
    public List<User> findAllPaginated(int page, int size) {
        return null;
    }

    @Override
    public List<User> findAllPaginatedAndSorted(int page, int size, String sortBy, String sortOrder) {
        return null;
    }

    @Override
    public User create(User resource) {
        return null;
    }

    @Override
    public void update(User resource) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public long count() {
        return 0;
    }
}
