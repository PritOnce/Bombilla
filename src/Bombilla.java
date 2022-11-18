public class Bombilla {
    private boolean estado=false;
    private String color;
    private int vatios;
    private float horas;

//creamos el constructor
public Bombilla(){

}
//constructor objeto
public Bombilla(Bombilla b){
    this.estado=b.estado;
    this.color=b.color;
    this.vatios=b.vatios;
    this.horas=b.horas;

}
public Bombilla(String color,int vatios){
    this.color=color;
    this.vatios=vatios;
    this.horas=10;
}
    public Bombilla(float horas,int vatios,String color){
        this.vatios=vatios;
        this.color=color;
        if (horas>0 && horas<=10){
            this.estado=true;
        }
        else{
            this.estado=false;
        }
    }
    //metodos y funciones
    public String getColor(){return color;}
    public void setColor(String color){this.color=color;}
    public int getVatios (){return vatios;}
    public void setVatios(int vatios){this.vatios=vatios;}
    public float getHoras(){return horas;}
    public void setHoras(float horas) {this.horas = horas;}
public void recargar(int horas){
    if(this.horas<10){
        this.horas+=horas;
    }
    else{
        this.horas=horas;
    }
}
@Override
public String toString(){return "La bombilla esta," +estado+ " la potencia de la bombilla es, " +vatios+ " con el color, " +color+ " y una duración de " +horas;}

}
