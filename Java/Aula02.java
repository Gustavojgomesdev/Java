// Variáveis 
public class Aula02{
    
    public static void main(String[] args) {
        //Tipos primitivos 
        byte numByte = 127; // de -128 até 127 (8 bits), pouco armazenamento  
        short numShort = 12321; // de -32768 a 32767 (16 bits)
        int numInt = 2147483647; // de -2.147.483.648 a 2.147.483.647 (32 bits), um dos mais usados
        long numLong = 897997888l; // números altos (64 bits), para usar números acima do INT no long precimaos colocar a letra 'l' = [literal]  no final do número ex: long numLong = 2147483648l.
        
        float numFloat = 10.00f; // -1,4024E-37 a 3.40282347E+38  (32 bits), números gigantescos, para declarar qualquer valor do tipo float precisamos usar o literal 'f'
        double numDouble = 100000000000.000; // (64 bits)

        char varChar = 'F'; // 0  a 6535 (16 bits), precisa ser usado com aspas simples 
        
        boolean varBoolean = true; // true ou false (1 bit)

        //Variáveis que apontam para um objeto
        //String não é tipo primitivo e sim uma classe, vetor de bytes
        String texto  = "Bem vindos"; 
        Integer numero = 4000; 
        Long numerolongo = 1213123L; 
        
        //Toda variavel deve começar com letra minusula 
        // Não deve começar com & _ $ (caracteres especiais)
        //Se for nome composto a primeira deve inciar com letra minuscula e  a segunda com letra maiuscula
        //Evite usar variaveis de um caractere: ex: a, não define nada 

        String nome = "Gustavo"; 
    }
}