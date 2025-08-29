package br.com.banco.main;

// importam os pacotes que serão utilizados
import br.com.banco.model.Conta;
import br.com.banco.service.Banco;
import br.com.banco.view.Atendente;

public class Main {
    public static void  main(String[] args){ //inicia a main como static

        Banco banco = new Banco(); // cria o objeto banco
        Atendente atendente = new Atendente(banco); // cria o objeto atendente

        int escolhaAcao = 1; // inicializa a variável escolhaAcao (1 é um número aleatório)

        do{ // inicia o laço do while
            escolhaAcao = atendente.escolhaAcao(); // solicita ao usuário que escolha uma ação no menu
        } while (escolhaAcao != 0); // repete o menu enquanto o usuário não escolher sair

        atendente.sair();  // exibe mensagem de saída do sistema
    }
}
