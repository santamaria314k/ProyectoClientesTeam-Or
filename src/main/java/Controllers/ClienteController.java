
package Controllers;



import Models.Cliente;
import Services.ClienteService;



public class ClienteController {
    
    
     public ClienteService clienteService;

    public ClienteController() {
        this.clienteService = new ClienteService();
    }
    
    public void InsertarCliente(Cliente nuevoCliente){
        clienteService.CrearCliente(nuevoCliente);
    }
    
    public void MostrarDatosCliente(){
        clienteService.Imprimir();
    }
    
    public void EliminarRegistroCliente(int id){
        clienteService.EliminarCliente(id);
    }
    
    public void ModificarCliente(int id, int seleccion, String info,int edad){
        
        clienteService.ModificarCliente(id, seleccion, info,edad);
    }
    
    
    
    
    
    
}
