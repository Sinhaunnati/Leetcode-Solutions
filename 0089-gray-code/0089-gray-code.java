class Solution {
    public List<Integer> grayCode(int n) {
        if (n == 1) {
            List<Integer> bres = new ArrayList<>();
            bres.add(0);
            bres.add(1);
            return bres;
        }

        List<Integer> rres = grayCode(n - 1);
        List<Integer> mres = new ArrayList<>();

        for (int i = 0; i < rres.size(); i++) {
            int rval = rres.get(i);
            mres.add(rval);
        }

        int addend = 1 << (n - 1);
        for (int i = rres.size() - 1; i >= 0; i--) {
            int rval = rres.get(i);
            mres.add(rval | addend);
        }

        return mres;
    }
}