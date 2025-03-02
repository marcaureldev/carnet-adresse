public class Contact {
    private String nom;
    private String prenom;
    private String numTelephone;
    private String email;

    //Constructeur de la classe Contact

    public Contact(String nom, String prenom, String numTelephone, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.numTelephone = numTelephone;
        this.email = email;
    }

    //Getters ou accesseurs
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumTelephone() {
        return numTelephone;
    }

    public String getMail() {
        return email;
    }

    //Setters ou modificateurs

    public void setNom(String nom){
        this.nom = nom;
    }

    public void stePrenom(String prenom){
        this.prenom = prenom;
    }

    public void setNumTelephone(String numTelephone){
        this.numTelephone = numTelephone;
    }

    public void setMail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return nom + " " + prenom + " " + numTelephone + " " + email;
    }

    public void afficherInformations() {
        System.out.println(this);
    }
}