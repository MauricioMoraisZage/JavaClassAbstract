
public abstract class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }
    public String getNome() {
        return nome;
    }
    public int getVida() {
        return vida;
    }
    public void DanosPers(int dano) {
        vida -= dano;
        System.out.println(nome +" recebeu " +dano +" de dano.");
        if ( vida <= 0 ){     
            System.out.println(nome +" morreu.");     
        }
    }
    
    public abstract void UsarHabilidade(); //class que herda class Personagem pode Criar suas Proprias habilidades...   
}
