public class Bombilla {
    private boolean estado;
    private int vatios;
    private String color;
    private float horas;

//creamos el constructor
public Bombilla(){

}
//constructor objeto
public Bombilla(Bombilla b){
    this.estado=b.estado;
    this.vatios=b.vatios;
    this.color=b.color;
    this.horas=b.horas;

}
public Bombilla(int vatios ,String color){
    this.estado=false;
    this.vatios=vatios;
    this.color=color;
    this.horas=10;
}
public Bombilla(float horas){

    if (horas>0 && horas<=10){
        this.estado=true;
    }
    else{
        this.estado=false;
    }
}
public void recargar(int horas){
    if(){

    }
}
}
