public class Ramal {

    private String propietario;
    private char lado;
    private int distancia;

    public Ramal(String propietario, char lado, int distancia) {
        this.propietario = propietario;
        this.lado = lado;
        this.distancia = distancia;
    }

    public String getPropietario() {
        return propietario;
    }

    public char getLado() {
        return lado;
    }

    public int getDistancia() {
        return distancia;
    }
}