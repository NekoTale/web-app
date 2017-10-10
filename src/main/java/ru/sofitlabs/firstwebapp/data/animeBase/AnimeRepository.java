package ru.sofitlabs.firstwebapp.data.animeBase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface AnimeRepository extends JpaRepository<AnimeEntity, Long> {
    List<AnimeEntity> findAllByName(String name);

}
