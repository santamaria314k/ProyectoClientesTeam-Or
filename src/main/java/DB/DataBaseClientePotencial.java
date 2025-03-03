package DB;

import Models.ClientePotencial;
import java.util.ArrayList;

public class DataBaseClientePotencial {
    
    private ArrayList<ClientePotencial> lstClientePotencial;
    
    public ArrayList<ClientePotencial> getClientePotencial() {
        return lstClientePotencial;
    }
    


    public DataBaseClientePotencial(){
        lstClientePotencial = new ArrayList<> ();
        this.inicializarLista();
    }
    
    
    private void inicializarLista() {
    lstClientePotencial.add(new ClientePotencial(1, "andres", "hincapie", "3209996288", 19, "Ingeniero", "Tecnología"));
    lstClientePotencial.add(new ClientePotencial(2, "santiago", "López", "3152639581", 20, "ingeniero", "software"));
    lstClientePotencial.add(new ClientePotencial(3, "david", "rodriguez", "3125685296", 23, "ingeniero", "software"));
    lstClientePotencial.add(new ClientePotencial(4, "sebastian", "cardona", "3214783658", 21, "ingeniero", "software"));
    lstClientePotencial.add(new ClientePotencial(5, "kevin", "zapata", "3143042272", 20, "ingeniero", "software"));
    }
}