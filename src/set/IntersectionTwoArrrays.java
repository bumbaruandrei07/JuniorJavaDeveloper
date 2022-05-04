package set;
import java.util.HashSet;
import java.util.Iterator;
public class IntersectionTwoArrrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> lst = new HashSet<>();
        HashSet<Integer> lst2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            lst.add(nums1[i]);
        }
        for (int x : nums2) {
            if (lst.contains(x)) {
                lst2.add(x);
            }
        }
        int[] ans = new int[lst2.size()];
        int i = 0;
        Iterator<Integer> itr = lst2.iterator();
        while (itr.hasNext()) {
            ans[i] = itr.next();
            i++;
        }
        return ans;
    }
}
