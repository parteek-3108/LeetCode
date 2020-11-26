class ProductOfNumbers {
ArrayList<Integer> A = new ArrayList(){{
        add(1);
    }};

    public void add(int a) {
        if (a == 0) A.clear();
        else 
            A.add(A.size() == 0 ? a : A.get(A.size() - 1)*a);
    }

    public int getProduct(int k) {
        int n = A.size();
         if (k > n) return 0;
        if (k == n) return A.get(n-1);
        return A.get(n-1)/A.get(n-1-k);
    }
}