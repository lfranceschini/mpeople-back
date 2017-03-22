package com.micropole.mpeople.service.test;

import com.micropole.mpeople.core.entity.RendezVous;
import com.micropole.mpeople.service.MpeopleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by lfranceschini on 22/03/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RendezVousServiceTest {

    @Autowired
    @Qualifier("rendezVousService")
    private MpeopleService rendezVousService;

    @Test
    public void testGetAllRendezVous(){

        List<RendezVous> rendezVous = rendezVousService.getAll();

        for(RendezVous rdv : rendezVous){
            System.out.println(rdv.getDate());
        }
    }

}
