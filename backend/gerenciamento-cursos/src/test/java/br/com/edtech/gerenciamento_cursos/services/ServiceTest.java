package br.com.edtech.gerenciamento_cursos.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceTest {

    @Test
    void testSomaValoresComSucesso() {
        Assertions.assertNotNull(Service.somar(10, 10));
    }

    @Test
    void testSomaValoresComSucesso2() {
        int result = Service.somar(10, 10);
        Assertions.assertEquals(20, result);
    }

    @Test
    void testSomaValoresComSucesso3() {
        int result = Service.somar(10, 10);
        Assertions.assertEquals(20, result);
    }
}
