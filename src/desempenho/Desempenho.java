package desempenho;
import metodos.*;
import painel.Vetor;

//classe para comparar o desempenho de processamento de cada algoritmo de ordenação no menu de instrucao com o vetor de 50 posiçoes;
public class Desempenho {
    private long tempoInicial;
    private long tempoFinal ;
    private long calculo;
    public Desempenho(long tempoInicial , long tempoFinal){//construtor da classe Desempenho;;
        this.tempoInicial = tempoInicial;//variavel que ira receber o tempo inicial(antes do metodo de ordenação)
        this.tempoFinal = tempoFinal;//variavel que ira receber o tempo final(depois do metodo de ordenação);
    }

    //metodo que ira realizar o calculo da diferençã do tempo final e inicial e retornar o valor que sera o tempo que o algoritmo executou o codigo
    public long calculoTempo(long tempoFinal, long tempoInicial){
        calculo = tempoFinal - tempoInicial;//calculo de diferença
        return calculo;//retorno do calculo;
    }
}
