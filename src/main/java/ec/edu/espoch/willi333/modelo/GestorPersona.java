package ec.edu.espoch.willi333.modelo;


public class GestorPersona {
    int tamanoVector = 5;
    Persona[] personas = new Persona[tamanoVector];
    int cont = 0;

    public String agregarPersona(Persona persona) {
        String msg = "Datos Guardados";
        if (cont < tamanoVector) {
            personas[cont] = persona; // Guardar la persona directamente
            cont++;
        } else {
            msg = "Almacenamiento insuficiente";
        }
        return msg;
    }

    public Persona[] listarPersona() {
        Persona[] auxPersona = new Persona[cont]; // Solo devolver las personas que se han agregado
        for (int i = 0; i < cont; i++) {
            auxPersona[i] = personas[i]; // Copiar las personas existentes
        }
        return auxPersona;
    }
}