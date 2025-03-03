
package Controllers;

import Models.Administrador;
import Services.AdministradorService;


public class AdministradorController {
    public AdministradorService adminService;

    public AdministradorController() {
        this.adminService = new AdministradorService();
    }
    
    public void InsertarAdministrador(Administrador nuevoAdmin){
        adminService.CrearAdministrador(nuevoAdmin);
    }
    
    public void MostrarDatos(){
        adminService.ImprimirDatos();
    }
    
    public void EliminarRegistro(int id){
        adminService.EliminarAdmin(id);
    }
    
    public void ModificarAdministrador(int id, int opcion, String dato){
        adminService.ModificarAdministrador(id, opcion, dato);
    }
    
}
