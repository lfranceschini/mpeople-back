package com.micropole.mpeople.service.test;

import com.micropole.mpeople.core.entity.Langage;
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
 * Created by lfranceschini on 18/03/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LangageServiceTest {

    @Autowired
    @Qualifier(value = "langageService")
    private MpeopleService langageService;

    @Test
    public void testGetAllLangages(){
        List<Langage> langages = langageService.getAll();

        assertThat(langages, is(notNullValue()));
        assertThat(langages, contains(hasProperty("label", is("java")), hasProperty("label", is("C#"))));
    }

    @Test
    public void testGetLangageById(){
        Langage langage = (Langage) langageService.getOneById(0);

        assertThat(langage.getLabel(), is(equalTo("java")));
    }
}
