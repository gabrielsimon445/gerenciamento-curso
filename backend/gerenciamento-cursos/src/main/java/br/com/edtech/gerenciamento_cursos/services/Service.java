package br.com.edtech.gerenciamento_cursos.services;

/**
 * Classe utilitária de serviços.
 */
public class Service {
    // Construtor privado para evitar instanciação
    private Service() {
        throw new UnsupportedOperationException("Classe utilitária");
    }

    /**
     * Soma dois valores inteiros.
     * @param valor1 primeiro valor
     * @param valor2 segundo valor
     * @return soma dos valores
     */
    public static int somar(final int valor1, final int valor2) {
        return valor1 + valor2;
    }
}
