package queueArrayList;

import stack.BoundException;

public class QueueArrayList<Datatype>implements Queue<Datatype> {
	Integer buffer;
	Integer top;
	Object arr[];
	QueueArrayList()
	{
		buffer=3;
		top=-1;
		arr= new Object[buffer];	
	}
	public void checkIndex() {
		Object arr2[]=new Object[buffer*2];
		for(int i=0;i<=top;i++) {
			arr2[i]=arr[i];
		}
		arr=arr2;
		buffer=buffer*2;
		}
	public void Push(Datatype value) {
		if (top==buffer-1) {
			checkIndex();
		}
		arr[++top]=value;	
	} 
	public int peek() {
		if(top==-1) {
			BoundException obj=new BoundException();
			obj.PrintError();	
			return -1;
		}
		else
			return (int)arr[top];
				}
	public void  pop() {
		if(top==-1) {
			BoundException obj=new BoundException();
			obj.PrintError();
			}else {
					int b=(int) arr[0];
			for(int j=0;j<=top-1;j++) {
				arr[j]=arr[j+1];							 
			}
			top--;
		   System.out.println("Deleted element is "+" "+b);
		}

			 
	}

	public void traverse() {
		for(int b=0;b<=top;b++) {
			System.out.println(arr[b]);
		}
		
	}

}
