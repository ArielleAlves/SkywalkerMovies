
package modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCard;
    private
    
}
