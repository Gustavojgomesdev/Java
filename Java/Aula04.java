//Estruturas de controle(condicionais e loops)
/*public class Aula04{

    public static void main(String[] args) {
        int idade = 105; 
        
        if (idade >= 100){
            System.out.println("Mumia");
        }else if (idade >= 18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
    }
}*/
    //LOOP
public class Aula04{

    public static void main(String[] args){
        int count = 10; 

        while (count < 100){
            System.out.println("count: " + count); 
            count++; 
        }
       
        countDois = 20;
        // DO WHILE (sempre emprime pelo menos uma vez)
        do {
            System.out.println()
            countDois++
        } while(countDois < 100); 

        //for normal 
        for (int i = 0;i < 100; i++){
            System.out.println(i)
        }
        
        // for com areas ausentes (sem usar a area de atribuição e ação )
        int i = 0; 

        for (;i < 100;){
            System.out.println(i);
            i++;
        }

        //For sem uso das areas (usado para loops infinitos)
        for(;;){
            System.out.println("for");
        }

        //switgchCase, jeito mais facil de fazer IF e else 
        int mes = 1;
        switch(mes){
            case 1: System.out.println("Janeiro"); break;
            case 2: System.out.println("fevereiro"); break;
            case 3: System.out.println("março"); break;
            default:  System.out.println("Mes invalido");
        }

    }
}