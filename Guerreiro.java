
public class Guerreiro extends Personagem {
    
    public Guerreiro ( String nome, int vida ) {
        super (nome, vida);
    }
 
    @Override
    public void UsarHabilidade() {
        System.out.println(getNome() + " Usou Raios e Truvões.");
    }
}

