package org.vit.vitauthserver.repository.role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.vit.vitauthserver.model.role.Role;

import javax.transaction.Transactional;

@Repository
@Transactional
@RepositoryRestResource(path = "/roles")
public interface RoleRepository extends CrudRepository<Role, Long> {
}
