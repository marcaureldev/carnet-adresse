public static void main(String[] args) {

    Contact contactMarc = new Contact("AHOUANDJINOU", "Marc-Aurel", "0158466965", "ahouandjinou@gmail.com");
    Contact contactIovann = new Contact("ATCHO", "Iovann", "0191323202", "atcho@gmail.com");
    Contact contactElise = new Contact("AVOKAN", "Elisé", "0158467049", "avokan@gmail.com");

    CarnetAdresse carnetAdr = new CarnetAdresse();

    carnetAdr.ajouterContact(contactMarc);
    carnetAdr.ajouterContact(contactIovann);
    carnetAdr.ajouterContact(contactElise);

    System.out.println("La liste des contact est: ");
    carnetAdr.getContacts();

    carnetAdr.supprimerContact("AHOUANDJINOU");
    System.out.println("La nouvelle liste de contact est la suivante: ");
    carnetAdr.getContacts();

    carnetAdr.chercherContact("Avokan");

}

