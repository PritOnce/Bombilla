public class FuncionarBombilla {
    public static void main(String[] args) {
        Bombilla bombilla1=new Bombilla(2,5,"rojo");
        Bombilla bombilla2=new Bombilla(6,12,"Verde");

        bombilla1.recargar();
        bombilla2.recargar();

        System.out.println(bombilla1);
        System.out.println(bombilla2);
    }
}
