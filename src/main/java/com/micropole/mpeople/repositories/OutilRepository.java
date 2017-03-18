package com.micropole.mpeople.repositories;

import com.micropole.mpeople.entities.OutilEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lfranceschini on 14/03/2017.
 */
@Transactional
public interface OutilRepository extends CrudRepository<OutilEntity, Integer> {
}
