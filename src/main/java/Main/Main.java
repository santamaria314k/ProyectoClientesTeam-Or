package Main;
//administador
import Controllers.AdministradorController;
import Models.Administrador;


//empresa
import Controllers.EmpresaController;
import Models.Empresa;

//cliente potencial
import Models.ClientePotencial;
import Controllers.ClientePotencialController;

//cliente
import Controllers.ClienteController;
import Models.Cliente;



import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        //administrador ----------------------------vs4
        
        
       
        ClientePotencialController ClientePotencialControl = new ClientePotencialController();
        AdministradorController adminControl = new AdministradorController();
        Scanner leerDato = new Scanner(System.in);
        int id = 0;
        String dato = "";
        String nombre = "";
        String apellidos = "";
        String usuario = "";
        String contraseña = "";
        String email = "";
        String telefono = "";
        
        System.out.println("Ingrese el Id: ");
        id = leerDato.nextInt();
        System.out.println("Ingrese su nombre: ");
        nombre = leerDato.next();
        System.out.println("Ingrese su apellido: ");
        apellidos = leerDato.next();
        System.out.println("Ingrese el usuario: ");
        usuario = leerDato.next();
        System.out.println("Ingrese la contraseña: ");
        contraseña = leerDato.next();
        System.out.println("Ingrese su correo: ");
        email = leerDato.next();
        System.out.println("Ingrese su teléfono: ");
        telefono = leerDato.next();
        
        Administrador admin1 = new Administrador(id, nombre, apellidos, usuario, contraseña, email, telefono);
        adminControl.InsertarAdministrador(admin1);
        adminControl.MostrarDatos();
        

        
        //modificar
        int idEliminar;
        int idModificacion;
        int opcionModificacion;
        
        
        System.out.println("Ingrese el id del administrador que desea modificar: ");
        idModificacion = leerDato.nextInt();
        System.out.println("Ingrese 1 para modificar nombre, 2 para apellido, 3 para usuario, 4 para correo, 5 para contraseña o 6 para teléfono: ");
        opcionModificacion = leerDato.nextInt();
        System.out.println("Ingrese el dato: ");
        dato = leerDato.next();
        adminControl.ModificarAdministrador(idModificacion, opcionModificacion, dato);
        adminControl.MostrarDatos();
        
        
        //eliminar
        
        System.out.println("Ingrese el id del admin a eliminar: ");
        idEliminar = leerDato.nextInt();
        adminControl.EliminarRegistro(idEliminar);
        adminControl.MostrarDatos();
        
        
        
        
         
//Empresa ----------------------------vs4

//object controoller de empresa
        EmpresaController empresaControl = new EmpresaController();

        
        String nitEmpresa = "";
        String razonSocialEmpresa = "";
        String telefonoEmpresa = "";
        String actividadEmpresa = "";
        
        System.out.println("Ingrese el nit: ");
        nitEmpresa = leerDato.next();
        System.out.println("Ingrese la razon social: ");
        razonSocialEmpresa = leerDato.next();
        System.out.println("Ingrese su telefono: ");
        telefonoEmpresa = leerDato.next();
        System.out.println("Ingrese su actividad: ");
        actividadEmpresa = leerDato.next();
        
        Empresa empresa1 = new Empresa(nitEmpresa, razonSocialEmpresa, telefonoEmpresa, actividadEmpresa);
        empresaControl.InsertarEmpresa(empresa1);
        empresaControl.MostrarDatos();
        
        //modificar
        String datoEmpresa;
        int opcionModificacionEmpresa;
        String nitModificacion;
        String nitEliminar; 
        
       
        System.out.println("Ingrese el nit de la empresa que desea modificar: ");
        nitModificacion = leerDato.next();
        System.out.println("Ingrese 1 para modificar razon social, 2 para telefono, 3 para actividad: ");
        opcionModificacionEmpresa = leerDato.nextInt();
        System.out.println("Ingrese el dato: ");
        datoEmpresa = leerDato.next();
        empresaControl.ModificarEmpresa(nitModificacion, opcionModificacionEmpresa, datoEmpresa);
        empresaControl.MostrarDatos();
        
        //eliminar
        
        System.out.println("Ingrese el nit de la empresa a eliminar: ");
        nitEliminar = leerDato.next();
        empresaControl.EliminarRegistro(nitEliminar);
        empresaControl.MostrarDatos();
           
        
        
        
          /*ClientePotencial  vs -------------------------------------------4*/
        
        int idClientePotencial;
        String nombresClientePotencial = "";
        String apellidoClientePotencial = "";
        String celularClientePotencial = "";
        int edadClientePotencial;
        String ocupacionClientePotencial = "";
        String interesesClientePotencial = "";
        
        System.out.println("Ingrese el Id del Cliente Potencial: ");
        idClientePotencial = leerDato.nextInt();
        System.out.println("Ingrese su nombre del Cliente Potencial: ");
        nombresClientePotencial = leerDato.next();
        System.out.println("Ingrese su apellido del Cliente Potencial: ");
        apellidoClientePotencial = leerDato.next();
        System.out.println("Ingrese el celular del ClientePotencial: ");
        celularClientePotencial = leerDato.next();
        System.out.println("Ingrese la edad del Cliente Potencial");
        edadClientePotencial = leerDato.nextInt();
        System.out.println("Ingrese la ocupacion del Cliente Potencial ");
        ocupacionClientePotencial = leerDato.next();
        System.out.println("Ingrese el interes del Cliente Potencial ");
        interesesClientePotencial = leerDato.next();
        
        ClientePotencial CliePoten1 = new ClientePotencial(idClientePotencial, nombresClientePotencial, apellidoClientePotencial, celularClientePotencial, edadClientePotencial, ocupacionClientePotencial, interesesClientePotencial);
        ClientePotencialControl.CrearClientePotencial(CliePoten1);
        ClientePotencialControl.ImprimirDatosClientePotencial();
        
        //variables
        int idCpModificacion;
        int opcionModificacionCp;
        int CpEliminar; 
        String datoCp;
        
        System.out.println("Ingrese el id del Cliente POtencial que desea modificar: ");
        idCpModificacion = leerDato.nextInt();
        System.out.println("Ingrese 1 para nombre, 2 para apellido, 3 para celular, 4 para edad, 5 para ocupacion, 6 para actividades: ");
        opcionModificacionCp = leerDato.nextInt();
        System.out.println("Ingrese el dato: ");
        datoCp = leerDato.next();
        ClientePotencialControl.ModificarDatosPotencial(idCpModificacion, opcionModificacionCp, datoCp);
        ClientePotencialControl.ImprimirDatosClientePotencial();
        
        //elimninar
        System.out.println("Ingrese el id de cliente potencial a eliminar: ");
        CpEliminar = leerDato.nextInt();
        ClientePotencialControl.EliminarDatosClientePotencial(CpEliminar);
        ClientePotencialControl.ImprimirDatosClientePotencial();
        
        
        
        
        
        
        
        
        
      
     
        //cliente ----------------------------vs4
        
   
        
        ClienteController clienteController = new ClienteController();
        Scanner escanear = new Scanner(System.in);
         int idcli =0;
         String nombres="";
         String apellidoscli="";
         String celular="";
         String ocupacion="";
         int edad=0;
        
        System.out.println("Ingrese el Id del cliente: ");
        idcli = escanear.nextInt();
        System.out.println("Ingrese los nombres del cliente: ");
        nombres = escanear.next();
        System.out.println("Ingrese los apellidos del cliente: ");
        apellidoscli = escanear.next();
        System.out.println("Ingrese el celular del cliente: ");
        celular = escanear.next();
        System.out.println("Ingrese la ocupacion del cliente: ");
        ocupacion = escanear.next();
        System.out.println("edad del cliente: ");
        edad = escanear.nextInt();
        
        
        Cliente clientess = new Cliente(idcli, nombres, apellidos, celular, ocupacion, edad);
        clienteController.InsertarCliente(clientess);
        clienteController.MostrarDatosCliente();
        
        
       
      //modificar
      
        int idEliminarcli;
        int idModificarcli;
        int opcionModificarcli;
        String info;
        
        
        
        System.out.println("Ingrese el id del cliente que  desea modificar: ");
        idModificarcli = escanear.nextInt();
        System.out.println("Ingrese 1 para modificar nombres, 2 para apellidos, 3 para celular, 4 para ocupacion, 5 para edad: ");
        opcionModificarcli = escanear.nextInt();
        System.out.println("Ingrese la informacion: ");
        info = escanear.next();
        clienteController.ModificarCliente(idModificarcli, opcionModificarcli, info,edad);
        clienteController.MostrarDatosCliente();
        
        //eliminar
         
        System.out.println("Ingrese el id del cliente a eliminar: ");
        idEliminarcli = escanear.nextInt();
        clienteController.EliminarRegistroCliente(idEliminarcli);
        clienteController.MostrarDatosCliente();
        
        
        
        
        
        
  
    
        
        
    }
    
}
