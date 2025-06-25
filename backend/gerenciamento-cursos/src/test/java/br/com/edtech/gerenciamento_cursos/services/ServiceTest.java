package br.com.edtech.gerenciamento_cursos.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceTest {

    @Test
    void testSoma() {
        Assertions.assertNotNull(Service.somaValores(10.0, 10.0));
    }
}
