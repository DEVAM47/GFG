import java.util.*;
class Solution {
    public boolean isPower(int x, int y) {
        // code here
        if(x==1 && y!=1) return false;
        for(int i=0;i<y;i++){
            if(Math.pow(x,i)==y) return true;
            if(Math.pow(x,i)>y) return false;
        }
        return false;
    }
}