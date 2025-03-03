package Controllers;

import Models.ClientePotencial;
import Services.ClientePotencialService;

public class ClientePotencialController {
    
    public ClientePotencialService ClienPoteService;

    public ClientePotencialController() {
        this.ClienPoteService = new ClientePotencialService();
    }
    
    public void CrearClientePotencial(ClientePotencial nuevoClientePotencial){
        ClienPoteService.CrearClientePotencial(nuevoClientePotencial);
    }
    
    public void ImprimirDatosClientePotencial(){
        ClienPoteService.ImprimirDatosClientePotencial();
    }
    
    public void EliminarDatosClientePotencial(int id){
        ClienPoteService.EliminarDatosClientePotencial(id);
    }
    
    public void ModificarDatosPotencial(int id, int opcion, String dato){
        ClienPoteService.ModificarDatosPotencial(id, opcion, dato);
    }
}
