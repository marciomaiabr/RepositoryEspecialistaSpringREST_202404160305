package com.algaworks.algafood;

import java.io.InputStream;
import java.net.URL;

import org.junit.jupiter.api.Test;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

public class TestWithUrlAndJsonReaderIT {

	@Test
	public void deveRetornarStatus200_QuandoConsultarCozinhas() {

		try {

			URL url = new URL("http://127.0.0.1:8080/restaurantes/1");
			InputStream is = url.openStream();
			JsonReader rdr = Json.createReader(is);

			JsonObject jsonObject = rdr.readObject();
			System.out.println("[jsonObject=" + jsonObject + "]");
			System.out.println("[jsonObject.getString=" + jsonObject.getString("nome") + "]");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

}
