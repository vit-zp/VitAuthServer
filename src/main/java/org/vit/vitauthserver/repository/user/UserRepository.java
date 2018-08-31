package org.vit.vitauthserver.repository.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.vit.vitauthserver.model.user.User;

import javax.transaction.Transactional;

@Repository
@Transactional
@RepositoryRestResource(path = "/users")
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserName(String userName);
}
