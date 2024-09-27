package metodos;

public class Bubble {
    Manual manual;
    private int i;
    private int j;
    private  int temp;

    //construtor padrao da classe bubble, com a instanciaçã do atributo do tipo manual;
    public Bubble(){
        this.manual = new Manual();
    }

    //retorno da String do tipo manual;
    public String manualBubble(){
        return manual.bubble;
    }


    //metodo para ordenar e imprimir o vetor por metodo bubblesort
    public void ordernarBubble(int[]vetor,int size){
        for(i=0; i<(size-1); i++)
        {
            for(j=0; j<(size-i-1); j++)
            {
                if(vetor[j]>vetor[j+1])
                {
                    temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
        //aplicação de um for loop para acessar e imprimir o vetor ordenado
        for(i = 0;i<vetor.length;i++){
            System.out.printf("posição[%d] : %d\n ",i,vetor[i]);
        }
    }
}
