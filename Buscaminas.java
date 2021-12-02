import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        //Scanner
        Scanner sc = new Scanner(System.in);
        //Random
        Random ra = new Random();
        //Creo el tablero
        int bm[][]= new int [8][8];

        //variables
        int cont=0, pos, cant;

        for(int i=0; i<bm.length; i++){
            for(int j=0; j<bm[i].length; j++){
                bm[i][j]=(int) (Math.random()*10);
                if(bm[i][j]>=5){
                    bm[i][j]=1;
                }else{
                    bm[i][j]=0;
                }
                cont=cont+bm[i][j];
            }
        }
        cant=cont;
        


        

        
       
        for(int i=0; i<cant;){
            int firstDigit=0;
            int secondDigit=0;
            System.out.println("Introduce la posicion que quieres descubrir");
            pos=sc.nextInt();
            String num=Integer.toString(pos);

            if(num.length()==1){
                firstDigit=0;
                secondDigit=pos;
            }
            if(num.length()==2){
                firstDigit = Integer.parseInt(Integer.toString(pos).substring(0,1));
                secondDigit = Integer.parseInt(Integer.toString(pos).substring(1));
            }





            if(bm[firstDigit][secondDigit]==1){
                System.out.println("Has encontrado 1 mina, sigue buscando!");
                i++;
            }else{
                System.out.println("Ninguna mina");
            }
        }
        System.out.println("Todas las minas encontradas, ENHORABUENA!");
        
        
    }
}
