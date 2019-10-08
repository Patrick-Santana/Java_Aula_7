package esfera;

/**
 *
 * @author AlunoIFPE
 */
public class Esfera implements Objetos3D {
    
    private double numeropi;
    private double raio;
    
    
    public Esfera (double numeropi, double raio){
        this.setNumeropi(numeropi);
        this.setRaio(raio);
    }

    
    public double getNumeropi(){
        return this.numeropi;
    }
    
    public void setNumeropi(double Numeropi){
        this.numeropi = numeropi;
    }
    
    public double getRaio(){
        return this.raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    /**
     *
     * @return
     */
    public double volume(){
        return 1.4 * this.getNumeropi() * this.getRaio();
    }

    public double areabase(){
        return this.getNumeropi() * this.getRaio(); 
    }
}
