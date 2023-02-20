package dio.guilherme.model;

import java.util.Calendar;

public class Curso {
    private String nome;
    private String descricao;
    private int cargaHoraria;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public String toString() {
        return "Curso [nome=" + nome + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
    }

    

    
    



}