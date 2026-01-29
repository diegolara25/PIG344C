package com.empresa.gestion.service;
import com.empresa.gestion.model.Empleado;
import java.util.AbstractList;
import java.util.ArrayList;

public class EmpleadoService {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    //agregar
    public void agregarEmpleado(Empleado emp){
        empleados.add(emp);
        System.out.println("ok empleado agregado correctamente");

        //si deseeamos validar si el ususario existe
        /* for (Empleado e : empleados) {
        if (e.getId() == emp.getId()) {
            System.out.println("❌ Error: Ya existe un empleado con el ID: " + emp.getId());
            return; // Cortamos la ejecución para que NO llegue al .add()
        }
    } */
    }

    // Listar
    public void listarEmpleados(){
        if (empleados.isEmpty()) { //Sirve para saber si una lista está vacía. true → la lista NO tiene elementos false → la lista SÍ tiene elementos

            System.out.println("no hay empleados registrados");
            return; //este return es para romper la funcion
        }
        //de esta manera se recorre una lista en java se pone la clase(Empleado) el nombre(e) y la lista(empleados)
        //for ( Clase apodo : Colección )
        //(Clase): Es el tipo de dato que contiene la lista.
        //(apodo/variable temporal): Es el nombre que le das al empleado "actual" mientras el bucle da la vuelta.
        //empleados (Colección): Es tu ArrayList.

        //Traducción al lenguaje humano: "Por cada objeto de tipo Empleado (que llamaremos e) que se encuentre dentro de la lista empleados, haz lo siguiente..."
        for(Empleado e : empleados){
            System.out.println(e.resumen());
        }
    }

    //Eliminar  
    public void eliminarEmpleado(int id){
        for(int i=0; i < empleados.size(); i++){ //size() para calcular el tamaño de la lista
            if (empleados.get(i).getId() == id) {
                empleados.remove(i);
                System.out.println("empleado eliminado");
                return;
            }
        }
        System.out.println("empleado no encontrado");
    }

    //consultar
    public void consultarEmpleado(int id){
        for(Empleado e: empleados){
            if (e.getId()==id) {
                System.out.println(e.resumen());
                return;
            }
        }
        System.out.println("empleado no encontrado");
    }
}
