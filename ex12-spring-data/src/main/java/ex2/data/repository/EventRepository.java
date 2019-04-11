package ex2.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import ex2.data.entity.Event;

public interface EventRepository extends JpaRepository<Event,Integer> {

}
