package polimorfismo;

public class Circulo extends Figura{

    private float radio; //Atributo encapsulado
    private double pi = 3.1416; //Atributo encapsulado
    
    

    //Metodos accesores getters y setters
    public float getRadio(){
        return radio;
    }
   
    public void setRadio(float radio){
        this.radio=radio;
    }
    

    //Sobreescritura metodo calcularArea()
    @Override
    public void calcularArea() {
        
        // area del cuadrado
        double area= pi * (radio * radio);
        System.out.println("El radio del triangulo es " + radio + " y el area es " + area);
    }
    
}
