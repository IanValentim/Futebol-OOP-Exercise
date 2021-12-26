package exercício;

public class Principal {

    public static void main(String[] args) {
        
    Jogador l[] = new Jogador[3];

    l[0] = new Jogador("Neymar", "Atacante", "Brasileiro", 1992, 1.75f, 68);
    l[1] = new Jogador("Cristiano", "Atacante", "Português", 1985, 1.85f, 84);
    l[2] = new Jogador("Messi", "Atacante", "Argentino", 1987, 1.69f, 67);
     
    l[0].status();
    l[1].status();
    l[2].status();
     
    }
    
}
