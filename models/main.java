public static void main(String[] args) {

    Contact contact1 = new Contact("Nom1", "Prénom1", "0158466965", "nom1@gmail.com");
    Contact contact2 = new Contact("Nom2", "Prénom2", "0191323202", "nom2@gmail.com");
    Contact contact3 = new Contact("Nom3", "Prénom3", "0158467049", "nom3@gmail.com");
    Contact contact4 = new Contact("Nom4", "Prénom4", "01600109632", "nom4@gmail.com");


    CarnetAdresse carnetAdr = new CarnetAdresse();

    carnetAdr.addContact(contact1);
    carnetAdr.addContact(contact2);
    carnetAdr.addContact(contact3);
    carnetAdr.addContact(contact4);


    System.out.println("La liste des contact est: ");
    carnetAdr.displayContacts();

    carnetAdr.removeContact("Nom3");
    System.out.println("La nouvelle liste de contact est la suivante: ");
    carnetAdr.displayContacts();

    carnetAdr.searchContact("Nom2");

}

