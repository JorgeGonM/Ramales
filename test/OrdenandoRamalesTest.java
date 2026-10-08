import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrdenandoRamalesTest {

    //Test para ordenar los ramales por distancia
    @Test
    void ordenarLosRamalesPorDistancia() {

        OrdenandoRamales ordenando = new OrdenandoRamales();

        String resultado = ordenando.ordenar(new String[]{"EdwardPease D 250", "GeorgeStephenson I 500", "GeorgeDixon I 250"});

        assertEquals("GeorgeDixon\n" + "EdwardPease\n" + "GeorgeStephenson", resultado);
    }

    //Test para ordenar los ramales por distancia diferentes
    @Test
    void ordenarRamalesQueEstanEnDistanciasDiferentes() {

        OrdenandoRamales ordenando = new OrdenandoRamales();

        String resultado = ordenando.ordenar(new String[]{"Pepe D 900", "Juan I 100", "Ana D 500"});

        assertEquals(
                "Juan\n" +
                "Ana\n" +
                "Pepe",
                resultado
        );
    }

    //Test para ordenar los ramales por distancia iguales pero con lados diferentes
    @Test
    void ordenarRamalesLadosDiferentes() {

        OrdenandoRamales ordenando = new OrdenandoRamales();

        String resultado = ordenando.ordenar(
                new String[]{"EdwardPease D 250", "GeorgeDixon I 250"});

        assertEquals(
                "GeorgeDixon\n" +
                "EdwardPease",
                resultado
        );
    }

    
}