package Animais;

public class gato{

    //atributos

    static int numeroDeGatos;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;

    //construtor

    public gato(String nome, String cor, int altura, double peso, String estadoDeEspirito){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeGatos ++;
    }

    void comer(){}

    void dormir(){}

    void soar(){
        System.out.println("MIAU MIAU");
    }

    @Override
    public String toString(){
        return "Gato{" + 
                "nome='" + nome + '\'' + 
                '}';
    }

}
