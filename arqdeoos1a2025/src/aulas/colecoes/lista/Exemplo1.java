
package aulas.colecoes.lista;

import java.util.*;


public class Exemplo1 {
    public static void main(String[] args) {
        
        
        
        List<String> lista1 = new ArrayList<>();
        lista1.add("Verde");
        lista1.add("Azul");
        lista1.add("Vermelho");
        
        System.out.println(lista1);
        
        
        Iterator iterator = lista1.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
//            iterator.remove();
        }
        
        System.out.println(lista1);
        
        System.out.println(lista1.get(1));
    
        
        lista1.add(1,"Vermelho");
        
          System.out.println(lista1);
        
        System.out.println("-----------------");
        
        String[] cores = {"branco","preto","amarelo","marrom"};
        
        List<String> lista2 = new LinkedList<>(Arrays.asList(cores));
        System.out.println(lista2);
        
        lista2.add(1,"Vermelho");
        
        System.out.println(lista2.get(3));

        System.out.println("-----------------");
        
        System.out.println(lista1);
        
        Collections.sort(lista1);
    
        System.out.println(lista1);
        
        System.out.println(Collections.binarySearch(lista1, "Verde"));
        System.out.println(Collections.binarySearch(lista1, "Rosa"));
        
        System.out.println(Collections.frequency(lista1, "Vermelho"));
        System.out.println(Collections.frequency(lista1, "Rosa"));
        
        Collections.shuffle(lista1);
        System.out.println(lista1);
        Collections.reverse(lista1);
        System.out.println(lista1);
        
        Collections.fill(lista1,null);
        System.out.println(lista1);
        
        
        System.out.println("-----------------");
        
        List<String> lista2vis = Collections.unmodifiableList(lista2);
        
        System.out.println(lista2vis.get(1));
//        lista2vis.add(1,"teste");
//        lista2vis.remove(1);

        List<String> Lista2Sinc = Collections.synchronizedList(lista2);
    }
}
