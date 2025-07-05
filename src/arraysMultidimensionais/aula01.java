package arraysMultidimensionais;

public class aula01 {
    public static void main(String[] args) {
        //um array dentro de outro array

        //1,2,3,4,5 Meses
        //31,28,31,30 dias
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 32;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 32;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 32;


        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

    /*        for (int[] arr:dias){
          for (int num:dias){
              System.out.println(num);
          }
        };


    */

    }
}
