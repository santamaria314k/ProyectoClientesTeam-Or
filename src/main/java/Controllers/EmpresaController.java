package Controllers;

import Models.Empresa;
import Services.EmpresaService;

public class EmpresaController {
    public EmpresaService EmpresaService;
    
    public EmpresaController(){
        this.EmpresaService = new EmpresaService();   
}
    
    public void InsertarEmpresa(Empresa nuevaEmpresa){
        EmpresaService.CrearEmpresa(nuevaEmpresa);
    }
    
    public void MostrarDatos(){
        EmpresaService.ImprimirDatos();
    }
    
    public void EliminarRegistro(String nit){
        EmpresaService.EliminarEmpresa(nit);
    }
    
    public void ModificarEmpresa(String id, int opcion, String dato){
        EmpresaService.ModificarEmpresa(id, opcion, dato);
    }
}
