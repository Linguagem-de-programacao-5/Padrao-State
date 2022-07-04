public abstract class QuartoEstado {

    public abstract String getEstado();

    public boolean disponibilizar(Quarto quarto){
        return false;
    }

    public boolean reservar(Quarto quarto){
        return false;
    }

    public boolean ocupar(Quarto quarto){
        return false;
    }

    public boolean restaurar(Quarto quarto){
        return false;
    }
}
