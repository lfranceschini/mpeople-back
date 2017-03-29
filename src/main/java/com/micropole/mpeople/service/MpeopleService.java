package com.micropole.mpeople.service;

import com.micropole.mpeople.exception.NoDataFoundException;

import java.util.List;

/**
 * Created by lfranceschini on 18/03/2017.
 */
public interface MpeopleService<T> {

    List<T> getAll();

    T getOneById(int id);

}
