package com.micropole.mpeople;

import com.micropole.mpeople.configuration.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by lfranceschini on 06/03/2017.
 */
@SpringBootApplication
@Import(SwaggerConfiguration.class)
public class MainLauncher {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(MainLauncher.class, args);
    }

}
