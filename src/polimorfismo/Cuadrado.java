package polimorfismo;

public class Cuadrado extends Figura{

    private float lado; //Atributo encapsulado

    //Metodos accesores getters y setters
    public float getLado(){
        return lado;
    } 
    public void setLado(float lado){
        this.lado=lado;
    }

    //Sobreescritura metodo calcularArea()
    @Override
    public void calcularArea() {
        
        // area del cuadrado
        float area=lado*lado;
        System.out.println("El lado del cuadrado es " + lado + "y el area es " + area);
    }
    
}
