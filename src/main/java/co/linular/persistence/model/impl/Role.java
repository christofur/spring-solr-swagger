package co.linular.persistence.model.impl;

import co.linular.persistence.model.IEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Set;

/**
 * Created by perks on 02/05/2017.
 */
public class Role implements IEntity {

    private Long id;

    private String name;

    private Set<Privilege> privileges;
    // @formatter:on

    public Role() {
        super();
    }

    public Role(final String nameToSet) {
        super();
        name = nameToSet;
    }

    public Role(final String nameToSet, final Set<Privilege> privilegesToSet) {
        super();
        name = nameToSet;
        privileges = privilegesToSet;
    }

    // API

    public Long getId() {
        return id;
    }

    public void setId(final Long idToSet) {
        id = idToSet;
    }

    public String getName() {
        return name;
    }

    public void setName(final String nameToSet) {
        name = nameToSet;
    }

    public Set<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(final Set<Privilege> privilegesToSet) {
        privileges = privilegesToSet;
    }

    //

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Role other = (Role) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).toString();
    }


}
