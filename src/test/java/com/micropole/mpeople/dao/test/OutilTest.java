package com.micropole.mpeople.dao.test;

import com.micropole.mpeople.entities.OutilEntity;
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
import static org.junit.Assert.*;

/**
 * Created by lfranceschini on 14/03/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OutilTest{

    @Autowired
    @Qualifier(value = "outilService")
    private MpeopleService outilService;

    @Test
    public void testGetAllOutils(){
        List<OutilEntity> outils = outilService.getAll();

        assertThat(outils, is(notNullValue()));
        assertThat(outils, contains(hasProperty("label", is("talend")), hasProperty("label", is("eclipse"))));
    }

    @Test
    public void testGetOutilById(){
        OutilEntity outil = (OutilEntity) outilService.getOneById(0);

        assertThat(outil.getLabel(), is(equalTo("talend")));
    }
}
