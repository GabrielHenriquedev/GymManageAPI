package com.gymManage.Controllers;


import com.gymManage.controller.AlunoCadController;
import com.gymManage.controller.ProfCadController;
import com.gymManage.controller.StatusController;

import com.gymManage.modules.AlunoCadModels;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
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
    void getEmUmAlunoExistente() {
       HttpStatus getAluno= AlController.consultar(5).getStatusCode();
        assertEquals( HttpStatus.OK, getAluno);
    }

    @Test
    void eParaFalnharPoisOAlunoNaoExite() {
        HttpStatus getAluno= AlController.consultar(10).getStatusCode();
        assertEquals( HttpStatus.OK, getAluno);
    }

}
