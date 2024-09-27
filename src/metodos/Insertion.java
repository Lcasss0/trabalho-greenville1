package metodos;

public class Insertion {
    private int i;
    private int j;
    private int element;

    Manual manual;
    public Insertion(){//construtor padrao da classe insertion com a instanciação do atributo manual do tipo manual;
        this.manual = new Manual();
    }

    //metodo para ordenar e imprimir o vetor passado como paramentro e ordenalo com o metodo insertion sort;
    public void ordernarInsertion(int[] vetor, int size){
        for(i=1; i<size; i++) {
            element = vetor[i];
            for(j=(i-1); j>=0 && vetor[j]>element; j--)
                vetor [j+1] = vetor [j];
            vetor[j+1] = element;
        }
        for(i=0;i<vetor.length;i++){
            System.out.printf("posição[%d] : %d \n",i,vetor[i]);
        }
    }

    public String manualInsertion(){
        return manual.insertion;
    }

}
