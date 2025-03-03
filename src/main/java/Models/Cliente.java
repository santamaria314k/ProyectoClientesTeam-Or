package Models;

// importante const (ap-cl)
public class Cliente {
    private int idcli;
    private String nombres;
    private String apellidoscli;
    private String celular;
    private String ocupacion;
    private int edad;

    public Cliente(int idcli, String nombres, String apellidoscli, String celular, String ocupacion, int edad) {
        this.idcli = idcli;
        this.nombres = nombres;
        this.apellidoscli = apellidoscli;
        this.celular = celular;
        this.ocupacion = ocupacion;
        this.edad = edad;
    }

    public int getId() {
        return idcli;
    }

    public void setId(int idcli) {
        this.idcli = idcli;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidoscli;
    }

    public void setApellidos(String apellidoscli) {
        this.apellidoscli = apellidoscli;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
