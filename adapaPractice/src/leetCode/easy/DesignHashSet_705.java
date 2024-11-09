package leetCode.easy;

import java.util.LinkedList;

class MyHashSet {

	private final int BUCKET_SIZE = 1000;
	private LinkedList<Integer>[] buckets;
	
    @SuppressWarnings("unchecked")
	public MyHashSet() {
        buckets = new LinkedList[BUCKET_SIZE];
        
        for(int i=0;i<BUCKET_SIZE;i++) {
        	buckets[i] = new LinkedList<>();
        }
    }
    
    public int hash(int key) {
    	return key % BUCKET_SIZE;
    }
    
    public void add(int key) {
        int bucketIndex = hash(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];
        
        if(!bucket.contains(key)) {
        	bucket.add(key);
        }
    }
    
    public void remove(int key) {
        int bucketIndex = hash(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];
        bucket.remove((Integer) key);
    }
    
    public boolean contains(int key) {
        int bucketIndex = hash(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];
        return bucket.contains(key);
    }
    
    public void iterateValues() {
    	for(LinkedList<Integer> bucket : buckets) {
    		for(Integer value : bucket) {
    			System.out.print(value +" ");
    		}
    	}
    }
}

public class DesignHashSet_705 {

	public static void main(String[] args) {

		MyHashSet myHashSet = new MyHashSet();
		myHashSet.add(1);
		myHashSet.add(2);
		myHashSet.add(2);
		
		myHashSet.contains(1);
		
		myHashSet.iterateValues();
		
		System.out.println(myHashSet.contains(1));
		
	}

}
