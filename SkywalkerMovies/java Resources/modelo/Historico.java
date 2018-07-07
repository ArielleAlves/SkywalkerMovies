package modelo;

import javax.persistence.Temporal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TemporalType;

@Entity
public class Historico {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long Id;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
   private Date dataAcesso; 
}
