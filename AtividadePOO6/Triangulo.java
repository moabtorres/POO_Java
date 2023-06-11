package AtividadePOO6;


public class Triangulo {
 private double Areatriangulo,Base,altura;
  
    public Triangulo(){
        
    }
   
   public Triangulo (double Areatriangulo, double Base, double altura){
       this.Areatriangulo = Areatriangulo;
       this.Base = Base;
       this.altura = altura;        
   }
    
    public double getAreatriangulo() {
        return Areatriangulo;
    }
    public void setAreatriangulo(double Areatriangulo) {
        this.Areatriangulo = Areatriangulo;
    }
   
    public double getBase() {
        return Base;
    }
    public void setBase(double Base) {
        this.Base = Base;
    }
   
    public double getaltura() {
        return altura;
    }
    public void setaltura(double altura) {
        this.altura = altura;
    }

   public double calculartriangulo(double Base, double altura){ 
    Areatriangulo = (Base * altura) / 2;
    return Areatriangulo;  
   }        
    
    

}
