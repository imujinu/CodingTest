package com.jw.java.board.June.TwentThree;

import java.util.Comparator;

public class ShortRagne {
    class Node implements Comparable<Node> {
        int node;
        int range;
        Node(int node, int range){
            this.node = node;
            this.range=range;
        }

        @Override
        public int compareTo(Node o) {
            return this.range-o.range;
        }
    }
    public static void main(String[] args) {

    }
}
