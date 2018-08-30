package org.vit.vitauthserver;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.vit.vitauthserver.model.user.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserName(String userName);
}
