package curso_04.capitulo_04;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Titulo avatar = new Titulo("Avatar", 2009, 178);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(avatar);

        System.out.println(json);

        Veiculo carro = new Veiculo("Toyota", "Corolla", 2024, 148990);

        String jsonCarro = gson.toJson(carro);

        System.out.println();

        System.out.println("Classe Veículo serializada para JSON:");
        System.out.println(jsonCarro);
    }
}
