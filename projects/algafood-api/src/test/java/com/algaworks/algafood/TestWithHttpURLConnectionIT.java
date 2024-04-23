package com.algaworks.algafood;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.jupiter.api.Test;

public class TestWithHttpURLConnectionIT {

	@Test
	public void deveRetornarStatus200_QuandoConsultarCozinhas() {

		try {
			HttpURLConnection.setFollowRedirects(false);
			HttpURLConnection con = null;

			URL url = new URL("http://127.0.0.1:8080/restaurantes/1");
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.connect();

			System.out.println(con.getResponseCode());

			String newLine = System.getProperty("line.separator");
			BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuilder result = new StringBuilder();
			for (String line; (line = reader.readLine()) != null;) {
				if (result.length() > 0) {
					result.append(newLine);
				}
				result.append(line);
			}

			System.out.println(result.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
