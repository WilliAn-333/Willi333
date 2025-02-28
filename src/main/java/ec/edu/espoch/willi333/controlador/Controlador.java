package ec.edu.espoch.willi333.controlador;

import ec.edu.espoch.willi333.modelo.GestorPersona;
import ec.edu.espoch.willi333.modelo.Persona;
import ec.edu.espoch.willi333.vista.Listar;
import ec.edu.espoch.willi333.vista.Principal;

public class Controlador {
    private Principal principal;
    private GestorPersona gestorPersona;
    private Listar listar;

    public Controlador(Principal principal, Listar listar) {
        this.principal = principal;
        this.listar = listar;
        this.gestorPersona = new GestorPersona();
    }

    public void agregarPersona() {
        try {
            if (this.principal != null) {
                String nombre = this.principal.getNombre();
                String apellido = this.principal.getApellido();
                int edad = Integer.parseInt(this.principal.getEdad());
                int id = gestorPersona.listarPersona().length + 1; // Asignar un ID basado en la cantidad de personas

                Persona objPersona = new Persona(nombre, apellido, edad, id);
                String msm = gestorPersona.agregarPersona(objPersona);
                principal.error(msm);
            } else {
                principal.error("Completa los datos!");
            }
        } catch (Exception e) {
            principal.error("Error controlado: " + e.getMessage());
        }
    }

    public void listarTarea() {
        try {
            String msm = "";
            Persona[] personas = gestorPersona.listarPersona();
            if (personas.length > 0) {
                StringBuilder lista = new StringBuilder();
                for (Persona persona : personas) {
                    if (persona != null) {
                        lista.append("ID: ").append(persona.getId()).append("\n")
                             .append("Nombre: ").append(persona.getNombre()).append("\n")
                             .append("Apellido: ").append(persona.getApellido()).append("\n")
                             .append("Edad: ").append(persona.getEdad()).append("\n\n");
                    }
                }
                msm = lista.toString();
            } else {
                msm = "No hay datos que mostrar";
            }
            listar.mostrarDatos(msm);
        } catch (Exception e) {
            System.out.println("Error Controlador-listarPersona: " + e.getMessage());
        }
    }
}