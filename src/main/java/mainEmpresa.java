import java.util.List;
import  java.util.ArrayList;
import  java.util.Scanner;


public class mainEmpresa  {
    public static void main(String[] args) {
        List<empresa> informacionEmpresa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int datos;


        do{
            System.out.println("1.Nombre de la empresa");

            System.out.println("2. Modificar datos de la empresa");

            System.out.println("3. mostrar informacion de la empresa");


            datos = scanner.nextInt();
            scanner.nextLine();
            switch (datos){
                case 1 :
                    System.out.println("ingresa el nombre  de la empresa: ");
                    String nombre = scanner.nextLine();
                    System.out.println("ingresa el telefono de la empresa: ");
                    int telefono = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("ingrese la direccion de la empresa");
                    String direccion = scanner.nextLine();
                    System.out.println("ingrese el Nit de la empresa");
                    int nit = scanner.nextInt();


                    empresa empresa = new empresa(nombre,telefono,direccion,nit);
                    informacionEmpresa.add(empresa);


                    break;


                case 2:
                    System.out.println("Ingrese nombre de la empresa a modificar: ");
                    String cambiarNombre = scanner.nextLine();
                    boolean encontrado = false;

                    for(int i = 0; i< informacionEmpresa.size(); i++){
                        empresa e = informacionEmpresa.get(i);

                        if(e.getNombre().equals(cambiarNombre)){
                            System.out.println("Ingrese nuevo nombre de la empresa");
                            String nuevoNombre = scanner.nextLine();
                            scanner.nextLine();
                            e.setNombre(nuevoNombre);
                            System.out.println("Ingrese nuevo telefono: ");
                            int nuevaTelefono = scanner.nextInt();
                            scanner.nextLine();
                            e.setTelefono(nuevaTelefono);
                            System.out.println("Ingrese nueva direccion");
                            String nuevaDireccion = scanner.nextLine();
                            e.setDireccion(nuevaDireccion);
                            System.out.println("Ingrese nuevo Nit");
                            int nuevoNit = scanner.nextInt();
                            e.setNit(nuevoNit);
                            System.out.println("Datos actualizados");

                            encontrado = true;

                            break;


                        }

                    }
                    if (encontrado){

                    }else {
                        System.out.println("El nombre de la empresa no fue encontrado");
                    }





                    break;

                case 3:
                    System.out.println("datos de empresa");
                    for (empresa e : informacionEmpresa){
                        e.imprimirDatos();
                    }
                    break;



            }


        }while(datos !=4);
    }
}
