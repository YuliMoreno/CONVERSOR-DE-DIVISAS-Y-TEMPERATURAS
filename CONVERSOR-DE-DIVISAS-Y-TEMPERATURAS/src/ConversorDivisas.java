import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import java.io.IOException;

public class ConversorDivisas {
    private final String API_KEY = "a34b1929984844381ebafa6";
    private final String URL_BASE = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public double convertir(String monedaOrigen, String monedaDestino, double cantidad) {
        double tasaCambio;
        tasaCambio = obtenerTasaCambio(monedaOrigen, monedaDestino);
        return cantidad * tasaCambio;
    }

    private double obtenerTasaCambio(String monedaOrigen, String monedaDestino) {
        double tasaCambio = 1.0;

        try {
            OkHttpClient client = new OkHttpClient();
            String url = URL_BASE + monedaOrigen;

            Request request = new Request.Builder()
                    .url(url)
                    .build();

            try (Response response = client.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("Error de red: " + response.code() + " " + response.message());
                }

                // Procesar la respuesta JSON
                String jsonData = response.body().string();
                JSONObject jsonObject = new JSONObject(jsonData);
                JSONObject conversionRates = jsonObject.getJSONObject("conversion_rates");

                // Obtener la tasa de cambio
                tasaCambio = conversionRates.getDouble(monedaDestino);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un problema al obtener la tasa de cambio. Por favor, intenta de nuevo más tarde.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado. Por favor, intenta de nuevo más tarde.");
            e.printStackTrace();
        }

        return tasaCambio;
    }
}

