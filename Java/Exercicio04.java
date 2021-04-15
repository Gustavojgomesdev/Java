public class Exercicio04{

    public static void main(String[] args) throws Exception {
        
        String word = "arara"; 
        String invertida = new StringBuffer(word).reverse().toString(); 
        
        if (word.equals(invertida)){
            System.out.println("Essa palavra e um palindrome");
            System.out.println("Palavra escrita normal: " + word);
            System.out.println("Palavra escrita ao inverso: " + invertida);
        }
        else{
            System.out.println("Essa palavra nao e um palindrome");
        }
    }
}