import Animais.cachorro;

public class main {
    public static void main(String[] args) {
        
        //objeto

        cachorro cachorro1 = new cachorro("Rex", "Preta", 30, 25, 5, "nada");
        
        cachorro cachorro2 = new cachorro("Zeus", "Preta", 30, 25, 5, "nada");

        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());


        cachorro2 = cachorro1;

        System.out.println("=====================================");
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());

    }
}
