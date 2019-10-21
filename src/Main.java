import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int opcion = 0;
        do {
            MenuPrincipal mp = new MenuPrincipal();
            mp.MenuPrincipal();
            System.out.println();
            mp.ObtenerRedultadoP(mp.Leeropcion());
        } while (opcion != 4);
    }
}
