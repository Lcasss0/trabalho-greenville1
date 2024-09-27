package alunos;

import painel.Painel;

//classe para atribuir valores ao objeto aluno;
public class Aluno {

    public Aluno(){//construtor padrao da classe aluno;

    }
    private final String name_alunos = "Victor, Bruno , Wilson e Lucas ";
    private final String curso = " engenharia de software";
    private final String periodo = " 5 periodo";
    private final String professor = "Ricardo VilaVerde";


    //metodo para escrever os atributos como uma concatenaçao de string;
    public String escreverAlunos(){
        return "ALUNO : "+ " "+name_alunos + "\n"+
                "CURSO :"+" " + curso +"\n"+
                "PERIODO : "+ " " + periodo+"\n"+
                "PROFESSOR :" +" "+professor;
    }

}
