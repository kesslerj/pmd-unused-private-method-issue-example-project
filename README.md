Demo project for PMD issue https://github.com/pmd/pmd/issues/4985 .

Run with

    mvn clean verify

This should find the following violations in Main.java:

    [INFO] PMD Failure: de.jk.examples.pmd.demo.Main:27 Rule:UnusedPrivateMethod Priority:3 Avoid unused private methods such as 'foo(String)'..
