package theory.module1;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Vitor Inacio";
        char letter = name.charAt(0);
        int nameLength = name.length();
        int lastIndex = name.lastIndexOf("o", nameLength);
        name = name.trim(); // vitorinacio
        name = name.toLowerCase(); // vitor inacio
        name = name.toUpperCase(); // VITOR INACIO
        name = name.replace("o", "x"); // Vitxr Inacix

        if(name.isEmpty()) System.out.println("name is empty");
        else System.out.println("name is NOT empty");

        System.out.println(nameLength); // 12
        System.out.println(letter); // V
        System.out.println(lastIndex); // 11
    }
}
