
package Services;

import DB.DataBaseCliente;
import Models.Cliente;

public class ClienteService {
    public DataBaseCliente db;
    
    public ClienteService(){
        this.db = new DataBaseCliente();
    }
    
    public void CrearCliente(Cliente cliente){
        this.db.getCliente().add(cliente);
    }
    
    public void Imprimir(){
        for(int i = 0; i< this.db.getCliente().size(); i++){
            System.out.println("///////////////////////////////////////////////////////7///////////");
            System.out.println("ID " + this.db.getCliente().get(i).getId());
            System.out.println("Nombres: " + this.db.getCliente().get(i).getNombres());
            System.out.println("Apellidos : " + this.db.getCliente().get(i).getApellidos());
            System.out.println("celular :" + this.db.getCliente().get(i).getCelular());
            System.out.println("ocupacion :" + this.db.getCliente().get(i).getOcupacion());
            System.out.println("edad: " + this.db.getCliente().get(i).getEdad());
           
            System.out.println("--------------//-----------//----------//-----------//--------");
        }
    }
    
    public void EliminarCliente(int id){
        for(int i = 0; i< this.db.getCliente().size(); i++){
            if(this.db.getCliente().get(i).getId() == id){
                this.db.getCliente().remove(i);
            }
        }
    }
    
    public void ModificarCliente(int id, int seleccion, String info ,int edad){
        for(int i = 0; i< this.db.getCliente().size(); i++){
            if(this.db.getCliente().get(i).getId() == id){
            switch (seleccion) {
                case 1 -> this.db.getCliente().get(i).setNombres(info);
                case 2 -> this.db.getCliente().get(i).setApellidos(info);
                case 3 -> this.db.getCliente().get(i).setCelular(info);
                case 4 -> this.db.getCliente().get(i).setOcupacion(info);
                case 5 -> this.db.getCliente().get(i).setEdad(edad);
                
                default -> {
                    System.out.println("Te equivocaste de opcion");
                }
            }
        }
    }
    
}
}
