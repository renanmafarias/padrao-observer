package observer;

import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer {

    private String username;
    private String ultimaNotificacao;

    public Usuario(String username) {
        this.username = username;
    }

    public String obterUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void acompanharEventos(Agenda agenda) {
        agenda.addObserver(this);
    }

    public void atualizar(Observable agenda, Object arg1) {
        this.ultimaNotificacao = "Olá ", this.username + "! " + agenda.toString();
    }
}
