package Controllers;

import Models.Empresa;
import Services.EmpresaService;

public class EmpresaController {
    public EmpresaService EmpresaService;
    
    public EmpresaController(){
        this.EmpresaService = new EmpresaService();   
}
    
    public void InsertarEmpresa(Empresa nuevaEmpresa){
        boolean respuesta =  EmpresaService.InsertarEmpresa(nuevaEmpresa);
        if(respuesta){
            System.out.println("Registro guardado con exito");
        }else{
            System.out.println("Resgistro no guardado, estas presentando problemas");
        }
    }
}
