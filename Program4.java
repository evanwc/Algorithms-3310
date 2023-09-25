import java.lang.*;

public class Program4 {
    public static void main(String[] args) {
        int[][] A = {
            {0, 1, 1, 0, 0, 0, 1, 0, 0, 0}, //start 0
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, //1 A
            {0, 0, 0, 0, 1, 1, 0, 0, 0, 0}, //2 B
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0}, //3 C
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0}, //4 D
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, //5 E
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, //6 F
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //7 G
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //8 H
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}  //end 9
        };

        int[] TS = {0, 1, 2, 6, 3, 4, 5, 7, 8, 9};

        int[] T = {0, 6, 4, 3, 4, 3, 10, 3, 2, 0};

        critPathM2(TS, A, T);

    }

    public static void critPathM2(int[] TS, int[][] A, int T[]) {
        int size = TS.length;
        int[] ES = new int[size], EF = new int[size], LS = new int[size], LF = new int[size];

        //nested loop for earliest start time ES
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (A[TS[j]][i] == 1) {
                    int temp = Math.max(T[TS[j]], T[TS[j]] + ES[TS[j]]);
                    if (ES[i] < temp) {
                        ES[i] = temp;
                    }
                }
            }
        }
        
        //nested loop for earliest finish time EF
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (A[TS[j]][i] == 1) {
                    int temp = Math.max(T[i], T[i] + EF[TS[j]]);
                    if (EF[i] < temp) {
                        EF[i] = temp;
                    }
                }
            }
        }

        //nested loop for latest finish time LF
        LF[size - 1] = EF[size - 1];
        for (int i = size - 1; i >= 0; i--) {
            for (int j = size - 1; j >= 0; j--) {
                if (A[TS[j]][i] == 1) {
                    LF[TS[j]] = LF[i] - T[i];
                }
            }
        }
        
        //loop for latest start time LS
        for (int i = size - 1; i >= 0; i--) {
            LS[i] = LF[i] - T[i];
        }

        for (int i = 0; i < size; i++) {
            if(ES[i] == LS[i] && EF[i] == LF[i]) {
                System.out.println("Critical task number: " + i);
            }
        }
    }
}
