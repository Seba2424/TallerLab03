import java.util.Scanner;

public class Launcher {
    public Empresa empresa=new Empresa();
    public Camion camion=new Camion();
    public Sucursal sucursal=new Sucursal();
    public static void main(String[] args) {

    }
    public void mostrarMenu(){
        System.out.println("--------------------------------------------");
        System.out.println("              Menu              ");
        System.out.println("[1] agregar producto");
        System.out.println("[2] quitar producto");
        System.out.println("[3] cambiar estado de camion");
        System.out.println("[4] agregar camion a sucursal...");
        System.out.println("[5] quitar camion a sucursal...");
        System.out.println("[6] calcular valor de flete de camion...");
        System.out.println("[7] salir");
        System.out.println("                                ");
        System.out.println("-------------------------------------------");
        elegirOpcion(pedirNumero());
    }
    public void elegirOpcion(int opcion){
        while(opcion !=7){
            switch (opcion){
                case 1
            }
        }
    }

    public int pedirNumero() {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            try {
                numero = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Indique un número válido");
                teclado.nextLine();
            }
        } while (true);
        return numero;

    }

}
