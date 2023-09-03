package org.sets.atv4;

import java.util.Objects;

public class Tarefa {

    private String desc;
    private Boolean feito = false;

    public Tarefa(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public Boolean getFeito() {
        return feito;
    }

    public void setFeito(Boolean feito) {
        this.feito = feito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDesc(), tarefa.getDesc());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDesc());
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "desc='" + desc + '\'' +
                ", feito=" + feito +
                '}';
    }
}
