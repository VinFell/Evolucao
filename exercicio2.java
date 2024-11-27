import java.util.Scanner;
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   :
// Autor(a)    : Vinicius Fellipe Silva
// Data atual  : 26/11/2024
public class exercicio2 {
        public static void main(String[] args){
// Seção de Declarações das variáveis 
int he;
int me;
int ms;
int hs;
int totalh;
int totalm;
Scanner LerTeclado = new Scanner(System.in);
// Seção de Comandos, procedimento, funções, operadores, etc... 
System.out.println("Qual foi a hora de entrada?");
he = LerTeclado.nextInt();

System.out.println("Qual foi o minuto de entrada?");
me = LerTeclado.nextInt();

System.out.println("Qual foi hora de saida?");
hs = LerTeclado.nextInt();

System.out.println("Qual foi o minuto de saida?");
ms = LerTeclado.nextInt();

totalh = hs-he;
totalm = ms-me;


System.out.println("O funcinario ficou na empresa durante "+totalh+"horas e "+totalm+"minutos");

LerTeclado.close();
        }
}
