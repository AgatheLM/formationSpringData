package ex2.data.repository;

import org.springframework.data.repository.CrudRepository;

import ex2.data.entity.Item;

public interface ItemRepository extends CrudRepository<Item,Integer> {

}
