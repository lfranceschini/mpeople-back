package com.micropole.mpeople.service.test;

import com.micropole.mpeople.core.entity.Methodo;
import com.micropole.mpeople.service.MpeopleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertThat;

/**
 * Created by lfranceschini on 19/03/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MethodoServiceTest {

    @Autowired
    @Qualifier(value = "methodoService")
    private MpeopleService methodoService;

    @Test
    public void testGetAllMethodos(){
        List<Methodo> methodos = methodoService.getAll();

        assertThat(methodos, is(notNullValue()));
        assertThat(methodos, contains(hasProperty("label", is("merise")), hasProperty("label", is("UML"))));
    }

    @Test
    public void testGetMethodoById(){
        Methodo outil = (Methodo) methodoService.getOneById(0);

        assertThat(outil.getLabel(), is(equalTo("merise")));
    }
}
