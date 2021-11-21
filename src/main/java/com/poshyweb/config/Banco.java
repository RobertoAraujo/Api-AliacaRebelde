package com.poshyweb.config;


import com.poshyweb.service.DBserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration   // configuraçaõ do perfil
@Profile("rebelde") // perfil ativo
public class Banco {

    @Autowired
    private DBserver dBserver;

    @Bean
    public void istanciaBaseDeDados() {
        this.dBserver.istanciaBaseDeDados();
    }

}
