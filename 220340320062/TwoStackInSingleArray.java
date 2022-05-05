
class TwoStackInSingleArray{
	int top1, top2;
	int size = 6;
	int arr[] = new int[size];
	
	
	TwoStackInSingleArray(){
		top1 = size/2+1;
		top2 = size/2;
	}
	
	public void push1(int key){
		if(top1 > 0){
			top1--;
			arr[top1] = key;
		}else{
			System.out.println("Stack Overflow..!");
			return;
		}
	}
	
	public void push2(int key){
		if(top2 < size - 1){
			top2++;
			arr[top2] = key;
		}else{
			System.out.println("Stack Overflow..!");
			return;
		}
	}
	
	public int pop1(){
		if(top1 <= size/2){
			int key = arr[top1];
			top1++;
			return key;
		}else{
			System.out.println("Stack Underflow..!");
			System.exit(1);
		}
		return 0;
	}
	
	public int pop2(){
		if(top2 >= size/2 + 1){
			int key = arr[top2];
			top2--;
			return key;
		}else{
			System.out.println("Stack Underflow...!");
			System.exit(1);
		}
		return 1;
	}
	
	public static void main(String args[]){
		TwoStackInSingleArray s = new TwoStackInSingleArray();
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		s.push2(40);
		
		System.out.println("Popped element from stack is "+s.pop1());
		System.out.println("Popped element from stack is "+s.pop2());
		
		
	}
}