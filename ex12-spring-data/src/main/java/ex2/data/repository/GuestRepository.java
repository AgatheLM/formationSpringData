package ex2.data.repository;

import org.springframework.data.repository.CrudRepository;

import ex2.data.entity.Guest;

public interface GuestRepository extends CrudRepository<Guest,Integer> {

}
