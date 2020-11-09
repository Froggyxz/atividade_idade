//professor, meu intellij não roda nenhum dos meus projetos, e não consigo ver meu programa funcionando
import java.util.Scanner;
public class teste {
    public static void Main(String[]args){
        int idade;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();
        if (idade<18){
            System.out.println("Você não é maior de idade");
        }else {
            System.out.println("Você é maior de idade");
        }
    }

}
