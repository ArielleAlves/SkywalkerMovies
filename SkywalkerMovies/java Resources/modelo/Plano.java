package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plano {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column (nullable = false)
    private String nome;
    @Column(nullable = false)
    private int valor;
    @Column(nullable = false)
    private String Especificacao;

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getEspecificacao() {
        return Especificacao;
    }

    public void setEspecificacao(String Especificacao) {
        this.Especificacao = Especificacao;
    }
    
    
}
