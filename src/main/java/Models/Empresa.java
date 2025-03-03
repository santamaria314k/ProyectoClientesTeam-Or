package Models;


public class Empresa {
    private String nit;
    private String razonSocial;
    private String telefono;
    private String actividad;

    public Empresa(String nit, String razonSocial, String telefono, String actividad) {
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.actividad = actividad;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
    
}