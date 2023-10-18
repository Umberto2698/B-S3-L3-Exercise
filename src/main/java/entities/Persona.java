package entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private String email;
    private Date birthday;
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @OneToMany(mappedBy = "person")
    private Set<Partecipazione> partecipazioni=new HashSet<>();


    public Persona(){}

    public Persona(String name, String surname, String email, Date birthday, Sex sex, Set<Partecipazione> partecipazioni) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthday = birthday;
        this.sex = sex;
        this.partecipazioni = partecipazioni;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Sex getSex() {
        return sex;
    }

    public Set<Partecipazione> getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(Set<Partecipazione> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }
}
