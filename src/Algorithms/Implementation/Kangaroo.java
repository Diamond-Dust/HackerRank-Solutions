package Algorithms.Implementation;

//start-condition - x1<x2
//end-condition(NO) - v1<=v2 x1>x2
//end-condition(YES) - x1==x2
public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String res = "YES";

        if (v1 <= v2) res = "NO";
        else {
            while (true) {
                x1 += v1;
                x2 += v2;
                if (x1 == x2) break;
                else if (x1 > x2) {
                    res = "NO";
                    break;
                }
            }
        }
        return res;
    }

    /*Un comment to send mock data to check the answer
    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
    }*/
}

