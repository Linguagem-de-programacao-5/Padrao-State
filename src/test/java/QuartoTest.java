import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuartoTest {

    Quarto quarto;

    @BeforeEach
    public void setUp(){
        quarto = new Quarto();
    }

    //Quarto disponivel

    @Test
    public void naoDeveDisponibilizarQuartoDisponivel(){
        quarto.setEstado(QuartoEstadoDisponivel.getInstance());
        assertFalse(quarto.disponibilizar());
    }

    @Test
    public void deveReservarQuartoDisponivel(){
        quarto.setEstado(QuartoEstadoDisponivel.getInstance());
        assertTrue(quarto.reservar());
        assertEquals(QuartoEstadoReservado.getInstance(),quarto.getEstado());
    }

    @Test
    public void deveOcuparQuartoDisponivel(){
        quarto.setEstado(QuartoEstadoDisponivel.getInstance());
        assertTrue(quarto.ocupar());
        assertEquals(QuartoEstadoOcupado.getInstance(),quarto.getEstado());
    }

    @Test
    public void deveRestaurarQuartoDisponivel(){
        quarto.setEstado(QuartoEstadoDisponivel.getInstance());
        assertTrue(quarto.restaurar());
        assertEquals(QuartoEstadoEmManutencao.getInstance(),quarto.getEstado());
    }

    //Quarto Reservado

    @Test
    public void deveDisponibilizarQuartoReservado(){
        quarto.setEstado(QuartoEstadoReservado.getInstance());
        assertTrue(quarto.disponibilizar());
        assertEquals(QuartoEstadoDisponivel.getInstance(),quarto.getEstado());
    }

    @Test
    public void naoDeveReservarQuartoDisponivel(){
        quarto.setEstado(QuartoEstadoReservado.getInstance());
        assertFalse(quarto.reservar());
    }

    @Test
    public void deveOcuparQuartoReservado(){
        quarto.setEstado(QuartoEstadoReservado.getInstance());
        assertTrue(quarto.ocupar());
        assertEquals(QuartoEstadoOcupado.getInstance(),quarto.getEstado());
    }

    @Test
    public void deveRestaurarQuartoReservado(){
        quarto.setEstado(QuartoEstadoReservado.getInstance());
        assertTrue(quarto.restaurar());
        assertEquals(QuartoEstadoEmManutencao.getInstance(),quarto.getEstado());
    }

    //Quarto Ocupado

    @Test
    public void deveDisponibilizarQuartoOcupado(){
        quarto.setEstado(QuartoEstadoOcupado.getInstance());
        assertTrue(quarto.disponibilizar());
        assertEquals(QuartoEstadoDisponivel.getInstance(),quarto.getEstado());
    }

    @Test
    public void naoDeveReservarQuartoOcupado(){
        quarto.setEstado(QuartoEstadoOcupado.getInstance());
        assertFalse(quarto.reservar());
    }

    @Test
    public void naoDeveOcuparQuartoOcuopado(){
        quarto.setEstado(QuartoEstadoOcupado.getInstance());
        assertFalse(quarto.ocupar());
    }

    @Test
    public void deveRestaurarQuartoOcupado(){
        quarto.setEstado(QuartoEstadoOcupado.getInstance());
        assertTrue(quarto.restaurar());
        assertEquals(QuartoEstadoEmManutencao.getInstance(),quarto.getEstado());
    }

    //Quarto Em Manutenção

    @Test
    public void deveDisponibilizarQuartoEmManutancao(){
        quarto.setEstado(QuartoEstadoEmManutencao.getInstance());
        assertTrue(quarto.disponibilizar());
        assertEquals(QuartoEstadoDisponivel.getInstance(),quarto.getEstado());
    }

    @Test
    public void naoDeveReservarQuartoEmManutencao(){
        quarto.setEstado(QuartoEstadoEmManutencao.getInstance());
        assertFalse(quarto.reservar());
    }

    @Test
    public void naoDeveOcuparQuartoEmManutencao(){
        quarto.setEstado(QuartoEstadoEmManutencao.getInstance());
        assertFalse(quarto.ocupar());
    }

    @Test
    public void naodeveRestaurarQuartoEmManutencao(){
        quarto.setEstado(QuartoEstadoEmManutencao.getInstance());
        assertFalse(quarto.restaurar());
    }

}