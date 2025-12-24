import java.util.*;

public class ASTNode {
    public String type;
    public String value;
    public List<ASTNode> children = new ArrayList<>();

    public ASTNode(String type) {
        this.type = type;
    }

    public ASTNode(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public void add(ASTNode child) {
        children.add(child);
    }

    public void print(String indent) {
        System.out.println(indent + type + (value != null ? " : " + value : ""));
        for (ASTNode c : children) {
            c.print(indent + "  ");
        }
    }
}
