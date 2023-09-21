public class operadorLogico {

    public static void main(String[] args){

        boolean condicao1 = true;

        boolean condicao2 = true;

        if(condicao1 && condicao2){
            // "&&" significa e
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            // "||" significa ou
            System.out.println("uma das condições é verdadeira");
        }

        if(condicao1 && (7 > 4) ){
            // fazendo dessa forma também me trara um valor verdade, não preciso necessáriamente criar uma declaracao bolean
//expressoes logicas contemplam valoes boleanos
            System.out.println("as duas condições são verdadeiras");
        }

        System.out.println("FIM");

    }
}
