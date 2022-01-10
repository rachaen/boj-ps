package BOJ_JAVA.src.silver5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] nums = new int[L];
        for(int i = 0; i < L; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        int N = Integer.parseInt(br.readLine());

        int start = 1;
        int end = 1000;
        int answer = 0;

        if(N < nums[0]) {
            end = nums[0]-1;
        } else if( N > nums[nums.length-1]) {
            start = nums[nums.length-1] + 1;
        }

        for(int i = 0; i < L - 1; i++) {
           if(N > nums[i] && N < nums[i+1]) {
                start = nums[i]+1;
                end = nums[i+1]-1;
                break;
            } else if (N == nums[i] || N == nums[i+1]){
                answer = 0;
                bw.write(answer + "\n");
                bw.flush();
                bw.close();
                br.close();
                return;
            }
        }

        for(int i = start; i <= N; i++) {
            if(i == N) {
                answer+= end-N;
            } else {
                answer += end-N+1;
            }
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
