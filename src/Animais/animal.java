package Animais;

public class animal {

    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadosDeEspirito;

    protected void comer(){}

    protected void dormir(){}

    public animal(String nome, String cor, double peso){

        this.nome = nome;
        this.cor = cor;
        this.peso = peso;

    }

    protected void soar(){
        System.out.println("cri cri");
    }

}
