package com.simpli.fsjd.capstone.crs;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by Md. Zohir Raihan
 */

@SpringBootApplication
public class ComplaintRedressalSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComplaintRedressalSystemApplication.class, args);
    }

    @Bean
    public ModelMapper getModelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }
}

