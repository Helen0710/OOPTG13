package Listen;

public class UebungArray {
    public static void main(String[] args) {

        String[] name = { "Paul", "Greta", "Laura" };

        for (int i = 0; i < 3; i++) {
            System.out.println(name[i]);
        }

        name[0] = null; // entfernen von einem Namen -> ein Objekt löschen

        for (String pname : name) { // For each Schleife einfacher

            if (pname == null)

                System.out.println("Dieses Objekt wurde gelöscht"); // Prüfen ob eine freie Stelle vorhanden ist
        }

        for (String bname : name) { // Prüfen ob ein Name vorhanden ist

            if (bname == "Greta") {

                System.out.println("Greta vorhanden");

            }

        }

    }
}
