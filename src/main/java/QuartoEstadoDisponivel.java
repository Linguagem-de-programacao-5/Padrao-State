public class QuartoEstadoDisponivel extends QuartoEstado{

    private QuartoEstadoDisponivel(){};
    private static QuartoEstadoDisponivel  instance = new QuartoEstadoDisponivel();
    public static QuartoEstadoDisponivel getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Disponivel";
    }

    public boolean reservar(Quarto quarto){
        quarto.setEstado(QuartoEstadoReservado.getInstance());
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
