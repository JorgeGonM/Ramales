import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenandoRamales {

    public String ordenar(String[] ramales) {

        List<Ramal> lista = new ArrayList<>();

        for (String texto : ramales) {
            String[] partes = texto.split(" ");

            String propietario = partes[0];
            char lado = partes[1].charAt(0);
            int distancia = Integer.parseInt(partes[2]);

            lista.add(new Ramal(propietario, lado, distancia));
        }

        lista.sort(
            Comparator.comparingInt(Ramal::getDistancia)
                      .thenComparingInt(ramal -> ramal.getLado() == 'I' ? 0 : 1)
        );

        StringBuilder resultado = new StringBuilder();

        for (Ramal ramal : lista) {
            if (resultado.length() > 0) {
                resultado.append("\n");
            }

            resultado.append(ramal.getPropietario());
        }

        return resultado.toString();
    }

}