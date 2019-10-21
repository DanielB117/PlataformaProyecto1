
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.ArrayList;

public class AlumnosView {
    public void MenuAlumnos(){
        System.out.println("\tPORTAL ALUMNO");
        System.out.println("1.Lista de alumnos matriculados ");
        System.out.println("2.Matricular un nuevo alumno");
        System.out.println("3. Modificar la informacion de un alumno");
        System.out.println("4.Ver a los alumnos");
        System.out.println("5. Expulsar un alumno");
    }


    void verLista (ArrayList<Alumnos> alumnos){
        System.out.println("\t\tAlumnos:");
        System.out.println("#,\tnombre, \tcuenta,\tclase");
        int i = 1;
        for (Alumnos alumno : alumnos) {
            System.out.println("" + (i++) + "\t" + alumno);
        }
    }
    public void pedirnombre(){
        System.out.println("Ingrese el nombre del alumno");
    }
    public void pedircuenta(){
        System.out.println("Ingrese la cuenta del alumno");
    }
    public void pedirclase(){
        System.out.println("Ingrese la clase");
    }
    public void pedirposicion(){
        System.out.println("Ingrese su posicion");
    }


}

