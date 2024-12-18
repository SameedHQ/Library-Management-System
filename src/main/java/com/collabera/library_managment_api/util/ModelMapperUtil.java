package com.collabera.library_managment_api.util;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperUtil {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
