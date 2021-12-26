package exercício;

public class Jogador {
    
    
    private String nome, posição, nacionalidade;
    private int nascimento, peso, idade, aposentadoria;
    private float altura;

    public Jogador(String nome, String posição, String nacionalidade, int nascimento, float altura, int peso) {
        
        this.nome = nome;
        this.posição = posição;
        this.nacionalidade = nacionalidade;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
        
    }
    
    public void status(){
        
        calcularAposentadoria();
        
        System.out.println("\n----------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println(this.getPosição());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Anos até a aposentadoria: " + this.getAposentadoria());
        System.out.println("----------------\n");
        
    }
    
    public void calcularIdade(){
        this.setIdade(2021 - this.nascimento);
    }
    
    public int calcularAposentadoria(){
        
        if("Defesa".equals(getPosição())){ 
            
          this.setAposentadoria(40 - this.getIdade());
        
        }
        
        if("Meio-campo".equals(getPosição())){
            
            this.setAposentadoria(38 - this.getIdade());
            
        }                  
       
        if("Atacante".equals(getPosição())){
          
            this.setAposentadoria(35 - this.getIdade());
               
         }
        
        return 0;
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosição() {
        return posição;
    }

    public void setPosição(String posição) {
        this.posição = posição;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        calcularIdade();
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAposentadoria() {
        return aposentadoria;
    }

    public void setAposentadoria(int aposentadoria) {
        this.aposentadoria = aposentadoria;
    }
    
}
