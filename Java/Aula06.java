//VETORE OU ARRAY 

public class Aula06{
    
    public static void main(String[] args){
        int[] notas= new int[10]; //Declarando o array e o seu tamanho: [10]
        notas[0] = 8; 
        notas[2] = 5; 
        notas[6] = 4; 
        notas[4] = 1; 

        //declarando array sem especificar o tamanho 
        String[] carros = new String[] {"BMW I3", "Mercedes c180", "BMW M3"}; //registros
        System.out.println(carros.lenght); //tamanho do array

        for (String carro : carros){
            System.out.println(carro); // mostrando todos os nomes dos carros que contém no array 
        }


        for (int i = 0; i < notas.length; i++){
            System.out.println(notas[i]); 
        }

        
        

    }
}