public class Reto3 {
    
    private int TipoDoc;
    private int documento; 
    private int nombre; 
    private int apellido; 
    private String Cargo; 
    private String Horastrabajadas;
    private String Valorhora;
    private int Totalpagar; 
    
    public Reto3(){

    }
    public Reto3(int TipoDoc, int documento, int nombre, int apellido, String Cargo, String Horastrabajadas, String Valorhora, int Totalpagar){
        this.TipoDoc=TipoDoc;
        this.documento=documento;
        this.nombre=nombre; 
        this.apellido=apellido; 
        this.Cargo=Cargo;
        this.Horastrabajadas=Horastrabajadas;
        this.Valorhora=Valorhora;
        this.Totalpagar=Totalpagar;
    }
    public Reto3(int TipoDoc){
        System.out.println("El tipo de documento es"+TipoDoc+"numero de documento:"+documento+"Nombre:"+nombre+"Apellido:"+apellido+"Cargo:"+Cargo+"Horas de trabajo"+Horastrabajadas+"valor de hora"+Valorhora+"El total es"+Totalpagar);
    }
}
