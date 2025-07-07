
package edaproyecto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import TDA.*;

public class Expediente {
        private int id;
        private int prioridad;
        private int dni;
        private String nombres;
        private int celular;
        private String email;
        private String asunto;
        private String documentoReferencia;
        private LocalDateTime fechaInicio;
        private LocalDateTime fechaFin;
        private Lista<movimiento> seguimiento;
        private Boolean Interno;

    public Expediente() {
    }

    public Expediente(int id,int prioridad, int dni, String nombres,int celular,String email, String asunto, String documentoReferencia, LocalDateTime fechaInicio, Boolean Interno) {
        this.id = id;
        this.prioridad = prioridad; 
        this.dni = dni;
        this.nombres = nombres;
        this.celular = celular;
        this.email = email;
        this.asunto = asunto;
        this.documentoReferencia = documentoReferencia;
        this.fechaInicio = fechaInicio;
        this.fechaFin = null;
        this.Interno = Interno;
        this.seguimiento = new Lista<movimiento>();
    }
        
        public void finalizar() {
            this.fechaFin = LocalDateTime.now();
        }

    public int getId() {
        return id;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Lista<movimiento> getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(Lista<movimiento> seguimiento) {
        this.seguimiento = seguimiento;
    }

    public Boolean getInterno() {
        return Interno;
    }

    public void setInterno(Boolean Interno) {
        this.Interno = Interno;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getDocumentoReferencia() {
        return documentoReferencia;
    }


    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }
}

    

    
 