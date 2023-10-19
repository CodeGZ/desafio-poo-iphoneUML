import device.IPhone;
import media.ReprodutorMusical;
import telecom.AparelhoTelefonico;
import internet.NavegadorInternet;

public class Main {

    public static void main(String[] args) {
        // Criando um iPhone
        IPhone iPhone = new IPhone();

        // Demonstrando as funcionalidades
        ReprodutorMusical reprodutor = iPhone;
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Música 1");

        AparelhoTelefonico telefone = iPhone;
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorInternet navegador = iPhone;
        navegador.exibirPagina("https://www.example.com");
        navegador.adicionarNovaAba("https://www.example2.com");
        navegador.atualizarPagina();
    }
}
