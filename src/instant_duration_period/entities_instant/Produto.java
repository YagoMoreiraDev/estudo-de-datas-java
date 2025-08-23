package instant_duration_period.entities_instant;

import java.time.Instant;

public class Produto {

    private String nome;
    private double valor;
    private String descrica;

    private Instant dataCriacao = Instant.now();
    private Instant dataAlteracao;

    public Produto(String nome, double valor, String descrica) {
        this.nome = nome;
        this.valor = valor;
        this.descrica = descrica;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getDescrica() {
        return descrica;
    }

    public void alterarValor(double novoValor) {
        this.valor = novoValor;
    }
}
