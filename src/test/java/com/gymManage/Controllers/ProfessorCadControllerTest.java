package com.gymManage.Controllers;

import com.gymManage.controller.ProfCadController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProfessorCadControllerTest {

    @Autowired
    ProfCadController PfController;

    @Test
    void getEmUmProfessorExistenteId1() {
        HttpStatus getProfessor= PfController.consultar(1).getStatusCode();
        assertEquals( HttpStatus.OK, getProfessor);
    }

    @Test
    void getEmUmProfessorExistenteId2() {
        HttpStatus getProfessor= PfController.consultar(2).getStatusCode();
        assertEquals( HttpStatus.OK, getProfessor);
    }

    @Test
    void getEmUmProfessorExistenteId3() {
        HttpStatus getProfessor= PfController.consultar(3).getStatusCode();
        assertEquals( HttpStatus.OK, getProfessor);
    }

}
