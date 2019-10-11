package esfera;

/**
 *
 * @author AlunoIFPE
 */
public class TesteCirculo {
    public static void main (String[] args) {
        Objetos3D c = new Esfera(0.0 , 0.0);
        
        System.out.println("Volume:" + c.volume());
        System.out.println("areabase:" + c.areabase());
        
        c= new cilindro(3, 4);
        
        System.out.println("Volume:" + c.volume());
        System.out.println("areabase:" + c.areabase());

    }
    
}
