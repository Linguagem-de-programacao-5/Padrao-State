public class QuartoEstadoReservado extends QuartoEstado{

    private QuartoEstadoReservado(){};
    private static QuartoEstadoReservado  instance = new QuartoEstadoReservado();
    public static QuartoEstadoReservado getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Reservado";
    }

    public boolean disponibilizar(Quarto quarto){
        quarto.setEstado(QuartoEstadoDisponivel.getInstance());
        return true;
    }

    public boolean ocupar(Quarto quarto){
        quarto.setEstado(QuartoEstadoOcupado.getInstance());
        return true;
    }

    public boolean restaurar(Quarto quarto){
        quarto.setEstado(QuartoEstadoEmManutencao.getInstance());
        return true;
    }
}
