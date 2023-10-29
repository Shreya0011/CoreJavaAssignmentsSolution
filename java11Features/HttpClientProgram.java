package java11Features;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientProgram {

	public static void main(String[] args) {
		
		String uri = "https://httpbin.org/get";
		
		HttpRequest req = HttpRequest.newBuilder()
						.GET()
						.uri(URI.create(uri))
						.build();
		
		HttpClient cl = HttpClient.newBuilder().build();
		
		try {
			HttpResponse<String> response = cl.send(req, BodyHandlers.ofString());
			System.out.println(response.headers());
			System.out.println(response.statusCode());
			System.out.println(response.body());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
