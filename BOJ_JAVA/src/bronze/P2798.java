package BOJ_JAVA.src.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
//        System.out.print("arr: ");
//        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
//        System.out.print("arr: ");
//        System.out.println(Arrays.toString(arr));
        int answer = 0;
        int sum = 0;
        for(int i = 0; i < N-2; i++) {
            if(arr[i] > M)
                break;
            for(int j = i + 1; j < N-1; j++){
                if(arr[i] + arr[j] > M)
                    break;
                for(int k = j+1; k < N; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum > answer && sum <= M)
                        answer = sum;
                    else if(sum > M)
                        break;
//                    System.out.println("answer: " + answer);
                }
            }
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
