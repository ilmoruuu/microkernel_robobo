package plugins;

public interface Plugin {
    public void iniciar() throws InterruptedException;
    public void finalizar();
    public void definir();

}
