package DB;

import Models.Cliente;
import java.util.ArrayList;

public class DataBaseCliente {
    
    private ArrayList<Cliente> lstCliente;
    
    public ArrayList<Cliente> getCliente() {
    return lstCliente;
    
}
    
public DataBaseCliente(){
        lstCliente = new ArrayList<> ();
        this.inicializarLista();
}



    private void inicializarLista() {
    lstCliente.add(new Cliente(88, "Santiago", "Lozano", "3168730834", "Independiente", 19));
    lstCliente.add(new Cliente(11, "Andres", "Camelo", "3174635456", "Independiente", 19));
    lstCliente.add(new Cliente(80, "Juan", "Cely", "3124658709", "Independiente", 39));
    lstCliente.add(new Cliente(18, "David", "Caicedo", "3112346576", "Independiente", 24));
    lstCliente.add(new Cliente(22, "Kevin", "Santamaria", "3143215476", "Independiente", 16));
    }
}
