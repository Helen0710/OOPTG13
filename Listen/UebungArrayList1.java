package Listen;

import java.util.ArrayList;

public class UebungArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("Peter");
        name.add("Paul");
        name.add("Sophie");

        System.out.print(name);

        name.remove(1);

        for (String string : name) {

            System.out.println(string);

        }

        // prüfe ob Wert in Liste ist

        System.out.println(name.contains("Peter"));

        // Normale For-Schleife mit einer ArrayList
        for (int i = 0; i < name.size(); i++) {

            System.out.println(name.get(i));
        }

    }
}
