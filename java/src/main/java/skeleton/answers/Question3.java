package skeleton.answers;

public class Question3 {

    public static int printMode(int a[], int n) {
       int max = Arrays.stream(a).max().getAsInt();
        int t = max + 1;
        int[] count = new int[t];
        for (int i = 0; i < t; i++){
            count[i] = 0;
        }
        for (int i = 0; i < n; i++){
            count[a[i]]++;
        }
        int mode = 0;
        int k = count[0];
        for (int i = 1; i < t; i++){
            if (count[i] >= k && i > mode){
                k = count[i];
                mode = i;
            }
        }
        return mode;
    }

    public static int whereDidIFinish(int[] scores, int[] alice) {
        // TODO Auto-generated method stub
        int n = scores.length;
        int m = alice.length;
        int count[];
        count = new int[m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(score[j] >=alice[i]){
                    count[i]++;
                }
            }
        }
        printMode(count,m);
    }
}
