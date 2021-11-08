package homework.lessons.objmethods;

import org.testng.annotations.Test;

import java.awt.*;
import java.util.Objects;

public class ComparsionObj {

    String s;
    Integer i;
    List l;

    ComparsionObj(){}

    ComparsionObj(String s) {
        this.s = s;
    }

    ComparsionObj(String s, Integer i) {
        this.s = s;
        this.i = i;
    }

    ComparsionObj(String s, Integer i, List l) {
        this.s = s;
        this.i = i;
        this.l = l;
    }

    @Test
    public void execute() {
        ComparsionObj comparsionObj = new ComparsionObj("Oleg");
        System.out.println(comparsionObj);
        ComparsionObj comparsionObj1 = new ComparsionObj("Olef");
        System.out.println(comparsionObj1);

        System.out.println(comparsionObj.equals(comparsionObj1));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparsionObj that = (ComparsionObj) o;
        if (s!=null) {
            return s.equals(that.s);
        } else if (s != null && i != null) {
            return s.equals(that.s) && i.equals(that.i);
        } else {
            return s.equals(that.s) && i.equals(that.i) && l.equals(that.l);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, i, l);
    }

    @Override
    public String toString() {
        if (s != null) {
            return s;
        } else if (s != null && i != null) {
            return s + " " + i;
        } else {
            return s + " " + i + " " + l;
        }
    }
}
