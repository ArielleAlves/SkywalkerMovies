package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conteudo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idConteudo; 
    private String nome;
    private String genero;
    private String tipo;
    private int indicacao;
    private int anoLancamento;
    private int tempoDuracao;

    public int getIdConteudo() {
        return idConteudo;
    }

    public void setIdConteudo(int idConteudo) {
        this.idConteudo = idConteudo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(int indicacao) {
        this.indicacao = indicacao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }
}
