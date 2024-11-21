// MountainArray interface definition
interface MountainArray {
    int get(int index);
    int length();
}

// Implementation of MountainArray interface
class MountainArrayImpl implements MountainArray {
    private int[] arr;

    public MountainArrayImpl(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }
}

// Main class to solve the problem
class findInMountainArrayleetcode1095 {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = findPeak(mountainArr);

        // Search in the increasing part
        int index = binarySearch(mountainArr, target, 0, peakIndex, true);
        if (index != -1) return index;

        // Search in the decreasing part
        return binarySearch(mountainArr, target, peakIndex + 1, mountainArr.length() - 1, false);
    }

    public int binarySearch(MountainArray mountainArr, int target, int low, int high, boolean ascending) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = mountainArr.get(mid);
            if (value == target) return mid;
            if (ascending) {
                if (value < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (value > target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public int findPeak(MountainArray mountainArr) {
        int low = 0, high = mountainArr.length() - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}

// Driver class to test the solution
public class MountainArrayMain {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        int target = 3;

        MountainArray mountainArr = new MountainArrayImpl(arr);
        findInMountainArrayleetcode1095 solution = new findInMountainArrayleetcode1095();

        int result = solution.findInMountainArray(target, mountainArr);
        System.out.println("Target found at index: " + result);
    }
}
