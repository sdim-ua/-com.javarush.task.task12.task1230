
/* 
Попадание в десятку
*/

public class Solution {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }
    
    @Override
    public static int transformValue(int i) {
        return i * 2;
    }
}
