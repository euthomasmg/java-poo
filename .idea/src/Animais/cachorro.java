package Animais;

public class cachorro {

    //variavel estatica

    static int numeroDeCachorros;

    //atributos

    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadosDeEspirito;

    

    //construtor padrão

    public cachorro(){}

    //construtor adicionador
    
    public cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadosDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this. tamanhoDoRabo = tamanhoDoRabo;
        this.estadosDeEspirito = estadosDeEspirito;

        numeroDeCachorros++;
    }

    //getters e setters

    public static int getNumeroDeCachorros(){
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros){
        
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadosDeEspirito() {
        return estadosDeEspirito;
    }

    public void setEstadosDeEspirito(String estadosDeEspirito) {
        this.estadosDeEspirito = estadosDeEspirito;
    }

    //métodos

    public void comer() {}

    public void latir() {
        System.out.println("AU AU");
    }
    
    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao)
    {
        switch (acao) {
            
            case "carinho": this.estadosDeEspirito = "Feliz";
            break;
            
            case "vai dormir": this.estadosDeEspirito = "Bravo";
            break;

            case "pisar na patinha": this.estadosDeEspirito = "Triste";
            break;
            
            default: this.estadosDeEspirito = "Neutro";
        }

        return this.estadosDeEspirito;
    }

    @Override
    public String toString(){
        return "Cachorro{" + 
                "nome='" + nome + '\'' + 
                '}';
    }
        
    
}
