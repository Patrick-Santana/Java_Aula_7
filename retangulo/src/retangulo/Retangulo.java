/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo;

/**
 *
 * @author alunoifpe
 */
public class Retangulo {
    
    private double area;
    private double largura;
    private double altura;
    private String cor;
    
    
    public Retangulo(double largura, double altura, String cor){
        this.setLargura(largura);
        this.setAltura(altura);
        this.setCor(cor);
    }
    
    public double getArea(){
        return this.area;
    }
    
    private void setArea(double area){
        this.area = area;
    }
    
    
    public double getLargura(){
        return this.largura;
    }
    
    private void setLargura(double largura){
        this.largura = largura;
    }
    
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    /**
     *
     * @param altura
     * @param largura
     */
    public void calcular(double altura, double largura){
        this.area = (this.altura * this.largura);
    }
    
    /**
     *
     * @param altura
     * @param largura
     * @throws retangulo.AlturaInvalidaException
     * @throws AlturaInvalidoException
     * @throws LarguraInvalidoException
     * @throws AreaInvalidoException
     */
    
    
    
    public void comparar(double altura, double largura) throws 
            AlturaInvalidaException, LarguraInvalidaException{
        if(altura <= 0){
             throw new AlturaInvalidaException();
        }
        
        if(largura <= 0){
            throw new LarguraInvalidaException();
        }
        
        this.area = (this.largura) * (this.altura);    
    }
    
    public void cam(Retangulo ret) {
 
        if (ret == null){
            return ;
        }
   
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Retangulo r = new Retangulo(1110 , 100 , "red");
        
        try{
            r.calcular(10,20);
            
            r.comparar(-10, 4);
        } catch (AlturaInvalidaException ex){
            System.out.println("valor de altura invalido");
        } catch (LarguraInvalidaException ex){
            System.out.println("valor de largura invalido");
        } finally{
            System.out.println("Bloco de comando encerrado");
        }
        
        System.out.println("Depois do try-catch");
        
        
    }
    
}
