package br.com.edtech.gerenciamento_cursos;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal da aplicação Gerenciamento de Cursos.
 */
@SpringBootApplication
public class GerenciamentoCursosApplication {
    // Construtor privado para evitar instanciação
    private GerenciamentoCursosApplication() {
        throw new UnsupportedOperationException("Classe utilitária");
    }

    /**
     * Método principal da aplicação.
     * @param args argumentos da linha de comando
     */
    public static void main(final String[] args) {
        org.springframework.boot.SpringApplication.run(GerenciamentoCursosApplication.class, args);
    }
}
