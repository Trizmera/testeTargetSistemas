package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.*;

public class questaoTres {
    public static void main(String[] args) throws IOException {
        String json = new String(Files.readAllBytes(Paths.get("C:\\Users\\mlleb\\Desktop\\testeTargetSistema\\src\\main\\java\\org\\example\\faturamento.json")));
        JSONArray faturamentoArray = new JSONArray(json);

        double total = 0;
        for (int i = 0; i < faturamentoArray.length(); i++) {
            JSONObject obj = faturamentoArray.getJSONObject(i);
            total += obj.getDouble("valor");
        }


        for (int i = 0; i < faturamentoArray.length(); i++) {
            JSONObject obj = faturamentoArray.getJSONObject(i);
            String estado = obj.getString("estado");
            double valor = obj.getDouble("valor");
            double percentual = (valor / total) * 100;
            System.out.println("Percentual de " + estado + ": " + String.format("%.2f", percentual) + "%");
        }
    }
}
