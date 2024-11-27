import java.util.Scanner;
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Vinicius Fellipe Silva
// Data atual  : 26/11/2024
public class exercicio1 {
    public static void main(String[] args){
// Seção de Declarações das variáveis 
int h = 0;
int m = 0;
int x;
int y;
Scanner LerTeclado = new Scanner(System.in);

// Seção de Comandos, procedimento, funções, operadores, etc... 
System.out.println("Digite um valor entre 1 e 24:");
h = LerTeclado.nextInt();

System.out.print("Digite um valor entre 1 e 60;");
m = LerTeclado.nextInt();

x = h*60;
y = m+x;

System.out.println("O valor é:" +y+ " minutos");

LerTeclado.close();
    }
}