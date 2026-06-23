class Solution {

    static class T {
        int i, c;
        long v;

        T(int i, long v, int c) {
            this.i = i;
            this.v = v;
            this.c = c;
        }
    }

    static class P {
        long v;
        int c;

        P(long v, int c) {
            this.v = v;
            this.c = c;
        }
    }

    public long maximumSum(int[] a, int m, int l, int r) {
        int n = a.length;

        long[] p = new long[n + 1];

        for (int i = 0; i < n; i++) {
            p[i + 1] = p[i] + a[i];
        }

        java.util.function.LongFunction<P> f = x -> {
            long[] d = new long[n + 1];
            int[] k = new int[n + 1];

            ArrayDeque<T> q = new ArrayDeque<>();

            for (int i = 1; i <= n; i++) {
                int j = i - l;

                if (j >= 0) {
                    long v = d[j] - p[j];
                    int c = k[j];

                    while (!q.isEmpty()) {
                        T t = q.peekLast();

                        if (v > t.v || (v == t.v && c >= t.c)) {
                            q.pollLast();
                        } else {
                            break;
                        }
                    }

                    q.addLast(new T(j, v, c));
                }

                while (!q.isEmpty() && q.peekFirst().i < i - r) {
                    q.pollFirst();
                }

                d[i] = d[i - 1];
                k[i] = k[i - 1];

                if (!q.isEmpty()) {
                    T t = q.peekFirst();

                    long v = t.v + p[i] - x;
                    int c = t.c + 1;

                    if (v > d[i] || (v == d[i] && c > k[i])) {
                        d[i] = v;
                        k[i] = c;
                    }
                }
            }

            return new P(d[n], k[n]);
        };

        java.util.function.LongSupplier b = () -> {
            long v = Long.MIN_VALUE;

            ArrayDeque<Integer> q = new ArrayDeque<>();

            for (int i = 1; i <= n; i++) {
                int j = i - l;

                if (j >= 0) {
                    while (!q.isEmpty() && p[q.peekLast()] >= p[j]) {
                        q.pollLast();
                    }

                    q.addLast(j);
                }

                while (!q.isEmpty() && q.peekFirst() < i - r) {
                    q.pollFirst();
                }

                if (!q.isEmpty()) {
                    v = Math.max(v, p[i] - p[q.peekFirst()]);
                }
            }

            return v;
        };

        P t = f.apply(0L);

        if (t.c == 0) {
            return b.getAsLong();
        }

        if (t.c <= m) {
            return t.v;
        }

        long s = 0;
        long e = 1_000_000_000_000_000L;

        for (; s < e;) {
            long x = (s + e + 1) >>> 1;

            if (f.apply(x).c >= m) {
                s = x;
            } else {
                e = x - 1;
            }
        }

        P z = f.apply(s);

        return z.v + s * m;
    }
}