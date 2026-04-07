package br.com.alura.screenmatch.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    static void main() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um filme para busca: ");
        String search = scanner.nextLine();

        String address = "https://www.omdbapi.com/?t=" + search + "&apikey=80124462";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}