package com.micropole.mpeople.repositorie;

import com.micropole.mpeople.core.entity.RendezVous;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lfranceschini on 22/03/2017.
 */
@Transactional
public interface RendezVousRepository extends CrudRepository<RendezVous, Integer>{
}
