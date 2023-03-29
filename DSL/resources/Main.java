import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.GsonBuilder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.io.*;


public class Main {

    private static final Gson PRETTY_PRINT_GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    static int c = 1;
    public static String toJson(ParseTree tree)throws IOException {
      String fn = String.format("outputRULE%o.json", c);
      FileWriter fileWriter = new FileWriter(fn,true);
      PRETTY_PRINT_GSON.toJson(toMap(tree), fileWriter);
      fileWriter.close();
      c++;
      return toJson(tree, true);
    }
  
    public static String toJson(ParseTree tree, boolean prettyPrint) {
      return PRETTY_PRINT_GSON.toJson(toMap(tree));
    }
  
    public static Map<String, Object> toMap(ParseTree tree) {
      Map<String, Object> map = new LinkedHashMap<>();
      
      traverse(tree, map);
      return map;
    }
    public static void traverse(ParseTree tree, Map<String, Object> map) {
  
      if (tree instanceof TerminalNodeImpl) {
        Token token = ((TerminalNodeImpl) tree).getSymbol();
        int x = token.getType();
        map.put("type", x);
        map.put("value", token.getText());

        
      }
      else {
        List<Map<String, Object>> children = new ArrayList<>();
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "");
        switch(name){
          case "GT":
            map.put(">", children);
            break;
          
          case "GTE":
            map.put(">=", children);
            break;

          case "LT":
            map.put("<", children);
            break;

          case "LTE":
            map.put("<=", children);
            break;

          case "EQ":
            map.put("==", children);
            break;

          case "NEQ":
            map.put("!=", children);
            break;

          case "Add":
            map.put("+", children);
            break;
          
          case "Sub":
            map.put("-", children);
            break;

          case "Mul":
            map.put("*", children);
            break;

          case "Div":
            map.put("/", children);
            break;
          
          case "Mod":
            map.put("%", children);
            break;

          case "Assign":
            map.put("=", children);
            break;

          case "ArgVar":
            map.put("args", children);
            break;

          case "ArgNum":
            map.put("args", children);
            break;
          
          default:
            map.put(name, children);
            break;
        }
        // System.out.println(name);
        // System.out.println(tree.getChild(0));
        // map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), children);
        
  
        for (int i = 0; i < tree.getChildCount(); i++) {
          Map<String, Object> nested = new LinkedHashMap<>();
          
          if (tree.getChild(i) instanceof TerminalNodeImpl) {
            Token token = ((TerminalNodeImpl) tree.getChild(i)).getSymbol();
            int x = token.getType();
            if(x != 6 && x != 7 && x != 8 && x != 9 && x != 10 && x != 13 && x != 14 && x != 15 && x != 16 && x != 17 && x != 18 && x != 19 && x != 20 && x != 21){
              children.add(nested);
              traverse(tree.getChild(i), nested);
            }
          }
          else {
            children.add(nested);
            traverse(tree.getChild(i), nested);
          }
          
        }
      }
    }

    public static void RuleSplit(String fileName)throws IOException {
      File file = new File(fileName);
      Scanner input = new Scanner(file);
      int count = 0;
      int flag = 0;
      StringBuilder currentRule = new StringBuilder();
      while (input.hasNext()) {
        String word  = input.next();
        if(word.equals("rulestart")) {
          flag = 1;
          continue;
        }
        if(flag == 1){
          if(word.equals("ruleend")) {
            flag = 0;
            String rule = currentRule.toString().trim(); 
            DSLLexer lexer = new DSLLexer(CharStreams.fromString(rule));
            DSLParser parser = new DSLParser(new CommonTokenStream(lexer));
            System.out.println(rule);
            System.out.println(toJson(parser.parse()));
            currentRule.delete(0,currentRule.length());
            continue;
          }
          currentRule.append(word);
          currentRule.append(" ");
        }
      }
    }
    

    public static void main(String[] args)throws IOException {
      RuleSplit(args[0]);
  }
}