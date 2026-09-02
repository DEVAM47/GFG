class Solution {
    static int nthEvenFibonacci(int n) {
      long a=0;
      long b=2;
      for(int i=2;i<=n;i++){
          long c=4*b+a;
          a=b;
          b=c;
          
      }
      return (int)b;
    }
}