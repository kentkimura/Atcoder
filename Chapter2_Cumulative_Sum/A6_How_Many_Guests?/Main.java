import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // N, Qを入力
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        // Aの入力
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }

        // 累積和配列Sを計算
        int[] S = new int[N+1];
        for(int i = 1; i <= N; i++){
            S[i] = S[i - 1] + A[i - 1];
        }

        // 各質問に対して計算を行う
        for(int i = 0; i < Q; i++){  // ここを修正
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            // 累積和を使って範囲合計を計算
            int result = S[R] - S[L - 1];
            System.out.println(result);
        }
        scanner.close();
    }
}