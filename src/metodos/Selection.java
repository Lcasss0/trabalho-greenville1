package metodos;

public class Selection {
  private int i;
  private int j;
  private int size;
  private int[]vetor;

  Manual manual;

  public Selection(){//construtor padrao da classe selecton
      super();
      this.manual = new Manual();
  }
  //metodo para ordenar e imprimir vetor a partir do metodo selection sort
    public void metodoSort(int[]vetor){
        for(i=0;i<vetor.length;i++){
            int i_menor = i;
            for(j = i+1;j<vetor.length;j++){
                if(vetor[j]<vetor[i_menor]){
                    i_menor = j;
                }
            }
            int aux = vetor[i];
            vetor[i] =vetor[i_menor];
            vetor[i_menor] = aux;
        }

        //ACESSANDO VETOR;
        for(i= 0;i<vetor.length;i++){
            System.out.printf("posicao[%d] : %d\n",i,vetor[i]);
        }
    }

    //retorno da string manual;
    public  String manualSelection(){
      return manual.selection;

    }

}
