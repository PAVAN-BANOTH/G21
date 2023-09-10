package com.pavan.it.java;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode prev;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class Pipeline {
    private ListNode head;
    private ListNode tail;
    private List<Integer> removedElements;

    public Pipeline() {
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
        removedElements = new ArrayList<>();
    }

    public void insert(int n) {
        ListNode node = new ListNode(n);
        ListNode nextNode = tail.prev;
        node.prev = nextNode;
        node.next = tail;
        tail.prev = node;
        nextNode.next = node;
    }

    public void removeMostFrequent() {
        ListNode current = head.next;
        int maxFreq = 0;
        ListNode mostFreqNode = null;

        while (current != tail) {
            int freq = 0;
            ListNode temp = current;
            while (temp != tail) {
                if (temp.val == current.val) {
                    freq++;
                }
                temp = temp.next;
            }

            if (freq >= maxFreq) {
                maxFreq = freq;
                mostFreqNode = current;
            }

            current = current.next;
        }

        int val = mostFreqNode.val;
        removedElements.add(val);

        ListNode prevNode = mostFreqNode.prev;
        ListNode nextNode = mostFreqNode.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public List<Integer> getRemovedElements() {
        return removedElements;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        StringBuilder inputData = new StringBuilder();
        String thisLine;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((thisLine = br.readLine()) != null) {
            inputData.append(thisLine).append("\n");
        }
        // Output the solution to the console
        System.out.println(codeHere(inputData));
    }

    public static String codeHere(StringBuilder inputData) {
        Pipeline pipeline = new Pipeline();
        String[] queries = inputData.toString().split("\n");
        StringBuilder result = new StringBuilder();

        for (String query : queries) {
            String[] parts = query.split(" ");
            int X = Integer.parseInt(parts[0]);
            int N = Integer.parseInt(parts[1]);

            if (X == 1) {
                pipeline.insert(N);
            } else if (X == 2) {
                pipeline.removeMostFrequent();
            }
        }

        List<Integer> removedElements = pipeline.getRemovedElements();
        for (int val : removedElements) {
            result.append(val).append(" ");
        }

        return result.toString().trim();
    }
}
