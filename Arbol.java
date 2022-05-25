/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;
/**
 *
 * @author Zonia Roldan
 */
public class Arbol {
    Nodo raiz;

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public Arbol() {
    }
    
    public void AñadirNodo(int dato){
        Nodo nuevo = new Nodo(dato);
        if(raiz == null){
            raiz = nuevo;
        }else{
            Nodo aux = raiz;
            Nodo padre;
            while(true){
                padre=aux;
                if(dato<aux.dato){
                    aux = aux.ramaizquierdo;
                    if(aux==null){
                        padre.ramaizquierdo=nuevo;
                        return;
                    }
                }else{
                    aux = aux.ramaderecho;
                    if(aux==null){
                        padre.ramaderecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    public boolean estaVacia(){
        return this.raiz == null;
    }
    
    public void inOrden(Nodo root){
        
        if(root!=null){
            inOrden(root.ramaizquierdo);
            System.out.print(root.dato + ", ");
            inOrden(root.ramaderecho);
        }
    }
    
    public void preOrden(Nodo root){
        
        if(root!=null){
            System.out.print(root.dato + ", ");
            preOrden(root.ramaizquierdo);
            preOrden(root.ramaderecho);
        }
    }
     public void postOrden(Nodo root){
        
        if(root!=null){
            postOrden(root.ramaizquierdo); 
            postOrden(root.ramaderecho);
            System.out.print(root.dato + ", ");
        }
     }
  public void ImprimirArbolVertical(Nodo root, int distancia, TreeMap<Integer,Vector<Integer>> map)
    {
        if(root == null)
        {
            return;
        }
        Vector<Integer> keyValue = map.get(distancia);
        if(keyValue == null)
        {
            keyValue = new Vector<>();
            keyValue.add(root.dato);
        }
        else
            keyValue.add(root.dato);
        map.put(distancia, keyValue);
        ImprimirArbolVertical(root.ramaizquierdo, distancia-1, map);
        ImprimirArbolVertical(root.ramaderecho, distancia+1, map);
    
    }
     
     
    public void printVerticalOrder(Nodo root)
    {
        TreeMap<Integer,Vector<Integer>> m = new TreeMap<>();
        int distancia =0;
        ImprimirArbolVertical(root,distancia,m);
        for (Entry<Integer, Vector<Integer>> getentry : m.entrySet())
        {
            System.out.println(getentry.getValue());
        }
       }
    }
