
public class MenuPrincipal {
    int opcion;
    LectorDeTeclado LDT = new LectorDeTeclado();
    public void MenuPrincipal(){ System.out.println("\tUNIVERSIDAD JOSE CECILIO DEL VALLE");
        System.out.println("PORTALES");
        System.out.println("\n 1.Portal Alumno");
        System.out.println("\n 2.Portal Maestro");
        System.out.println("\n 3.Portal de las Clase");
        System.out.println("\n  4.Finalizar programa");
    }
    public int Leeropcion() {
        opcion = LDT.getInteger("Ingrese una opción", "Ha cometido un error, Intente de nuevo");
        return opcion;
    }
    public int ObtenerRedultadoP(int opcion) {
        switch (opcion) {
            case 1: {
                AlumnosView av = new AlumnosView();
                AlumnosController ac = new AlumnosController();
                av.MenuAlumnos();
                System.out.println();
                ac.ObtenerResultado(ac.Leeropcion());
            }
            break;
            case 2: {
                MaestrosView mv = new MaestrosView();
                MaestrosController mc = new MaestrosController();
                mv.MenuMaestros();
                System.out.println();
                mc.ObtenerResultado(mc.Leeropcion());
            }
            break;
            case 3: {
                ClaseView cv = new ClaseView();
                ClaseController cc = new ClaseController();
                cv.MenuClase();
                System.out.println();
                cc.ObtenerResultado(cc.Leeropcion());
            }
            break;
        }
        return opcion;
    }

}

