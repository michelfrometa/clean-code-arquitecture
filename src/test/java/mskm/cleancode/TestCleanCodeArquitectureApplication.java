package mskm.cleancode;

import org.springframework.boot.SpringApplication;

public class TestCleanCodeArquitectureApplication {

    public static void main(String[] args) {
        SpringApplication.from(CleanCodeArquitectureApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
