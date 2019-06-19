public class Persona {
    protected String nome;
    protected String cognome;

    public Persona(){}
    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String toString(){
        return "nome: " + nome + "\ncognome: " + cognome;
    }
}
