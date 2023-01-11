import java.util.Scanner;
public class Main {
    public static void main(String... pito) {

        Scanner s = new Scanner(System.in);
        System.out.println("ingresa el texto deseado");
        System.out.println("Enserio no importa la cantidad de palabras, no hay limite");

        String word = s.nextLine().toLowerCase();
        String texto = "";
        for (char c: word.toCharArray()) {

             texto = word.replace("a", "4").replace("b", "8").replace("c", "(")
                    .replace("d", "|)").replace("e", "3").replace("f", "ƒ").replace("g", "&").replace("h", "|-|").replace("i", "1")
                     .replace("j", ";").replace("k", "|<").replace("l", "|").replace("m", "^^").replace("n", "ท")
                    .replace("ñ", "ท~").replace("o", "0").replace("p", "|º").replace("q", "9").replace("r", "|`").replace("s", "5")
                    .replace("t", "7").replace("u", "บ").replace("v", "|/").replace("w", "vv").replace("x", "><").replace("y", "`/")
                    .replace("z", "7_").replace("1", "i").replace("2", "z").replace("3", "e").replace("4", "a").replace("5", "s")
                     .replace("6", "b").replace("7", "t").replace("8", "&").replace("9", "g").replace("0", "o");
        }

        System.out.println("");
        System.out.println("Su texto codificado es: " + texto);
    }
}
