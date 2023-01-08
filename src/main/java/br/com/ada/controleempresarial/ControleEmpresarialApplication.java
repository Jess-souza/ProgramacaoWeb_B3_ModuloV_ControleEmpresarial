package br.com.ada.controleempresarial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ControleEmpresarialApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleEmpresarialApplication.class, args);
    }

}