package java_interview;

import java.util.HashMap;	

public class HashMapInternalWorking {

	public static void main(String[] args) {

		//map is a collections of key, value pairs.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Adapa", 28);
		
		
		System.out.println(map.get("Adapa"));
		
		/*
		 Map internal working:
		 
		 1.At first it will create the 16 buckets where index starts from 0 and ends with 15.
		   After 12 buckets will increase it's buckets size if the buckets are filled.
		 
		 2.Array of node is called the bucket. Each node has the data structure like LinkedList.
		   More than one node can share the same bucket. it may be different in capacity.
		 
		 3.Node will contain (hash,key,value,next node)
		 
		 4.When we execute the put method at first it will calculate the hash with the help of 
		   HashCode(K) method, It will take the key parameter
		   
		 5.Then it will calculate the index with hash&(n-1)
		 
		 6.With the help of that index value it will store the value in that bucket
		 
		 7.Now node will store the "hash value", "key", "value", "null/ next node reference if presents"
		 
		 8.If we get the two same hash values is called the HashCollision
		   In this case it will use the "equals()" method at first it will check weather the key is 
		   equal or not. 
		   
		   If it's equal it will update the value 
		   If it's not equal it will create the new node and present node will contain it's address 
		   in the next.
		   
		 9. If the key is null it will store in the zero'th position and it's also called the first bucket.
		 
		 10.Nodes which are present inside the bucket uses the linked list structure to store the nodes
		    If there are more than 8 nodes it will use the balanced tree structure to store the nodes.
		    
		    It will helps to improve the performance the get operations.
		 */
	}

}
