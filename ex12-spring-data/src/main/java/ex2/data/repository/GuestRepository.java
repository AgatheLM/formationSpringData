package ex2.data.repository;

import java.util.Optional;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import ex2.data.entity.Guest;

public interface GuestRepository extends CrudRepository<Guest,Integer> {

	@Async
	@Query(nativeQuery=true, value="SELECT * FROM guest WHERE id=:id")
	public Future<Optional<Guest>> findFutureOptionalGuest(@Param("id") Integer id);

	public Guest findByName(String name);

}
