package polimorfismo;

public class Rectangulo extends Figura{

    private float base; //Atributo encapsulado
    private float altura; //Atributo encapsulado

    //Metodos accesores getters y setters
    public float getBase(){
        return base;
    }
    public float getAltura(){
        return altura;
    }
    public void setBase(float base){
        this.base=base;
    }
    public void setAltura(float altura){
        this.altura=altura;
    }

    //Sobreescritura metodo calcularArea()
    @Override
    public void calcularArea() {
        
        // area del cuadrado
        float area=base*altura;
        System.out.println("La base del Rectangulo es " + base + " la altura es " + altura + " y el area es " + area);
    }
    
}
