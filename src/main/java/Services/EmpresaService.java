package Services;
import DB.DataBaseEmpresa;
import Models.Empresa;

public class EmpresaService {
    
    public DataBaseEmpresa db;
    
    public EmpresaService(){
        this.db = new DataBaseEmpresa();
    }
    
    public boolean InsertarEmpresa(Empresa nuevaEmpresa){
        if (nuevaEmpresa == null){
            System.out.println("Campos vacios! no se pudo agregar la empresa :( ");
            return false; // No se puede agregar una empresa nula
        }
        
        db.getEmpresa().add(nuevaEmpresa); // Agrega a la empresa a la lista
        System.out.println("La empresa se agrego correctamente :)");
        return true; // Indica que la inserción fue exitosa
        
    }  
}
