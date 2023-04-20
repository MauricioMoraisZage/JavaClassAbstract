
public class MenuAbstract {

    public static void main(String[] args) {
        
        System.out.println(" << Classe Principal Abstract >>\n");
        System.out.println("");
        
        Soldado s = new Soldado("Capitão América", 100); 
        System.out.println("Nome do Soldado: "+s.getNome());
        System.out.println("Vida: "+s.getVida());
        s.UsarHabilidade();    //mostra a habilidade do soldado...

        System.out.println("");
        
        Guerreiro g = new Guerreiro("Thor", 100); 
        System.out.println("Nome do Guerreiro: "+g.getNome());  
        System.out.println("Vida: "+g.getVida());
        g.UsarHabilidade();    //mostra a habilidade do guerreiro...
    }  
}


