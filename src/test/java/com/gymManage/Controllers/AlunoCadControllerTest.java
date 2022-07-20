package com.gymManage.Controllers;


import com.gymManage.controller.AlunoCadController;
import com.gymManage.controller.StatusController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AlunoCadControllerTest {

    @Autowired
    StatusController StController;
    @Autowired
    AlunoCadController AlController;


    @Test
    void saberSeApiEstaOnline() {
        assertEquals( "online", StController.check());
    }

    @Test
    void getEmUmAlunoExistenteId1() {
       HttpStatus getAluno= AlController.consultar(1).getStatusCode();
        assertEquals( HttpStatus.OK, getAluno);
    }

    @Test
    void getEmUmAlunoExistenteId2() {
        HttpStatus getAluno= AlController.consultar(2).getStatusCode();
        assertEquals( HttpStatus.OK, getAluno);
    }
    @Test
    void getEmUmAlunoExistenteId4() {
        HttpStatus getAluno= AlController.consultar(4).getStatusCode();
        assertEquals( HttpStatus.OK, getAluno);
    }

}
