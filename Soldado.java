
public class Soldado extends Personagem {
    
    public Soldado ( String nome, int vida ) {
        super (nome, vida);
    }
    
    @Override
    public void UsarHabilidade() {
        System.out.println(getNome() + " Usou o Escudo e Puxou o gatilho.");
    }
}

