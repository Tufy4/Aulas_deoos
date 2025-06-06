
package aulas.classe.especial.enumerador;


public class ExemploB {
    public static void main(String[] args) {
        System.out.println(Cor.AZUL);
        System.out.println(Cor.AZUL.ordinal());
        System.out.println(Cor.values()[2]);
        
        System.out.println("-----------------------------------");
        for(Cor  c:Cor.values() ){
            System.out.println(c);
        }
        
        System.out.println("-----------------------------------");
        
        FormaGeometricaB quadrado = new FormaGeometricaB(Cor.PRETO, Cor.VERDE);
    
        System.out.println(quadrado.getCorBorda());
    
    }
    
}
