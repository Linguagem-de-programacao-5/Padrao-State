public class QuartoEstadoOcupado extends QuartoEstado{

    private QuartoEstadoOcupado(){};
    private static QuartoEstadoOcupado instance = new QuartoEstadoOcupado();
    public static QuartoEstadoOcupado getInstance(){
        return instance;
    }

    public boolean disponibilizar(Quarto quarto){
        quarto.setEstado(QuartoEstadoDisponivel.getInstance());
        return true;
    }

    public boolean restaurar(Quarto quarto){
        quarto.setEstado(QuartoEstadoEmManutencao.getInstance());
        return true;
    }

    @Override
    public String getEstado() {
        return "Ocupado";
    }
}
