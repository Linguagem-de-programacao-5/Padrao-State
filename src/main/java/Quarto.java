public class Quarto {
    private int numeroQuarto;
    private QuartoEstado estado;

    public Quarto() {
        this.estado = QuartoEstadoDisponivel.getInstance();
    }

    public boolean disponibilizar(){
        return estado.disponibilizar(this);
    }

    public boolean reservar(){
        return estado.reservar(this);
    }

    public boolean ocupar(){
        return estado.ocupar(this);
    }

    public boolean restaurar(){
        return estado.restaurar(this);
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public QuartoEstado getEstado() {
        return estado;
    }

    public void setEstado(QuartoEstado estado) {
        this.estado = estado;
    }
}
