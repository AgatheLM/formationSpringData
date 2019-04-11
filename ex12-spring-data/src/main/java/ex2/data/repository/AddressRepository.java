package ex2.data.repository;

import org.springframework.data.repository.CrudRepository;

import ex2.data.entity.Address;

public interface AddressRepository extends CrudRepository<Address,Integer> {

	}
