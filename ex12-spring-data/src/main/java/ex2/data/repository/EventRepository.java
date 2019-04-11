package ex2.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ex2.data.entity.Event;

public interface EventRepository extends JpaRepository<Event,Integer> {

	Event findByTitle(String title);

}
