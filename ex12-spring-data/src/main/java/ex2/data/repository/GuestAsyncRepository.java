package ex2.data.repository;

import org.springframework.data.repository.CrudRepository;

import ex2.data.entity.Guest;

public interface GuestAsyncRepository extends CrudRepository<Guest,Integer> {

	Guest findByName(String name);

}
