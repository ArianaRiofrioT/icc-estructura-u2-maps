import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        runEmpleadoExample();

    }

    private static void runLinkedHashMapa() {
        new Mapa().LinkedHashMapa();
    }

    private static void runTreeMapa() {
        new Mapa().TreeMapa();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller emCtrl = new EmpleadoContoller();
        boolean result = emCtrl.addEmpleado(new Empleado(1, "Pablo", "Profesor"));
        System.out.println("\nIngreso " + result );
        result = emCtrl.addEmpleado(new Empleado(2, "Ariana", "Estudiante"));
        System.out.println("Ingreso " + result );
        
        Empleado empleado = emCtrl.getEmpleadoById(1);
        System.out.println("Empleado encontrado: " + empleado);
        
        System.out.println("Lista de empleados:");
        emCtrl.displayEmpleados();

        System.out.println("Lista de empleados solo por nombres:");
        emCtrl.displayEmpleadosSoloNombres();

        System.out.println("Lista de llaves de empleados:");
        emCtrl.displayLlaves();

        System.out.println("Lista de empleados (valores):");
        emCtrl.displayValues();

    }

    private static void runMapExamlpe() {
        new Mapa();
    }

    private static void runEjerccios() {
    }
}