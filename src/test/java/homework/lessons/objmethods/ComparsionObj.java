package homework.lessons.objmethods;

import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class ComparsionObj {

    String s;
    Integer i;
    List l;

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

    }

    public void printString() {
        System.out.println("String s: " + this.s);
    }

    public void printStringInteger() {
        System.out.println("String s: " + this.s + "\nInteger i: " + this.i);
    }

    public void printStringIntegerList() {
        System.out.println("String s: " + this.s + "\nInteger i: " + this.i + "\nList l: " + this.l);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparsionObj that = (ComparsionObj) o;
        return s.equals(that.s);
    }

    public boolean equalsTwoArgs(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparsionObj that = (ComparsionObj) o;
        return s.equals(that.s) && Objects.equals(i, that.i);
    }


    public boolean equalsThreeArgs(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparsionObj that = (ComparsionObj) o;
        return s.equals(that.s) && Objects.equals(i, that.i) && Objects.equals(l, that.l);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s);
    }
}
