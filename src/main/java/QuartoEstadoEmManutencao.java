public class QuartoEstadoEmManutencao extends QuartoEstado{

    private QuartoEstadoEmManutencao(){};
    private static QuartoEstadoEmManutencao  instance = new QuartoEstadoEmManutencao();
    public static QuartoEstadoEmManutencao getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Em manutenção";
    }

    public boolean disponibilizar(Quarto quarto){
        quarto.setEstado(QuartoEstadoDisponivel.getInstance());
        return true;
    }
}
