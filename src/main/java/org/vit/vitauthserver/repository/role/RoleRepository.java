package org.vit.vitauthserver.repository.role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.vit.vitauthserver.model.role.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
