
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    static Scanner sc = new Scanner(System.in);
    static Arbol arbol = new Arbol();
    public static void Main(String[] args) {
        menu();
    }
    
    public static void menu(){
        int eleccion;
        boolean salir = false;
        while(salir != true){
            System.out.println("\nElegir lo que desea hacer:"
                    + "\n1. Añadir nuevo nodo"
                    + "\n2. Mostrar si este se encuentra vacío"
                    + "\n3. Ordenar en orden"
                    + "\n4. Ordenar en pre orden"
                    + "\n5. Ordenar en post orden"
                    + "\n6. Imprimir en orden vertical"
                    + "\n7. Salir");
            eleccion = sc.nextInt();
        
        switch(eleccion){
            case 1: System.out.println("Ingrese digito que se desea añadir");
                    int dato = sc.nextInt();
                    arbol.AñadirNodo(dato);
            break;
            case 2: if(arbol.estaVacia()){
                System.out.println("El árbol se encuentra vacía");
                }
            break;
            case 3: if(!arbol.estaVacia()){
                arbol.inOrden(arbol.raiz);
            }else{
                System.out.println("El árbol se encuentra vacío");
            }
            break;
            case 4: if(!arbol.estaVacia()){
                arbol.preOrden(arbol.raiz);
            }else{
                System.out.println("El árbol se encuentra vacío");
            }
            break;
            case 5: if(!arbol.estaVacia()){
                arbol.postOrden(arbol.raiz);
            }else{
                System.out.println("El árbol se encuentra vacío");
            }
            break;
            //es este
            case 6: if(!arbol.estaVacia()){
                arbol.printVerticalOrder(arbol.raiz);
            }else{
                System.out.println("El árbol se encuentra vacío");
            }
            break;
            case 7: salir = true;
            break;
        }
        }
    }
}
