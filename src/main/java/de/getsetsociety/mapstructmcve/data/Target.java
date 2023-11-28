package de.getsetsociety.mapstructmcve.data;

import java.util.Objects;

public class Target {
    private String target;

    public Target() {

    }

    public Target(String target) {
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Target target1 = (Target) o;

        return Objects.equals(target, target1.target);
    }

    @Override
    public int hashCode() {
        return target != null ? target.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Target{" +
                "target='" + target + '\'' +
                '}';
    }
}
