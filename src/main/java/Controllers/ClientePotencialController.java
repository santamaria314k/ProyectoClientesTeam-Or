package Controllers;

import Models.ClientePotencial;
import Services.ClientePotencialService;

public class ClientePotencialController {
    
     public ClientePotencialService ClientePotencialService;
    
    
    public ClientePotencialController(){
        this.ClientePotencialService = new ClientePotencialService();
    
}

public void InsertarClientePotencial(ClientePotencial nuevoClientePotencial){
        boolean respuesta =  ClientePotencialService.InsertarClientePotencial(nuevoClientePotencial);
        if(respuesta){
            System.out.println("Registro guardado con exito");
        }else{
            System.out.println("Resgistro no guardado, estas presentando problemas");
        }
    }
}
