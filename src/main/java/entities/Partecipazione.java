package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Partecipazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Persona persona;
    private Evento evento;
    private Stato state;

    public Partecipazione(){}

    public Partecipazione(Persona persona, Evento evento, Stato state) {
        this.persona = persona;
        this.evento = evento;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Stato getState() {
        return state;
    }

    public void setState(Stato state) {
        this.state = state;
    }
}
