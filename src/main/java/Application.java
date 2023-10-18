import entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import java.time.LocalDate;


import static utils.JpaUtils.getEntityManagerFactory;

public class Application {

    public static void main(String[] args) {
        EntityManagerFactory emf=getEntityManagerFactory();
        EntityManager em=emf.createEntityManager();

        PersonaDAO pd=new PersonaDAO(em);
        EventoDAO ed=new EventoDAO(em);
        PartecipazioneDAO pad=new PartecipazioneDAO(em);
        LocationDAO ld=new LocationDAO(em);


        Location l1=new Location("La perla de Caio", "Trieste");
        ld.save(l1);

        Evento ev1=new Evento("Cena", LocalDate.now(), "Cena ex alunni", TipoEvento.PRIVATO, 30, l1);
ed.save(ev1);

        Persona p1=new Persona("Aldo","Baglio", "aldoBaglio@gmail.com",LocalDate.now(),Sex.M);
pd.save(p1);
        Partecipazione p1_ev1=new Partecipazione(p1,ev1,Stato.CONFERMATA);
pad.save(p1_ev1);

    }
}
