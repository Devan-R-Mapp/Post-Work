
class fibSeq {
  public int fib(int n) {
    int start = 0;
    int other = 1;
    for(int i = 0; i < n; i++ ) {
      if (i % 2 == 1){
        other = other + start;
      }
      if (i % 2 == 0){
        start = other + start;
      }
    }
    if(start == 0) {
      return 0;
    } else if (n % 2 == 1) {
      return other;
    } else {
      return start;
    }
  }
}
