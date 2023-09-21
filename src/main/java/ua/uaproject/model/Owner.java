package ua.uaproject.model;

import jdk.jfr.Enabled;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table
public class Owner extends User{
    @OneToMany
    private List<Book> ownBooks;
}
