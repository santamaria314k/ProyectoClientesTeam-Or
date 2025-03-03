package DB;

import Models.Administrador;
import java.util.ArrayList;

public class DataBaseAdministrador {
    
    private ArrayList<Administrador> lstAdministrador;
    
    public ArrayList<Administrador> getAdministrador() {
    return lstAdministrador;
    
}
    
    public DataBaseAdministrador(){
        lstAdministrador = new ArrayList<> ();
        this.inicializarLista();
}
    private void inicializarLista() {
    lstAdministrador.add(new Administrador(1,"Santiago", "Lozano", "Hola", "san132435", "santylozano318@gmail.com", "3168324365"));
    lstAdministrador.add(new Administrador(2, "Juan", "Sebastian", "jcelymo", "hola123", "juanescely@hotmail.com", "3176325897"));
    lstAdministrador.add(new Administrador(3, "Alberto", "Gomez", "almez", "1234", "alberto@hotmail.com", "3145987456"));
    lstAdministrador.add(new Administrador(4, "Laura", "Paez", "lape", "lape@1", "lape@outlook.com", "3105987458"));
    lstAdministrador.add(new Administrador(5,"Carolina", "Cruz", "cacru", "cru9878", "cruz@gmail.com", "3178959874"));

    }
    
}
