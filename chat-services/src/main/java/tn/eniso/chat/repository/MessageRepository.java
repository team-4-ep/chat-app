package tn.eniso.chat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.eniso.chat.model.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message,String> {
}
