import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<Persona> persone = new Vector<Persona>();
        Scanner input = new Scanner(System.in);
        int scelta;

        do {

            System.out.println("\nMenu:");
            System.out.println("1) Aggiungi persona");
            System.out.println("2) Togli persona");
            System.out.println("3) Togli persona specifica");
            System.out.println("4) Visualizza elenco persone");
            System.out.println("0) Esci");

            System.out.print("Scelta: ");

            scelta = input.nextInt();
            input.nextLine();

            switch (scelta) {

                case 1: System.out.print("\nInserisci il nome:");
                        String nome = input.nextLine();
                        System.out.print("\nInserisci il cognome:");
                        String cognome = input.nextLine();
                        System.out.print("\nInserisci l'età: ");
                        int eta = input.nextInt();
                        input.nextLine();

                        Persona p = new Persona(nome,cognome,eta);
                        persone.add(p);
                        System.out.println("\nPersona aggiunta.");
                    break;

                case 2: System.out.print("\nInserisci la posizione della persona da rimuovere: ");
                        int posizione = input.nextInt();
                        input.nextLine();

                        if (posizione >= 0 && posizione < persone.size()) {
                            persone.remove(posizione);
                            System.out.println("\nPersona rimossa.");
                        } else {
                            System.out.println("\nPosizione non valida.");
                        }
                    break;

                case 3: System.out.print("\nInserisci il nome della persona: ");
                        nome = input.nextLine();
                        System.out.print("\nInserisci il cognome della persona: ");
                        cognome = input.nextLine();

                        Persona personaDaRimuovere = null;
                        for (Persona persona : persone) {
                            if (persona.getNome().equals(nome)) {
                                personaDaRimuovere = persona;
                                break;
                            }
                        }

                        if (personaDaRimuovere != null) {
                            persone.remove(personaDaRimuovere);
                            System.out.println("\nPersona rimossa.");
                        } else {
                            System.out.println("\nPersona non trovata.");
                        }
                    break;

                case 4: System.out.println("\nElenco persone:");
                        for (Persona persona : persone) {
                            System.out.println(persona);
                        }
                    break;

                case 0: System.out.println("\nArrivederci.");
                    break;

                default: System.out.println("\nScelta non valida.");
                    break;

            }

        } while (scelta != 0);

    }
}
