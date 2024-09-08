package com.greglixandrao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class People {
    private String name;
    private LocalDate nascimento;

    public People(String name, LocalDate nascimento) {
        this.name = name;
        this.nascimento = nascimento;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }
    public boolean isOfLegalAge() {
        return getAge() >= 18;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(name, people.name) && Objects.equals(nascimento, people.nascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nascimento);
    }
}
