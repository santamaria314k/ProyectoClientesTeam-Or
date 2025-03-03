package DB;

import Models.Empresa;
import java.util.ArrayList;

public class DataBaseEmpresa {

 private ArrayList<Empresa> lstEmpresa;
    
    public ArrayList<Empresa> getEmpresa() {
    return lstEmpresa;
    
}

public DataBaseEmpresa(){
        lstEmpresa = new ArrayList<> ();
        this.inicializarLista();
}
    private void inicializarLista() {
    lstEmpresa.add(new Empresa("880697", "La Campana", "3209996288", "Aceros"));
    lstEmpresa.add(new Empresa("312459", "Homcenter", "3125465673", "Tienda"));
    lstEmpresa.add(new Empresa("132456", "Contructora Bolivar", "3115647698", "Construccion"));
    lstEmpresa.add(new Empresa("967580", "Ferreteria la Campiña", "3125647609", "Ferreteria"));
    lstEmpresa.add(new Empresa("152876", "Fabrica HyG", "3112347698", "Jaulas"));
    }    
}
