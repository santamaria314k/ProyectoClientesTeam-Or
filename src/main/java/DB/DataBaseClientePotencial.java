package DB;

import Models.ClientePotencial;
import java.util.ArrayList;

public class DataBaseClientePotencial {
    
    private ArrayList<ClientePotencial> lstClientes;
    
    public ArrayList<ClientePotencial> getClientePotencial() {
    return lstClientes;
    
}

public DataBaseClientePotencial(){
        lstClientes = new ArrayList<> ();
        this.inicializarLista();
}
    private void inicializarLista() {
    lstClientes.add(new ClientePotencial(1, "andres", "hincapie", "3209996288", 19, "Ingeniero", "Tecnología"));
    lstClientes.add(new ClientePotencial(2, "santiago", "López", "3152639581", 20, "ingeniero", "software"));
    lstClientes.add(new ClientePotencial(3, "david", "rodriguez", "3125685296", 23, "ingeniero", "software"));
    lstClientes.add(new ClientePotencial(4, "sebastian", "cardona", "3214783658", 21, "ingeniero", "software"));
    lstClientes.add(new ClientePotencial(5, "kevin", "zapata", "3143042272", 20, "ingeniero", "software"));
    }
}