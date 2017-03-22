package com.micropole.mpeople.repositorie;

import com.micropole.mpeople.core.entity.Poste;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lfranceschini on 14/03/2017.
 */
@Transactional
public interface PosteRepository extends CrudRepository<Poste, Integer>{
}
