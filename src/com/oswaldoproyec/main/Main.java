package com.oswaldoproyec.main;

import com.oswaldoproyec.model.Contacto;
import com.oswaldoproyec.service.AgendaServicio;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        AgendaServicio miAgenda = new AgendaServicio();

        int opcion = 0;

        do {
            System.out.println("\n=== AGENDA DE CONTACTOS ===");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto por ID");
            System.out.println("3. Actualizar contacto por ID");
            System.out.println("4. Eliminar contacto por ID");
            System.out.println("5. Mostrar todos los contactos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("///CREAR CONTACTO///");

                    System.out.println("Por favor ingrese el Id del contacto");
                    int id = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Por favor ingrese el nombre del contacto");
                    String nombre = teclado.nextLine();

                    System.out.println("Por favor ingrese el telefono del contacto");
                    String telefono = teclado.nextLine();

                    System.out.println("Por favor ingrese el correo electronico");
                    String correoElectronico = teclado.nextLine();

                    Contacto nuevoContacto = new Contacto(id, nombre, telefono, correoElectronico);

                    miAgenda.crearContacto(nuevoContacto);
                    System.out.println("Contacto guardado con exito");

                    break;

                case 2:
                    System.out.println("\n--- BUSCAR CONTACTO POR ID ---");

                    System.out.print("Ingrese el ID del contacto a buscar: ");
                    int idBuscar = teclado.nextInt();
                    teclado.nextLine(); // Limpieza indispensable del buffer

                    Contacto contactoEncontrado = miAgenda.obtenerContactoForEach(idBuscar);

                    if (contactoEncontrado != null) {
                        System.out.println("¡Contacto encontrado!");
                        System.out.println(contactoEncontrado);
                    } else {
                        System.out.println("No se encontró ningún contacto con el ID: " + idBuscar);
                    }
                    break;

                case 3:
                    System.out.println("\n--- ACTUALIZAR CONTACTO POR ID ---");

                    System.out.println("Por favor ingrese el id del contacto que desea actualizar ");
                    int idContactoActualizar;
                    idContactoActualizar = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Por favor ingrese el nombre de la persona que desea actualizar ");
                    String nombreActualizar;
                    nombreActualizar = teclado.nextLine();

                    System.out.println("Por favor ingrese el telefono de la persona que desea actualizar");
                    String nuevoTelefono = teclado.nextLine();

                    System.out.println(("Por favor ingrese el correo que desea actualizar"));
                    String correoActualizar;
                    correoActualizar = teclado.nextLine();

                    boolean Actualizado = miAgenda.actualizarContactoId(idContactoActualizar ,nombreActualizar, nuevoTelefono, correoActualizar);

                    if (Actualizado) {
                        System.out.println("El contacto fue actualizado de forma correcta");
                    } else {
                        System.out.println("No se encontro ningun contacto");
                    }

                    break;

                case 4:
                    System.out.println("\n--- ELIMINAR CONTACTO POR ID ---");

                    System.out.println("Por favor ingrese el id del contacto que desea borrar");
                    int idBorrar;
                    idBorrar = teclado.nextInt();
                    teclado.nextLine();

                    Boolean Eliminar = miAgenda.eliminarContactoId(idBorrar);

                    if (Eliminar) {
                        System.out.println("El contacto ha sido eliminado con exito");
                    } else {
                        System.out.println("No se elimino el contacto");
                    }

                    break;

                case 5:
                    System.out.println("///OBTENER LISTA DE CONTACTOS///");

                    List<Contacto> lista = miAgenda.ObtenerContacto();
                    if (lista.isEmpty()) {
                        System.out.println("La agenda no tiene contactos registrados.");
                    } else {
                        System.out.println("Los contactos de la agenda son:");
                        for (Contacto c : lista) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Gracia por usar la agenda de contactos");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 6);

        teclado.close();
    }
}