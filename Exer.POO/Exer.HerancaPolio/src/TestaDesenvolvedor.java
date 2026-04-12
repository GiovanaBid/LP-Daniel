import java.util.ArrayList;

public class TestaDesenvolvedor {
    public static void exibeDados(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao.toString() + " Bônus " + camaleao.calculaBonus());
    }
    public static void main(String[] args){
        Junior jr = new Junior("Beltrano", "Fulano", "Java", 4000);
        exibeDados(jr);
        Pleno pl = new Pleno("Beltrano", "Java", 6000, 8);
        exibeDados(pl);
        Senior sr = new Senior("Ciclano", "Java", 9000, 30000);
        exibeDados(sr);


        // vetor de desenvolvedores
        ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<Desenvolvedor>();
        // adiciona os desenvolvedores no vetor
        desenvolvedores.add(jr);
        desenvolvedores.add(pl);
        desenvolvedores.add(sr);


    }
}