import java.util.ArrayList;
import java.util.List;

public class InefficientCodeExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Populando a lista com números (potencial problema de complexidade)
        for (int i = 0; i < 100000; i++) {
            numbers.add(i);
        }

        // Concatenando strings ineficientemente - mudando comentário para gerar nova versão
        String result = "";
        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i) + ", ";
        }
        System.out.println("Result: " + result);

        // Operação de busca ineficiente em uma lista - gerar pull request
        if (numbers.contains(99999)) {
            System.out.println("Found the number!");
        }

        // Repetindo uma operação custosa dentro de um loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Processing number: " + numbers.size());
        }

        // Fechamento de recurso ausente (simulando um recurso que deve ser fechado)
        try {
            CustomResource resource = new CustomResource();
            resource.use();
        } catch (Exception e) {
            System.err.println("Error using resource: " + e.getMessage());
        }
    }
}

class CustomResource {
    public void use() throws Exception {
        System.out.println("Using resource...");
        // Simulando uma operação
    }
}
