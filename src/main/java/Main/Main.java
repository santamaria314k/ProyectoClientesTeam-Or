package Main;
//administador
import Controllers.AdministradorController;
import Models.Administrador;
import java.util.Scanner;
//cliente
import Controllers.ClienteController;
import Models.Cliente;


public class Main {


    public static void main(String[] args) {
        AdministradorController adminControl = new AdministradorController();
        Scanner leerDato = new Scanner(System.in);
        int id = 0;
        int idEliminar;
        int idModificacion;
        int opcionModificacion;
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
        
        System.out.println("Ingrese el id del admin a eliminar: ");
        idEliminar = leerDato.nextInt();
        adminControl.EliminarRegistro(idEliminar);
        adminControl.MostrarDatos();
        
        System.out.println("Ingrese el id del administrador que desea modificar: ");
        idModificacion = leerDato.nextInt();
        System.out.println("Ingrese 1 para modificar nombre, 2 para apellido, 3 para usuario, 4 para correo, 5 para contraseña o 6 para teléfono: ");
        opcionModificacion = leerDato.nextInt();
        System.out.println("Ingrese el dato: ");
        dato = leerDato.next();
        adminControl.ModificarAdministrador(idModificacion, opcionModificacion, dato);
        adminControl.MostrarDatos();
        
        
        
        //cliente
        
        
        
        
        
        
        ClienteController clienteController = new ClienteController();
        Scanner escanear = new Scanner(System.in);
         int idcli =0;
         
         int idEliminarcli;
        int idModificarcli;
        int opcionModificarcli;
        String info ="";
        
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
        
        System.out.println("Ingrese el id del cliente a eliminar: ");
        idEliminarcli = escanear.nextInt();
        clienteController.EliminarRegistroCliente(idEliminarcli);
        clienteController.MostrarDatosCliente();
        
        System.out.println("Ingrese el id del cliente que  desea modificar: ");
        idModificarcli = escanear.nextInt();
        System.out.println("Ingrese 1 para modificar nombres, 2 para apellidos, 3 para celular, 4 para ocupacion, 5 para edad: ");
        opcionModificarcli = escanear.nextInt();
        System.out.println("Ingrese la informacion: ");
        info = escanear.next();
        clienteController.ModificarCliente(idModificarcli, opcionModificarcli, info,edad);
        clienteController.MostrarDatosCliente();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
