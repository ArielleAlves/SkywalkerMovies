package modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_pagamento;
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;

    public long getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(long id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    
}
