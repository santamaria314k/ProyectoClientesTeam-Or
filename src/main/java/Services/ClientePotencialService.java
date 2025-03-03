package Services;

import DB.DataBaseClientePotencial;
import Models.ClientePotencial;

public class ClientePotencialService {
    
    public DataBaseClientePotencial db;
    
    public ClientePotencialService(){
        this.db = new DataBaseClientePotencial();
        
}
    
public boolean InsertarClientePotencial(ClientePotencial nuevoClientePotencial){
         if (nuevoClientePotencial == null) {
             System.out.println("Campos vacios! no se pudo agregar el cliente potencial :( ");
            return false; // No se puede agregar un cliente potencial nulo
        }
        
        db.getClientePotencial().add(nuevoClientePotencial); // Agrega el cliente potencial a la lista
        System.out.println("El Cliente se agrego correctamente :)");
        return true; // Indica que la inserción fue exitosa
    
    }
}
