import java.lang.Package;

public class Program1 {
    public static void main(String[] args) {
        //arrays range -10,000 to 10,000
        //size 10 random array
        int[] array1 = {-4625, -790, 3159, 8497, 642, -8099, 5181, 9087, 7204, -435};
        //size 100 random array
        int[] array2 = {-9390, -7225, 7229, 381, 2561, -2593, 5076, -9704, -5711, -9115, 
                        -8182, 7797, 2900, 4393, -9302, 3403, -5684, 5388, 346, -807, 
                        4841, -1462, 326, -7491, 9322, -5976, -6599, -8713, 3432, -309, 
                        3954, 9936, -3655, -9822, -1692, -6490, -9392, -4886, -7341, -2135, 
                        8141, -1021, -3360, -6607, 5786, -2846, 1315, -3000, 8781, 2810, 
                        5308, -7740, 4032, -3296, -6750, -9649, -2711, -1763, -6791, -9695, //44 to 59 = -26209
                        9154, 7953, 4216, -1657, 1071, 8875, -332, 1276, -2134, 5892, 
                        -1706, 8485, -3486, 3328, -8677, 8012, 4071, -762, -3161, -6291, 
                        1725, -8720, 2014, 5309, -8653, 3466, 4181, 8136, -8457, -4756,   //60 to 97 = 48597
                        4969, -3562, 9619, -2458, -7306, 1264, 8080, 9619, -3922, -4228};
        //size 1000 random array
        int[] array3 = {2668, -8972, -1041, 5658, 4980, -7400, 7682, 433, 3534, -1036, -7513, -3595, -8614, 632, 344, 1495, -1613, -8518, -1536, -5680, -4325, 8577, 2119, -464, -9368, 2252, 5639, -5922, 57, 8047, 33, 9805, -6273, -2859, 8924, -7406, -6607, 7678, 6261, -7319, 2767, 3402, -9724, -5417, 1210, 7603, -9147, -209, 4729, -9747, -9153, 3326, 5590, -9086, -8032, -4644, 8392, -7060, -4299, 4584, -2376, 5297, 472, -8979, 227, 7256, -7463, -8946, -3683, 194, 7782, -140, 5036, -2115, 4017, 3867, 8473, -7303, -8789, -2187, 3106, 8483, 8375, 3583, 8796, 2463, -6690, 7762, 6144, 3025, -5863, -6776, 5593, -3928, 5319, -5422, 565, 9523, -4729, -1249, -4568, -9565, -6207, 4031, -676, 3375, 5697, 4781, -1046, -138, -5404, 2550, 8222, -7189, -8759, 9976, 800, -9969, 4525, -2945, 1330, -5390, -4730, -9854, 2934, -9923, -5084, 8952, 4241, -7162, -3386, 1531, -1881, -6164, 6344, 3295, -7629, -5383, -7288, -8738, 1892, 6227, -7199, -2004, -4418, -5222, 9031, 7404, -8756, -1217, 5287, -3411, -7151, 8331, 1772, -1668, 2916, 5593, 2104, -5615, 2699, -5329, -705, 6988, 5283, -3287, -5007, 2381, -6322, -3590, 658, -8544, 8459, 3371, -107, -4659, 5919, -1184, 6279, 7107, 4306, 1572, -2514, 6044, -4395, 4267, -560, -5330, 4609, -6558, 4164, -7693, 2422, -3278, -9614, 6445, -749, 6365, 8637, -6729, -4523, 3296, 4624, -2228, -3983, 9722, -1024, 3809, 6866, -470, 1657, 7560, 546, 6396, -3583, -4345, 5627, 9791, -711, -3619, 9185, 9330, -9767, 2302, 6259, -4244, -8164, -9610, 9737, -5145, -3500, -7994, -2487, -9477, -6620, 3072, -5596, 8639, 5550, -4885, 8385, -1466, -577, 1658, 3754, -5572, 2494, 235, 3118, -8366, -9391, -5340, 6504, 4619, -2004, 6174, -132, 2566, 2206, 8020, -4467, -8395, 6634, -3201, 2776, -4908, -2383, 6449, 9589, -407, 5758, -5321, -9898, 7573, 3390, 6765, -7451, -7897, -1091, -1404, -3860, 2988, 2867, 9940, -5462, -625, 846, -2510, -6588, -9401, -4801, 5648, 7527, -7315, -3847, 2681, -5637, 4831, 3206, -3925, -3972, -4705, -6486, 8816, 636, -7297, 3281, -7170, 7291, 9143, 4218, -6726, 2982, 8900, -5215, 8697, 8844, -4020, 2276, 2409, -5078, -9461, -4331, -279, -9613, -9018, 4920, -6682, 5302, 5269, 7023, 6023, -5916, 3912, 3485, 6727, 4752, 3824, 4913, 8634, -9967, -5886, 9803, 9274, 4227, -1329, -4333, -8134, 3509, 7867, -3550, 2373, -7250, -8787, 483, 5306, -7679, 7021, -3022, 1681, 5958, 2396, -3435, 117, 9135, -8985, -6426, -2264, -9327, 5296, 6007, -3396, -3214, 1977, -7980, 5401, -2373, -3850, 2797, 4890, -4044, -997, 6031, -9808, 317, -3766, 8011, 8796, -4973, 2200, -8720, 1723, 8191, 8420, -6885, 4014, 5511, 1295, 2707, -7452, 3010, 6364, -200, 1087, 446, -6229, 2970, -9300, -2659, -3463, 1713, 2538, 6283, 8878, -4818, -7564, -7955, -8424, -1659, -155, -1857, 6290, -8196, -8602, 8996, 6459, -5738, -6102, -2522, -3285, 8069, 9805, -3295, 2099, -9251, -6242, -2355, 228, -5157, 6435, -2745, 7513, 4044, -3764, 7392, -437, 3255, 4114, 1150, 4368, 5760, 7274, -5001, -1005, 6737, 740, -8967, 8062, -110, 5655, -2898, 8483, 6054, -7333, 7738, 5154, 0, 2901, -6374, -792, -7022, 4494, 7827, 8387, 5518, -5878, -1311, 9025, -5714, 8769, -6632, 6301, -6105, 8076, 1470, -9906, 9625, 8178, 3648, -9688, -7945, 3882, 1144, 8334, -8539, 6489, 9848, -7732, 7367, 6636, -8484, -2538, -3102, -6620, -2095, 8349, -9620, 8790, -8857, 7179, 2244, -7834, 6802, -4572, 4182, -2106, 4216, 8763, 3951, 2389, 187, -7697, 7428, -537, -1165, -3299, -8713, 18, 7921, 2075, -2037, -526, 9276, -6786, -8955, -1315, 8077, 8127, 5134, -7335, -715, -9474, 7249, -6039, -2072, -6713, 1057, -1546, 598, 7011, -3478, 3843, 7942, 7209, 7886, 4858, -2223, 712, -7833, 9482, 6657, 5851, 8228, -3354, 32, -6538, 5267, 3102, 4529, -9737, 7166, -6656, 3977, -4312, -7986, 2557, -3982, -3028, -631, -5013, 9709, 7624, 8135, 9214, -547, -4316, -7945, -4129, -385, -2804, 6405, -3460, 974, 9034, 6279, -508, 746, 7477, 3152, -1008, 2280, -2930, 6371, 6551, 4223, 3778, -8307, 6148, 1762, -6668, 6935, -5344, 5108, 3542, 6012, -7512, -5813, -862, 3697, 9430, -1342, 126, -591, 7438, -9905, 1750, 1328, 3659, -7033, 290, 9282, -2636, 5413, 4359, 7702, -1211, -5014, -5814, -32, 6775, -6663, 4214, 2802, 1504, -7366, 9076, -1300, 7326, -1595, -4709, -5405, -192, 6427, 1549, 3478, -8640, -9588, 1284, 1076, -765, 7796, 5977, 3067, -759, -2932, -3126, 4936, 7353, 1132, -5295, -6212, 3940, -3635, 8209, -259, -6056, -9040, -1894, 7722, -9324, -2227, -4689, 6566, 6063, -6273, -4155, -6832, 1231, -8358, -3737, -5605, -4035, 9962, 7800, 9075, 9097, 2342, -4870, 4058, -1778, 1507, 3093, 4851, -1745, 6861, 1458, 12, -7547, 3531, -1264, -1666, 3211, 2620, 664, 6230, -7734, 5418, 571, 3230, 1890, -571, -5928, 1757, -5473, -1172, 6090, -5802, -6848, -7853, 8444, 8518, 965, 9246, -2085, 6319, 1078, -257, 598, 7826, -2927, -9603, -9549, 5754, -2121, 5077, -6708, -6852, 9070, -9151, -5454, -9439, 8540, 1603, 150, 9499, 9403, 8569, 7864, -9599, 1176, 2988, 4416, 2372, 2340, 9695, 9724, -1907, -2464, 877, 2284, 4692, 7154, 4799, -1665, -4853, 5865, 2259, -4442, -8478, 8653, 2097, -8553, -4886, -4932, 6059, 6946, -3171, -315, 600, -3372, -8580, 9707, -3821, 1787, 4231, -4138, -9346, 435, 4077, 5276, -107, 6425, 2359, 4028, -4820, 1586, -9424, -3219, -643, 639, 8115, -113, 6898, -7191, 6105, 3626, 5342, -1662, 1153, 40, -134, -1871, -1233, 6576, -3168, -9102, 5999, 6175, -5608, 9618, 2129, -8730, -2692, 2200, -6596, 9967, 106, -3791, -3783, -7646, -4091, 4933, 2988, -1836, -9996, -5722, -5076, 2791, 789, 9438, -1512, 358, 1509, -160, 3308, -6694, 3729, -9627, -5516, 4725, 699, -9328, 6292, 254, -5203, -5209, 9180, 8940, -7519, -3800, 4437, 4866, 1981, 3178, -1094, 5319, -2389, 2398, 1427, 7425, 5677, -4664, 1574, 4849, 3832, -4863, -3199, 3951, -5899, -1874, -1747, -2964, -5608, 1853, -2539, 1259, 5255, 3414, -1456, -672, -2875, 2233, -868, 2797, 8399, 7001, 9458, 6591, 9834, 9590, 3985, 338, -7990, -5990, 5465, -6072, -4362, 9751, 4092, 6319, 7110, 1545, -4297, -2511, -4897, 4701, -6737, -1948, -6362, -7856, -6068, 8523, -3526, 3333, -7778, -7545, 6452, 219, 7061, -8263, -2141, 3274, -2875, -2139, -3857, -2357, 8990, -275, 8160, 6182, -5684, -1142, -1894, 8787, -3102, 6619, -35, -740, -4184, -385, 8882, -2674, 2992, 1363, -8243, 1699, 527, 9349, 3881, -1788, 8675, -7785, -7276, 5652, -1820, 1973, -8743, 637, -2827, 5743, -1659, -59, -6745, -3220, 6553, 2842, 6179, 531, 3056, -9809, 4304, 397, -8197, 7592, -4147, 8694, 3400, 8774, -9313, -6534};
        
        MaximumSum test = new MaximumSum();

        //testing algorithm 1 on all 3 arrays + CPU time
            System.out.println("\nAlgorithm 1: ");
            long Start = System.nanoTime();
        System.out.println(test.algorithm1(array1));
        System.out.println(test.algorithm1(array2));
        System.out.println(test.algorithm1(array3));
            long End = System.nanoTime();
            System.out.print("Processing time for 3 arrays: ");
            System.out.println(End - Start);

        //testing algorithm 2 on all 3 arrays + CPU time
            System.out.println("\nAlgorithm 2: ");    
            Start = System.nanoTime();
        System.out.println(test.algorithm2(array1));
        System.out.println(test.algorithm2(array2));
        System.out.println(test.algorithm2(array3));
            End = System.nanoTime();
            System.out.print("Processing time for 3 arrays: ");
            System.out.println(End - Start);
    
        //testing algorithm 3 on all 3 arrays + CPU time
        System.out.println("\nAlgorithm 3: ");    
            Output result3 = new Output();
            Start = System.nanoTime();
        test.algorithm3(array1, 0, 9, result3);
            System.out.println(result3);
        test.algorithm3(array2, 0, 99, result3);
            System.out.println(result3);
        test.algorithm3(array3, 0, 999, result3);
            System.out.println(result3);
            End = System.nanoTime();
            System.out.print("Processing time for 3 arrays: ");
            System.out.println(End - Start);
            System.out.println("          *not sure why the minimum for array 2 is incorrect");

        //testing algorithm 4 on all 3 arrays + CPU time
            System.out.println("\nAlgorithm 4: ");
            Start = System.nanoTime();
        System.out.println(test.algorithm4(array1));
        System.out.println(test.algorithm4(array2));
        System.out.println(test.algorithm4(array3));
            End = System.nanoTime();
            System.out.print("Processing time for 3 arrays: ");
            System.out.println(End - Start);
    }
}

//data type that contains the 3 values
class Output {
    protected int minIndex;
    protected int maxIndex;
    protected int sum;

    public Output() {
        minIndex = Integer.MAX_VALUE;
        maxIndex = Integer.MIN_VALUE;
        sum = Integer.MIN_VALUE;
    }

    public String toString() {
        return ("     min: " + minIndex + ", max: " + maxIndex + ", largest subsequent sum: " + sum);
    }
}

//algorithms calculating maximum subsequent sum
class MaximumSum {
    
    //first algorithm, using 3 nested loops
    Output algorithm1(int[] arr) {
        Output result1 = new Output();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int thisSum = 0;

                for (int k = i; k <= j; k++) 
                    thisSum += arr[k];
                
                if (thisSum > result1.sum) {
                    result1.sum = thisSum;
                    result1.minIndex = i;
                    result1.maxIndex = j;
                }
            }
        }
        return result1;
    }

    //second algorithm, using 2 nested loops
    Output algorithm2(int[] arr) {
        Output result2 = new Output();
        for (int i = 0; i < arr.length; i++) {
            int thisSum = 0;
            for (int j = i; j < arr.length; j++) {
                thisSum += arr[j];
                
                if (thisSum > result2.sum) {
                    result2.sum = thisSum;
                    result2.minIndex = i;
                    result2.maxIndex = j;
                }
            }
        }
        return result2;
    }

    //third algorithm, using recursion
    int algorithm3(int[] arr, int left, int right, Output result3) {
        if (left == right) return arr[left];

        int center = (left + right) / 2;
        int maxLeftSum = algorithm3(arr, left, center, result3);
        int maxRightSum = algorithm3(arr, center + 1, right, result3);

        int maxLeftBorder = Integer.MIN_VALUE, leftBorder = 0;
        for (int i = center; i >= left; i--) {
            leftBorder += arr[i];
            if (leftBorder > maxLeftBorder) {
                maxLeftBorder = leftBorder;
                result3.minIndex = i;
            }
        }

        int maxRightBorder = Integer.MIN_VALUE, rightBorder = 0;
        for (int j = center + 1; j <= right; j++) {
            rightBorder += arr[j];
            if (rightBorder > maxRightBorder) {
                maxRightBorder = rightBorder;
                result3.maxIndex = j;
            }
        }

        int maxCenter = maxLeftBorder + maxRightBorder;
        if (maxLeftSum > maxCenter && maxLeftSum > maxRightSum) return result3.sum = maxLeftSum;
        if (maxRightSum > maxCenter && maxRightSum > maxLeftSum) return result3.sum = maxRightSum;
        else return result3.sum = maxCenter;
    }

    //fourth algorithm, using 2 disjoint loops
    Output algorithm4(int[] arr) {
        Output result4 = new Output();
        int[] MS = new int[arr.length];
        MS[0] = arr[0];
        result4.minIndex = 0;
        result4.sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int value = (MS[i - 1] + arr[i]);
            if (value > arr[i]) {
                MS[i] = value;
            }
            else {
                MS[i] = arr[i];
                result4.minIndex = i;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (result4.sum < MS[j]) {
                result4.sum = MS[j];
                result4.maxIndex = j;
            }
        }

        return result4;
    }

}