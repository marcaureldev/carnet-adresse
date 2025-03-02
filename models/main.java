public static void main(String[] args) {

    Contact contactMarc = new Contact("AHOUANDJINOU", "Marc-Aurel", "0158466965", "ahouandjinou@gmail.com");
    Contact contactIovann = new Contact("ATCHO", "Iovann", "0191323202", "atcho@gmail.com");
    Contact contactElise = new Contact("AVOKAN", "Elisé", "0158467049", "avokan@gmail.com");
    Contact contactCynelle = new Contact("HOUKONNOU", "Cynelle", "01600109632", "houkonnou@gmail.com");


    CarnetAdresse carnetAdr = new CarnetAdresse();

    carnetAdr.addContact(contactMarc);
    carnetAdr.addContact(contactIovann);
    carnetAdr.addContact(contactElise);
    carnetAdr.addContact(contactCynelle);


    System.out.println("La liste des contact est: ");
    carnetAdr.displayContacts();

    carnetAdr.removeContact("AHOUANDJINOU");
    System.out.println("La nouvelle liste de contact est la suivante: ");
    carnetAdr.displayContacts();

    carnetAdr.searchContact("Avokan");

}

