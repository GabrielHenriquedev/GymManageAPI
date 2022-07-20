package com.gymManage.Controllers;

import com.gymManage.controller.FichaCadController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FichaCadControllerTest {

    @Autowired
    FichaCadController FhController;

    @Test
    void getEmUmaFichaExistenteId1() {
        HttpStatus getFicha= FhController.consultar(1).getStatusCode();
        assertEquals( HttpStatus.OK, getFicha);
    }

    @Test
    void getEmUmaFichaExistenteId2() {
        HttpStatus getFicha= FhController.consultar(2).getStatusCode();
        assertEquals( HttpStatus.OK, getFicha);
    }
    @Test
    void getEmUmaFichaExistenteId3() {
        HttpStatus getFicha= FhController.consultar(3).getStatusCode();
        assertEquals( HttpStatus.OK, getFicha);
    }

    @Test
    void getEmUmaFichaExistenteIdaleatorio() {
        Random random = new Random();
        int numeroInteiroAleatorio = random.nextInt(100) + 10;
        HttpStatus getFicha= FhController.consultar(numeroInteiroAleatorio).getStatusCode();
        assertEquals( HttpStatus.OK, getFicha);
    }
}
