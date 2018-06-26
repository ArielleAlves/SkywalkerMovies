package modelo;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DependenteCliente {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDependente;
    private String nome;
    private Date dataNasc;
    private String cpf;

    public long getIdDependente() {
        return idDependente;
    }

    public void setIdDependente(long idDependente) {
        this.idDependente = idDependente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
