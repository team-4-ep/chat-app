package tn.eniso.chat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.eniso.chat.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}
