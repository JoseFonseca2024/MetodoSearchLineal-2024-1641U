import java.util.Scanner;

public class App {

    public static int cantidadproducto = 0;
    public static Scanner leer = new Scanner (System.in);

    public static void main(String[] args) throws Exception {
        boolean condicionsalida = true;

        do {

            try {
                System.out.println("Bienvenido al registro de productos");
                System.out.println("Ingrese la cantidad de productos que va a ingresar");
                cantidadproducto =leer.nextInt();
                leer.nextLine();
                if (cantidadproducto > 0) {
                    condicionsalida = false;
                }
            } catch (Exception e) {
                System.out.println(e);
            System.out.println("Algo ocurrio, revisar por favor");
            leer.nextLine();
            }
            
        } while (condicionsalida);

        String arreglo [] = llenado();

        System.out.println("Los productos estan registrados");
        System.out.println("¿De que producto desea conocer su posición?");
        String target = leer.nextLine();

        int result = linearSearch(arreglo, target);

        if (result != -1) {
            System.out.println("Elemento encontrado en la posición: " + result);
        } else {
            System.out.println("Elemento no encontrado en el array.");
        }
        
    }

    public static String[] llenado() {
        String[] arreglo = new String[cantidadproducto];
        try {
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("Ingrese el producto por favor");
                arreglo[i] = leer.nextLine(); 
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Algo ocurrió, revisar por favor");
            leer.nextLine();
        }
        return arreglo;
    }

    public static int linearSearch(String[] arreglo, String target) {

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }


}    
