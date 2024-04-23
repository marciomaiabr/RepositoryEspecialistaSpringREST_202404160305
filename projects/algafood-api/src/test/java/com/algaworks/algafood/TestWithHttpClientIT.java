package com.algaworks.algafood;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import org.junit.jupiter.api.Test;

public class TestWithHttpClientIT {

	@Test
	public void deveRetornarStatus200_QuandoConsultarCozinhas() {

		try {
			var url = "http://127.0.0.1:8080/restaurantes/100";
			HttpRequest request = HttpRequest.newBuilder().uri(new URI(url)).header("Content-Type", "application/json")
					.timeout(Duration.ofMinutes(3)).GET().build();

			HttpClient httpClient = HttpClient.newHttpClient();
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.statusCode());
			System.out.println(response.body());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
