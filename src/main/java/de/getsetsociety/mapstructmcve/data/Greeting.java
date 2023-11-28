package de.getsetsociety.mapstructmcve.data;

import java.util.Objects;

public class Greeting {
    private String prefix;
    private Target target;

    public Greeting() {

    }

    public Greeting(String prefix, Target target) {
        this.prefix = prefix;
        this.target = target;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Greeting greeting = (Greeting) o;

        if (!Objects.equals(prefix, greeting.prefix)) return false;
        return Objects.equals(target, greeting.target);
    }

    @Override
    public int hashCode() {
        int result = prefix != null ? prefix.hashCode() : 0;
        result = 31 * result + (target != null ? target.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "prefix='" + prefix + '\'' +
                ", target=" + target +
                '}';
    }
}
