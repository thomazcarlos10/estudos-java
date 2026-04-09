import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

void main() throws IOException, InterruptedException {
    Scanner scanner = new Scanner(System.in);

    // Ex01
    System.out.print("Digite o título do livro procurado: ");
    String bookSearch = scanner.nextLine();

    String apiBookKey = "CHAVE_FICARÁ_AQUI";
    String addressBook = "https://www.googleapis.com/books/v1/volumes?q=" + bookSearch + "&key=" + apiBookKey;

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(addressBook))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    System.out.println(response.body());

    // Ex02
    System.out.print("Escolha uma criptomoeda para saber a cotação: ");
    String quotationSearch = scanner.nextLine();

    String addressQuotation = "https://api.coingecko.com/api/v3/simple/price?ids=" + quotationSearch + "&vs_currencies=usd";

    HttpClient client1 = HttpClient.newHttpClient();
    HttpRequest request1 = HttpRequest.newBuilder()
            .uri(URI.create(addressQuotation))
            .build();
    HttpResponse<String> response1 = client1
            .send(request1, HttpResponse.BodyHandlers.ofString());

    System.out.println(response1.body());

    // Ex03
    System.out.print("Digite o nome da receita procurada: ");
    String recipeSearch = scanner.nextLine();

    String addressRecipe = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + recipeSearch;

    HttpClient client2 = HttpClient.newHttpClient();
    HttpRequest request2 = HttpRequest.newBuilder()
            .uri(URI.create(addressRecipe))
            .build();
    HttpResponse<String> response2 = client2
            .send(request2, HttpResponse.BodyHandlers.ofString());

    System.out.println(response2.body());

    // Ex04
    String jsonPerson = "{\"name\":\"Rodrigo\",\"age\":20,\"city\":\"Brasília\"}";

    Gson gson = new Gson();
    Person person = gson.fromJson(jsonPerson, Person.class);
    System.out.println(person);

    // Ex05
    String jsonPerson1 = "{\"name\":\"Rodrigo\",\"city\":\"Brasília\"}";

    Gson gson1 = new GsonBuilder().setLenient().create();
    Person person1 = gson1.fromJson(jsonPerson1, Person.class);

    System.out.println("Objeto Pessoa: " + person1);

    // Ex06
    String jsonBook = "{\"title\":\"Aventuras do Java\",\"author\":\"Akemi\",\"publisher\":{\"name\":\"TechBooks\",\"city\":\"São Paulo\"}}";

    Gson gson2 = new Gson();
    Book book = gson2.fromJson(jsonBook, Book.class);
    System.out.println(book);

    // Ex07
    System.out.print("Digite o 1º número: ");
    int numerator = scanner.nextInt();
    System.out.print("Digite o 2º número: ");
    int denominator = scanner.nextInt();

    try {
        int division = numerator / denominator;
        System.out.println("Resultado da divisão: " + division);
    } catch (ArithmeticException e) {
        System.out.println("Error: not possible " + e.getMessage());
    } finally {
        System.out.println("Programa Encerrado!");
    }

    // Ex08
    System.out.print("Digite sua senha: ");
    String password = scanner.nextLine();

    try {
        validatePassword(password);
    } catch (InvalidPasswordException e) {
        System.out.println(e.getMessage());
    }

    // Ex09
    System.out.print("Digite o nome do usuario do GitHub: ");
    String username = scanner.nextLine();

    String address = "https://api.github.com/users/" + username;

    try {
        HttpClient client3 = HttpClient.newHttpClient();
        HttpRequest request3 = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .header("Accept", "application/vnd.github.v3+json")
                .build();
        HttpResponse<String> response3 = client3
                .send(request3, HttpResponse.BodyHandlers.ofString());

        if (response3.statusCode() == 404) {
            throw new GitHubQueryError("Usuario não encontrado.");
        }

        String jsonGitHub = response3.body();
        System.out.println(jsonGitHub);

        Gson gson3 = new GsonBuilder().setLenient().create();
        UserGitHub userGitHub = gson3.fromJson(jsonGitHub, UserGitHub.class);
        User user = new User(userGitHub);
        System.out.println(user);

    } catch (IOException | InterruptedException e) {
        System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
        e.printStackTrace();
    } catch (GitHubQueryError e) {
        System.out.println(e.getMessage());
    }

    scanner.close();
}

private static void validatePassword(String password) {
    if (password.length() >= 8) {
        System.out.println("Senha válida, Nova senha: " + password);
    } else {
        throw new InvalidPasswordException("Error: the password must have at least 8 characters.");
    }
}
