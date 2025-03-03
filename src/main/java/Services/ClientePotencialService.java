package Services;

import DB.DataBaseClientePotencial;
import Models.ClientePotencial;

public class ClientePotencialService {
    public DataBaseClientePotencial dbClienPote;
    
    public ClientePotencialService(){
        this.dbClienPote = new DataBaseClientePotencial();
        }
    //crear datos del cliente
    public void CrearClientePotencial(ClientePotencial clientePote){
        this.dbClienPote.getClientePotencial().add(clientePote);
    }
    
    //imprimir datos de usurio
    public void ImprimirDatosClientePotencial(){
        for(int i = 0; i< this.dbClienPote.getClientePotencial().size(); i++){
            System.out.println("Inicio Datos----------------------------------------------------");
            System.out.println("ID " + this.dbClienPote.getClientePotencial().get(i).getId());
            System.out.println("Nombres: " + this.dbClienPote.getClientePotencial().get(i).getNombres());
            System.out.println("Apellidos " + this.dbClienPote.getClientePotencial().get(i).getApellidos());
            System.out.println("celular " + this.dbClienPote.getClientePotencial().get(i).getCelular());
            System.out.println("edad" + this.dbClienPote.getClientePotencial().get(i).getEdad());
            System.out.println("ocupacion: " + this.dbClienPote.getClientePotencial().get(i).getOcupacion());
            System.out.println("intereses " + this.dbClienPote.getClientePotencial().get(i).getIntereses());
            System.out.println("Fin Datos****************************************************");
        }
    }
    
    
    //eliminar datos del cliente potencial
    public void EliminarDatosClientePotencial(int id){
        for(int i = 0; i< this.dbClienPote.getClientePotencial().size(); i++){
            if(this.dbClienPote.getClientePotencial().get(i).getId() == id){
                this.dbClienPote.getClientePotencial().remove(i);
            }
        }
    }
    
    //Modificar datos del Cliente Potencial
    public void ModificarDatosPotencial(int id, int opcion, String dato){
        for(int i = 0; i< this.dbClienPote.getClientePotencial().size(); i++){
            if(this.dbClienPote.getClientePotencial().get(i).getId() == id){
                switch (opcion){
                    case 1 -> this.dbClienPote.getClientePotencial().get(i).setNombres(dato);
                    case 2 -> this.dbClienPote.getClientePotencial().get(i).setApellidos(dato);
                    case 3 -> this.dbClienPote.getClientePotencial().get(i).setCelular(dato);
                    case 4 -> this.dbClienPote.getClientePotencial().get(i).setEdad(Integer.parseInt(dato));
                    case 5 -> this.dbClienPote.getClientePotencial().get(i).setOcupacion(dato);
                    case 6 -> this.dbClienPote.getClientePotencial().get(i).setIntereses(dato);
                    default -> {
                        System.out.println("No es válida la opción");
                    }
                }
            }
        }
    }
}
