package painel;

import java.util.Date;
import java.util.Random;

//classe para obeter o tamanho do vetor e os vetores;
public class Vetor {

    private final int tamanhoVetor = 50;
    private int[]vetor;
    private int intervalo;

    public Vetor(int intervalo){//construtor da classe vetor com o parametro intervalo sendo atribuido ao atribudo intervalo.
        this.intervalo = intervalo;
        vetor = new int[tamanhoVetor];//instanciação do atributo vetor;
    }

    //metodo para retornar os numeros armazenados no vetor em suas devidas posiçoes;
    public int[] getVetor() {
        return vetor;
    }

    //metodo para retornar o tamanho do vetor(vetor possui tamanho constante de 50 posiçoes)
    public int getTamanhoVetor() {
        return tamanhoVetor;
    }


    //metodo para retonar o intervalo digitado/escolhido pelo usuario(intervalo de numeros de 0 ate o numero que o usuario digitou);
    public int getIntervalo() {
        return intervalo;
    }

    //metodo para preencher as posiçoes dos vetores a partir da margem de intervalo de numeros aleatorios escolhido pelo usuario;
    public void preencherComNumerosAleatorios() {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(intervalo); // Gera números aleatórios com o intervalo de numeros que o usuario digitar
        }

    }

    //metodo para imprimir o vetor com numeros aleatorios;
    //Método para imprimir o vetor;
    public void imprimirVetor() {
        System.out.println("\n\t IMPRIMINDO VETOR ORIGINAL  : \n\t");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento [" + i + "] = " + vetor[i]);
        }
    }

}
