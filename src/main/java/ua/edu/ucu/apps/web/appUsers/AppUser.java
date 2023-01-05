package ua.edu.ucu.apps.web.appUsers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Table
@Entity
@NoArgsConstructor
@Getter
@Setter
public class AppUser {
    @Id
    @GeneratedValue
    private long id;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
    @Transient
    private int age;

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
