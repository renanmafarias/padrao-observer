package observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void deveNotificarUmUsuario() {
        Agenda agenda = new Agenda("Meus eventos", ["Tecnologia", "Ciência"], ["Vassouras - RJ", "Rio de Janeiro - RJ"]);
        Usuario usuario = new Usuario("user1");
        usuario.acompanharEventos(agenda);
        agenda.carregarEventos();
        assertEquals("Olá user1! Confira os eventos de hoje que podem lhe interessar em 'Meus eventos'.", usuario.obterUltimaNotificacao());
    }
}