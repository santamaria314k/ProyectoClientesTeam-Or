package Services;

import DB.DataBaseEmpresa;
import Models.Empresa;

public class EmpresaService {
    public DataBaseEmpresa dbEmpresa;
    
    public EmpresaService(){
        this.dbEmpresa = new DataBaseEmpresa();
    }
    
   public void CrearEmpresa(Empresa empresa){
        this.dbEmpresa.getEmpresa().add(empresa);
    }
    
    public void ImprimirDatos(){
        for(int i = 0; i< this.dbEmpresa.getEmpresa().size(); i++){
            System.out.println("Inicio Datos----------------------------------------------------");
            System.out.println("nit " + this.dbEmpresa.getEmpresa().get(i).getNit());
            System.out.println("razonSocial: " + this.dbEmpresa.getEmpresa().get(i).getRazonSocial());
            System.out.println("telefono " + this.dbEmpresa.getEmpresa().get(i).getTelefono());
            System.out.println("actividad " + this.dbEmpresa.getEmpresa().get(i).getActividad());
            System.out.println("Fin Datos****************************************************");
        }
    }
    
    public void EliminarEmpresa(String nit){
        for(int i = 0; i< this.dbEmpresa.getEmpresa().size(); i++){
            if(this.dbEmpresa.getEmpresa().get(i).getNit().equals(nit)){
                this.dbEmpresa.getEmpresa().remove(i);
            }
        }
    }
    
    public void ModificarEmpresa(String id, int opcion, String dato){
        for(int i = 0; i< this.dbEmpresa.getEmpresa().size(); i++){
            if(this.dbEmpresa.getEmpresa().get(i).getNit().equals(id)) {
            switch (opcion) {
                case 1 -> this.dbEmpresa.getEmpresa().get(i).setRazonSocial(dato);
                case 2 -> this.dbEmpresa.getEmpresa().get(i).setTelefono(dato);
                case 3 -> this.dbEmpresa.getEmpresa().get(i).setActividad(dato);
                default -> {
                    System.out.println("No es válida la opción");
                }
            }
        }
    }
}
}