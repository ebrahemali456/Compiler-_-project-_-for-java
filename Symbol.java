public class Symbol {
    public String name;
    public String type;
    public String scope;
    public int line;

    public Symbol(String name, String type, String scope, int line) {
        this.name = name;
        this.type = type;
        this.scope = scope;
        this.line = line;
    }
}
