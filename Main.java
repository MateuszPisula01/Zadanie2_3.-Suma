import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner in= new Scanner(System.in);
    
  System.out.println( "Podaj pierwszą liczbe calkowita");
   int liczba1=in.nextInt();
    System.out.println( "Podaj druga liczbe calkowita");
    int liczba2=in.nextInt();
      int Suma=liczba1+liczba2 ;
    System.out.println(" Suma liczb "+ liczba1 + " i "+ liczba2 +" jest rowna " + Suma );
    //System.out.println(Suma);
  }
}