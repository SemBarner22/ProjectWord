package com.company;

import java.util.*;
import java.io.*;

public class Bohr {
    FastScanner in;
    //PrintWriter out;

    static int k = 1000;
    static Node root;

    public Bohr() throws FileNotFoundException {
        //new FastScanner();
    }

    public void solve() {
        int n = in.nextInt();
        root = new Node();
        for (int i = 0; i < n; i++) {
           // if (in.next().toLowerCase().compareTo("+") == 0) {
                add(in.next());
           /* } else {
                if (contains(in.next().toLowerCase())) {
                    //out.println("YES");
                } else {
                    //out.println("NO");
                }
            }*/
        }
    }

    public boolean contains(String s) {
        Node cur = root;
        for (int i = 0; i < s.length(); i++) {
            if (cur.next[f(s.charAt(i))] == null) {
                return false;
            }
            cur = cur.next[f(s.charAt(i))];
        }
        return cur.t;
    }

    public void add(String s) {
        Node cur = root;
        for (int i = 0; i < s.length(); i++) {
            if (cur.next[f(s.charAt(i))] == null) {
                cur.next[f(s.charAt(i))] = new Node();
            }
            cur = cur.next[f(s.charAt(i))];
        }
        cur.t = true;
    }

    public int f(char x) {
        if (x >= 'a' && x <= 'z')
            return x - 'a';
        else
            return x - 'a' + 333;
    }

    class Node {
        boolean t;
        Node next[];

        public Node() {
            super();
            this.t = false;
            this.next = new Node[k];
        }
    }

    public void run() throws FileNotFoundException {
        in = new FastScanner();
        //out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        solve();
        //out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() throws FileNotFoundException {
            //br = new BufferedReader(new InputStreamReader(System.in));
            br = new BufferedReader(new InputStreamReader(new FileInputStream("20k.txt")));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

}