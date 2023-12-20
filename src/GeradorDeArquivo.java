import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void GeradorDeArquivoJson(Endereco endereço) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter arquivo = new FileWriter(endereço.cep()+ ".json");
        arquivo.write(gson.toJson(endereço));
        arquivo.close();
    }
}
