public class Task1_5 {
    public static void main(String[] args) {
        String[] fruits = {"みかん","りんご","ぶどう","メロン"};
        for (int i = 0 ; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
       
       
       1から10まで出力する
        int i = 1;
        while(i <= 100) {
          System.out.print(i);
          i++;
        }
        System.out.println();
        
        
        
        
        for (int a = 1; a <= 9; a++){
            System.out.print( a + "||");
            for (int b = 1; b <= 9; b++){
                System.out.print(+(a * b)+"|" + "");
            }
            System.out.println();
        }
    }

}