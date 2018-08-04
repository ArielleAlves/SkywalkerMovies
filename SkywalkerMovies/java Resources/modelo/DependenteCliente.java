package modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class DependenteCliente {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDependente;
   @Column(nullable = false)
    private String nome;
   @Column(nullable = false)
   @Temporal(TemporalType.DATE)
    private Date dataNascimento;
   @Column(nullable = false, unique = true)
    private String cpf;
   @Column(nullable = false, unique = true)
   private String login;
   @Column(nullable = false)
   private String senha;

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
        return dataNascimento;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNascimento = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
