
import java.util.*;

public class CarnetAdresse {

    private final ArrayList<Contact> contacts;

    public CarnetAdresse() {
        this.contacts = new ArrayList<>();
    }

    public void getContacts() {
        for (Contact element : contacts) {
            System.out.print(element.getNom() + " " + element.getPrenom() + " " + element.getNumTelephone() + " "
                    + element.getMail() + "\n");
        }
    }

    public void ajouterContact(Contact contact) {
        contacts.add(contact);

        if (contacts.add(contact)) {
            System.out.println("Contact ajouté avec succès");
        }
    }

    public void supprimerContact(String nom) {
        contacts.removeIf(contact -> contact.getNom().equalsIgnoreCase(nom));
    }

    public void chercherContact(String nom) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getNom().equalsIgnoreCase(nom)) {
                // return contacts.get(i).getNom()
                System.out.println("Vous recherchez le contact qui a pour nom: " + contacts.get(i).getNom());
                contacts.get(i).afficherInformations();
            }
        }
    }

}
