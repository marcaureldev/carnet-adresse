import java.util.*;

public class CarnetAdresse {

    private final ArrayList<Contact> contacts;

    public CarnetAdresse() {
        this.contacts = new ArrayList<>();
    }

    public void displayContacts() {
        for (Contact element : contacts) {
            System.out.println(element);
        }
    }

    public void addContact(Contact contact) {
        if (contacts.add(contact)) {
            System.out.println("Contact ajouté avec succès");
        } else {
            System.out.println("Erreur lors de l'ajout du contact");
        }
    }

    public void removeContact(String nom) {
        boolean removed = contacts.removeIf(contact -> contact.getNom().equalsIgnoreCase(nom));
        if (removed) {
            System.out.println("Contact supprimé avec succès");
        } else {
            System.out.println("Contact non trouvé");
        }
    }

    public void searchContact(String nom) {
        for (Contact contact : contacts) {
            if (contact.getNom().equalsIgnoreCase(nom)) {
                System.out.println("Vous recherchez le contact qui a pour nom: " + contact.getNom());
                contact.afficherInformations();
                return;
            }
        }
        System.out.println("Contact non trouvé");
    }
}
