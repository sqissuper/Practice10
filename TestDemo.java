package main;

import java.util.*;

public class TestDemo {
    //返回数组中第三大的数
//    public static int thirdMax(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
//        Object[] arr = set.toArray();
//        int n = arr.length;
//        if(n <= 2) return (int) arr[n - 1];
//        return (int) arr[n - 3];
//    }
//    public static int thirdMax(int[] nums) {
//        Arrays.sort(nums);
//        int count = 1;
//        for (int i = nums.length - 1; i > 0 ; i--) {
//            if(nums[i] != nums[i - 1]) {
//                count++;
//            }
//            if(count == 3) {
//                return nums[i - 1];
//            }
//        }
//        return nums[nums.length - 1];
//    }


    //从尾到头打印链表
//    public int size(ListNode head) {
//        ListNode cur = head;
//        int count = 0;
//        while(cur != null) {
//            count++;
//            cur = cur.next;
//        }
//        return count;
//    }
//    public int[] reversePrint(ListNode head) {
//        int n = size(head);
//        int[] ret = new int[n];
//        int i = n - 1;
//        ListNode cur = head;
//        while(cur != null) {
//            ret[i--] = cur.val;
//            cur = cur.next;
//        }
//        return ret;
//    }
//    public static String addBinary(String a, String b) {
//        int x = 0,y = 0;
//        int j = 0,k = 0;
//        for(int i = a.length() - 1; i >= 0; i--) {
//            int ret = (int) (Integer.parseInt(a.charAt(i) + "")*Math.pow(2,j++));
//            x += ret;
//        }
//        for(int i = b.length() - 1; i >= 0; i--) {
//            int ret = (int) (Integer.parseInt(b.charAt(i) + "")*Math.pow(2,k++));
//            y += ret;
//        }
//        int z = x + y;
//        String s = "";
//        if(z != 0) {
//
//            while (z != 0) {
//                s += z % 2;
//                z /= 2;
//            }
//            String ret = "";
//            for (int i = s.length() - 1; i >= 0 ; i--) {
//                ret += s.charAt(i);
//            }
//            return ret;
//        }
//        return s + 0;
//    }


    //在排序数组中查找元素的第一个和最后一个位置
//    public static int[] searchRange(int[] nums, int target) {
//        int left = 0,right = nums.length - 1,mid;
//        while(left <= right) {
//            mid = (left + right) / 2;
//            if(target > nums[mid]) {
//                left = mid + 1;
//            } else if(target < nums[mid]) {
//                right = mid - 1;
//            } else {
//                while(nums[left] != target) left++;
//                while(nums[right] != target) right--;
//                return new int[]{left,right};
//            }
//        }
//        return new int[]{-1,-1};
//    }

//    public static int[] searchRange(int[] nums, int target) {
//        int n = nums.length;
//        String s = "";
//        for (int i = 0; i < nums.length; i++) {
//            s += Integer.toString(nums[i]);
//        }
//        int[] ret = new int[2];
//        int a = s.indexOf(Integer.toString(target));
//        int b = s.lastIndexOf(Integer.toString(target));
//        ret[0] = a;
//        ret[1] = b;
//        return ret;
//    }

//    public static boolean isPalindrome(String s) {
//        int n = s.length();
//        if(n == 0) return true;
//        s = s.toLowerCase();
//        String str = "";
//        for(int i = 0; i < n; i++) {
//            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
//                str += s.charAt(i);
//            }
//        }
//        char[] ch = str.toCharArray();
//        int l = 0,r = ch.length - 1;
//        while(l <= r) {
//            if(ch[l] != ch[r]) {
//                return false;
//            }
//            l++;
//            r--;
//        }
//        return true;
//    }
//

    //统计一致字符串的数目
//public static int countConsistentStrings(String allowed, String[] words) {
//    int count = words.length;
//    for(String s : words) {
//        boolean flag = false;
//        for(int i = 0; i < s.length(); i++) {
//            if(!allowed.contains(s.charAt(i) + "")) {
//                flag = true;
//                break;
//            }
//        }
//        if(flag) {
//            count--;
//        }
//    }
//    return count;
//}

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        System.out.println(Math.cos(45));
        List<Integer> list = new ArrayList<>();
        String s;

//        String allowed = "ab";
//        String[] words = {"ad","bd","aaab","baa","badab"};
//        System.out.println(countConsistentStrings(allowed, words));


//        String s = "OP";
//        System.out.println(isPalindrome(s));
////        int num = 10;
////        System.out.println(test(num));
//        int[] nums = {5,7,7,8,8,10};
//        int target = 8;
//        int[] ret = searchRange(nums,target);
//        System.out.println(Arrays.toString(ret));
//        String a = "100";
//        String b = "100";
//        String s = addBinary(a,b);
//        String s = "";
//        for (int i = 0; i < 5; i++) {
//            s += i;
//        }
//        System.out.println(s);
//        int a = Integer.parseInt(s);
//        System.out.println(a);
//        int[] nums = {3,2,1};
//        System.out.println(thirdMax(nums));
    }


}
