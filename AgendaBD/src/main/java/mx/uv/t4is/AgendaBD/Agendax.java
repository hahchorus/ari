package mx.uv.t4is.AgendaBD;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agendax {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String fInicio;
    private String fLimite;
    
    public String getNombre() {
        return nombre;
    }

    public String getfLimite() {
        return fLimite;
    }
    
    public void setfLimite(String fLimite) {
        this.fLimite = fLimite;
    }
    
    public String getfInicio() {
        return fInicio;
    }
    
    public void setfInicio(String fInicio) {
        this.fInicio = fInicio;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
}
