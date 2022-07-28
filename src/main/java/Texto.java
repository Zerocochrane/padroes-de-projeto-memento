public class Texto {
    protected String texto;
    TextoCareTaker caretaker;

    public Texto() {
        caretaker = new TextoCareTaker();
        texto = new String();
    }

    public void escreverTexto(String novoTexto) {
        caretaker.adicionarMemento(new TextoMemento(texto));
        texto += novoTexto;
    }

    public void desfazerEscrita() {
        texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
    }

    public String mostrarTexto() {
        return texto;
    }
}