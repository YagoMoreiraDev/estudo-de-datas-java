package tipo_local_date.entities_localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private LocalDate dataCriacao = LocalDate.now();

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataCriacao() {
        return this.dataCriacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
