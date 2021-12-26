package 动态规划;

/**
 * @desc: todo review2
 * @author: CuiShiHao
 **/
public class q70_爬楼梯 {
    public int climbStairs(int n) {
        if (n < 3) return n;
        int n1 = 1;
        int n2 = 2;
        int n3 = n1 + n2;
        //模拟动态推导
        for (int i = 3; i < n; i++) {
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        return n3;
    }
}
