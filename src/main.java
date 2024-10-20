import Animais.cachorro;
public class main {
    public static void main(String[] args) {

        //objeto

        cachorro cachorro1 = new cachorro("Rex", "Preta", 30, 25, 5, "nada");

        System.out.println(cachorro1.getNumeroDeCachorros());

        cachorro cachorro2 = new cachorro("Zeus", "Preta", 30, 25, 5, "nada");

        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());
    }
}
