package com.micropole.mpeople.service.test;

import com.micropole.mpeople.core.entity.Client;
import com.micropole.mpeople.service.MpeopleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by lfranceschini on 20/03/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientServiceTest {

    @Autowired
    @Qualifier("clientService")
    private MpeopleService clientService;

    @Test
    public void testGetAllClients(){
        List<Client> clients = clientService.getAll();
        for(Client client: clients){
            System.out.println(client.getDomaine().getLabel());
        }
    }

}
