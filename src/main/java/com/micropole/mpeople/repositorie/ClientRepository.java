package com.micropole.mpeople.repositorie;

import com.micropole.mpeople.core.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lfranceschini on 20/03/2017.
 */
@Transactional
public interface ClientRepository extends CrudRepository<Client, Integer> {
}
