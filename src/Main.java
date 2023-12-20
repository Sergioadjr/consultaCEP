import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        ConsultaDeCep consultaDeCep = new ConsultaDeCep();

            System.out.println("Informe um número de CEP para consultar: ");
            var cep = leitura.nextLine();

            try {
                Endereco novoEndereco = consultaDeCep.buscaEndereco(cep);
                System.out.println(novoEndereco);
                GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
                geradorDeArquivo.GeradorDeArquivoJson(novoEndereco);
                System.out.println("CEP encontrado");
            } catch (RuntimeException | IOException e) {
                System.out.println("Ocorreu erro na busca, tente novamente");
            }

        System.out.println("Finalizando a aplicação");

    }
}
