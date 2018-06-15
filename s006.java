import java.util.Scanner;

public class s006 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("幾組資訊\n半徑\n長\n寬\n上底\n下底\n三角形邊\n三角形另一邊\n角度");
        int x = scn.nextInt();
       s005 Area[]=new s005[x];
        for(int i = 0;i<x;i++){
           Area[i] = new s005(scn.nextInt(),scn.nextInt(),scn.nextInt(),scn.nextInt(),scn.nextInt(),scn.nextInt(),scn.nextInt(),scn.nextInt());
          Area[i].show();
                 if (i==x){
             System.out.println(Area[x].getCount());
          }
       }




    }
}







// for(int i = 0;i<x;i++){
//   Area[x] = new s005(scn.nextDouble(), scn.nextDouble(),scn.nextDouble(),scn.nextDouble(),scn.nextDouble(),scn.nextDouble(),scn.nextInt(),scn.nextInt());
// Area[i].show();
//if (i==x){
//  System.out.println("0:離開\n+1:某人總成績+\n+");
//}
//}
