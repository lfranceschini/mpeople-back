package com.micropole.mpeople.repositorie;

import com.micropole.mpeople.core.entity.Langage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lfranceschini on 18/03/2017.
 */
@Transactional
public interface LangageRepository extends CrudRepository<Langage, Integer> {
}
