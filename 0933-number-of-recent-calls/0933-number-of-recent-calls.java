class RecentCounter {
    Queue<Integer> que;

    public RecentCounter() {
        que=new LinkedList<>();

        
    }
    
    public int ping(int t) {

        que.add(t); // add t to queue

        while(que.peek()<t-3000){
            que.poll(); // remove fist element if it exlude form 3000
        }

        return que.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */