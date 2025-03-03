package Services;

import DB.DataBaseAdministrador;
import Models.Administrador;

public class AdministradorService {
    public DataBaseAdministrador dbAdmin;
    
    public AdministradorService(){
        this.dbAdmin = new DataBaseAdministrador();
    }
    
    public void CrearAdministrador(Administrador admin){
        this.dbAdmin.getAdministrador().add(admin);
    }
    
    public void ImprimirDatos(){
        for(int i = 0; i< this.dbAdmin.getAdministrador().size(); i++){
            System.out.println("Inicio Datos----------------------------------------------------");
            System.out.println("ID " + this.dbAdmin.getAdministrador().get(i).getIdAdministrador());
            System.out.println("Nombres: " + this.dbAdmin.getAdministrador().get(i).getNombre());
            System.out.println("Apellidos " + this.dbAdmin.getAdministrador().get(i).getApellido());
            System.out.println("Usuario " + this.dbAdmin.getAdministrador().get(i).getUsuario());
            System.out.println("Contraseña " + this.dbAdmin.getAdministrador().get(i).getContraseña());
            System.out.println("E-mail: " + this.dbAdmin.getAdministrador().get(i).getEmail());
            System.out.println("Teléfono " + this.dbAdmin.getAdministrador().get(i).getTelefono());
            System.out.println("Fin Datos****************************************************");
        }
    }
    
    public void EliminarAdmin(int id){
        for(int i = 0; i< this.dbAdmin.getAdministrador().size(); i++){
            if(this.dbAdmin.getAdministrador().get(i).getIdAdministrador() == id){
                this.dbAdmin.getAdministrador().remove(i);
            }
        }
    }
    
    public void ModificarAdministrador(int id, int opcion, String dato){
        for(int i = 0; i< this.dbAdmin.getAdministrador().size(); i++){
            switch (opcion) {
                case 1 -> this.dbAdmin.getAdministrador().get(i).setNombre(dato);
                case 2 -> this.dbAdmin.getAdministrador().get(i).setApellido(dato);
                case 3 -> this.dbAdmin.getAdministrador().get(i).setUsuario(dato);
                case 4 -> this.dbAdmin.getAdministrador().get(i).setContraseña(dato);
                case 5 -> this.dbAdmin.getAdministrador().get(i).setUsuario(dato);
                case 6 -> this.dbAdmin.getAdministrador().get(i).setTelefono(dato);
                default -> {
                    System.out.println("No es válida la opción");
                }
            }
        }
    }
    
}
