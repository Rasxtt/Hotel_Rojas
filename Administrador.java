package Paquete;

public class Administrador extends Empleado{
    public Administrador(int dni, String nom, String ape, String rol) {
        super(dni, nom, ape, rol);
    }

    public void GestionEmpleado(int dni, String nom, String ape, String rol,String tipoOperacion){
        if(tipoOperacion.equalsIgnoreCase("i")){
            if(rol.equalsIgnoreCase("r")){
                Recepcionista R1 = new Recepcionista(dni,nom, ape,rol);
                SistemaHotel.GR.Ingresar(R1);
            }
            if(rol.equalsIgnoreCase("a")){
                Administrador A1 = new Administrador(dni,nom, ape,rol);
                SistemaHotel.GA.Ingresar(A1);
            }    
        }
        if(tipoOperacion.equalsIgnoreCase("e")){
            if(rol.equalsIgnoreCase("r")){
                Recepcionista R1 = new Recepcionista(dni,nom, ape,rol);
                SistemaHotel.GR.eliminar(R1.getDni());
            }
            if(rol.equalsIgnoreCase("a")){
                Administrador A1 = new Administrador(dni,nom, ape,rol);
                SistemaHotel.GA.eliminar(A1.getDni());
            } 
        }
        if(tipoOperacion.equalsIgnoreCase("m")){
            if(rol.equalsIgnoreCase("r")){
                Recepcionista R1 = new Recepcionista(dni,nom, ape,rol);
                SistemaHotel.GR.Modificar(R1.getDni());
            }
            if(rol.equalsIgnoreCase("a")){
                Administrador A1 = new Administrador(dni,nom, ape,rol);
                SistemaHotel.GA.Modificar(A1.getDni());
            } 
        }
    }
    public void GestionHabitaciones(int num, int max, float preNo, String tip,String dispo,String tipoOperacion,int d,int m,int a,int df,int mf,int af){
        if(tipoOperacion.equalsIgnoreCase("m")){
            Habitacion H1 = new Habitacion(num, max,d,m,a,df,mf,af,preNo,tip, dispo,"Limpia");
            SistemaHotel.GH.Modificar(H1.getNum());
        }
        if(tipoOperacion.equalsIgnoreCase("e")){
            Habitacion H1 = new Habitacion(num, max,d,m,a,df,mf,af,preNo,tip, dispo,"Limpia");
            SistemaHotel.GH.eliminar(H1.getNum());
        }
        if(tipoOperacion.equalsIgnoreCase("i")){
            Habitacion H1 = new Habitacion(num, max,d,m,a,df,mf,af,preNo,tip, dispo,"Sucia");
            SistemaHotel.GH.Ingresar(H1);    
        }   
    }
    // Polimorfismo: gestión simple sin fechas
    public void GestionHabitacionesSimple(int num, int max, float preNo, String tip, String dispo, String tipoOperacion) {
        if(tipoOperacion.equalsIgnoreCase("m")){
            Habitacion H1 = new Habitacion(num, max, preNo, tip, dispo, "Limpia");
            SistemaHotel.GH.Modificar(H1.getNum());
        }
        if(tipoOperacion.equalsIgnoreCase("e")){
            Habitacion H1 = new Habitacion(num, max, preNo, tip, dispo, "Limpia");
            SistemaHotel.GH.eliminar(H1.getNum());
        }
        if(tipoOperacion.equalsIgnoreCase("i")){
            Habitacion H1 = new Habitacion(num, max, preNo, tip, dispo, "Sucia");
            SistemaHotel.GH.Ingresar(H1);    
        }   
    }
    public void GestionServicios(String nom, float precio,String tipoOperacion){
        if(tipoOperacion.equalsIgnoreCase("m")){
            ServicioAdicional S1 = new ServicioAdicional(nom, precio);
            SistemaHotel.GS.Modificar(S1.getNom(),precio);//le puse un valor xd
            System.out.println("Servicio modificado: " + S1);
        }
        if(tipoOperacion.equalsIgnoreCase("e")){
            ServicioAdicional S1 = new ServicioAdicional(nom, precio);
            SistemaHotel.GS.eliminar(S1.getNom()); 
            System.out.println("Servicio eliminado: " + S1);
        }
        if(tipoOperacion.equalsIgnoreCase("i")){
            ServicioAdicional S1 = new ServicioAdicional(nom, precio);
            SistemaHotel.GS.Ingresar(S1);
            System.out.println("Servicio creado: " + S1);
        }
    }
}
