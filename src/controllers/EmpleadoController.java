package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoController {

    //declara la variable fuera del constructor
    private Map<Integer, Empleado> empleados;

    //constructor
    public EmpleadoController() {
        //Inicializa el mapa en el constructor
        empleados = new HashMap<>();
    }

    /**
     * Método para agregar un empleado.
     * @param empleado El empleado a ingresar.
     * @return TRUE si el empleado se agregó correctamente, FALSE si ya existe.
     */
    public boolean addEmpleado(Empleado empleado) {
        if (empleados.containsKey(empleado.getId())) {
            return false; // No se agrega si ya existe
        }
        empleados.put(empleado.getId(), empleado);
        return true;
    }

    /**
     * Método para obtener un empleado por su ID.
     * @param id El ID del empleado.
     * @return El empleado si existe, null si no se encuentra.
     */
    public Empleado getEmpleadoById(int id) {
        return empleados.get(id); 
    }

    /**
     * Método para mostrar todos los empleados.
     */
    public void displayEmpleados() {
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()) {
            System.out.println(empleadoEntry.getKey() + " - " + empleadoEntry.getValue());
        }
    }
}
