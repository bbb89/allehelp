package pl.lukaszbany.allehelp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.lukaszbany.allehelp.domain.Item;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends CrudRepository<Item, Long> {

    @Override
    List<Item> findAll();

    @Override
    Optional<Item> findById(Long id);

    @Override
    <S extends Item> S save(S entity);
}
