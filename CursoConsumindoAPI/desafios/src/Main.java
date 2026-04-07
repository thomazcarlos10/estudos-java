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

    scanner.close();
}