class MedianFinder {

    // Left half 
    PriorityQueue<Integer> left;

    // Right half 
    PriorityQueue<Integer> right;

    public MedianFinder() {

        left = new PriorityQueue<>(
            Collections.reverseOrder()
        );

        right = new PriorityQueue<>();
    }

    public void addNum(int num) {

        
        if (left.isEmpty() || num <= left.peek()) {
            left.offer(num);
        } else {
            right.offer(num);
        }

        // Balancing the heaps

        if (left.size() > right.size() + 1) {
            right.offer(left.poll());
        }

        if (right.size() > left.size() + 1) {
            left.offer(right.poll());
        }
    }

    public double findMedian() {

        
        if (left.size() == right.size()) {
            return (left.peek() + right.peek()) / 2.0;
        }

        // Left has one extra
        if (left.size() > right.size()) {
            return left.peek();
        }

        // Right has one extra
        return right.peek();
    }
}