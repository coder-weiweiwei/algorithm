package algorithm;

/**
 * 给定一个数组，里面只有两个数出现了奇数次，其他均出现偶数次数，求这个两个出现了奇数次数的数字
 */
public class EorDemo {
    public static void main(String[] args) {
        Integer[] arr = {2,12,12,14,1,14,15,15,16,16};
        findByEor(arr);
    }

    public static void findByEor(Integer[] arr){
        /**
         * 第一步：将数组所有数组相异或，最终的结果就是a^b
         */
        Integer eor = 0;
        // 所有元素进行异或，最终的值位a^b
        for(Integer num: arr){
            eor ^= num;
        }

        /**
         * 第二部：
         *  1） 由于a != b  ->  a >b != 0
         *  2）由于a^b = eor !=0, a的n位和b的n位一定一个为1,一个为0
         *  3）筛选出最右`边为1的那一位,得到c
         */
        // 找eor最右边为1
        int rightOne = eor&(~eor+1);


        /**
         * 第三步：
         * 1）将数组中所有元素和c相与，如果相与的结果位0则与eor2进行异或
         * 2）最终的eor2就是a或者b
         * 3）通过eor2^eor得到另外一个数
         */
        int eor2 = 0;

        for(Integer num: arr){
            if((num&rightOne) == 0){
                eor2 ^= num;
            }
        }

        System.out.println("其中一:"+eor2+"另外一个："+(eor^eor2));
    }
}
