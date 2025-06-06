
package aulas.classe.especial.enumerador;


public class ExemploA {
    public static void main(String[] args) {
        System.out.println(FormaGeometricaA.Cor.AZUL);
        System.out.println(FormaGeometricaA.Cor.AZUL.ordinal());
        System.out.println(FormaGeometricaA.Cor.values()[2]);
        
        System.out.println("-----------------------------------");
        for(FormaGeometricaA.Cor  c:FormaGeometricaA.Cor.values() ){
            System.out.println(c);
        }
        
        System.out.println("-----------------------------------");
        
        FormaGeometricaA quadrado = new FormaGeometricaA(FormaGeometricaA.Cor.PRETO, FormaGeometricaA.Cor.VERDE);
    
        System.out.println(quadrado.getCorBorda());
    
    }
    
}
