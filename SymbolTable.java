import java.util.*;

public class SymbolTable {

    private static final List<Symbol> table = new ArrayList<>();

    public static void add(String name, String type, String scope, int line) {
        table.add(new Symbol(name, type, scope, line));
    }

    public static void print() {
        System.out.println("\n===== SYMBOL TABLE =====");
        System.out.println("Name\tType\tScope\tLine");
        System.out.println("---------------------------");

        for (Symbol s : table) {
            System.out.println(
                s.name + "\t" +
                s.type + "\t" +
                s.scope + "\t" +
                s.line
            );
        }
    }
}
