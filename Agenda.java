package observer;

import java.util.Observable;

public class Agenda extends Observable {

    private String nome;
    private Array assuntosDeInteresse;
    private Array locaisDeInteresse;

    public Agenda(String nome, Array assuntosDeInteresse, Array locaisDeInteresse) {
        this.nome = nome;
        this.assuntosInteresse = assuntosInteresse;
        this.locaisDeInteresse = locaisDeInteresse;
    }

    public void carregarEventos() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Confira os eventos de hoje em '" + this.nome + "'.";
    }
}
