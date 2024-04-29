package de.jk.examples.pmd.demo;

import java.util.List;
import java.util.Objects;

public class Main {

  public static void main(String[] args) {
    System.out.println("list");

    // usage of method reference in combination with a custom object leads to a false positive of PMD.UnusedPrivateMethod
    List.of(new StringWrapper().getString())
        .stream()

        .map(Main::foo)
        .filter(Objects::nonNull)
        .toList();

    // no false positive .. :/
    List.of("s")
        .stream()
        .map(Main::foo2)
        .filter(Objects::nonNull)
        .toList();
  }

  private static int foo(String s) {
    return s.length();
  }

  private static int foo2(String s) {
    return s.length();
  }

}
