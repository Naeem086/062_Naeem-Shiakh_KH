import java.util.*;

class InsertionSorting{
	static Scanner s = new Scanner(System.in);
	
	public static void insertionSort(int al[]){
		int n = al.length;
		for(int i=n-2;i>=0;i--){
			if(al[i] > al[n-1]){
				al[i+1] = al[i];
				showList(al);
			}else{
				al[i+1] = al[n-1];
				showList(al);
				break;
			}
			if((i == 0) && al[i] > al[n-1]){
				al[i] = al[n-1];
				showList(al);
			}
		}
	}
	
	public static void showList(int al[]){
		int n = al.length;
		for(int i=0;i<n;i++){
			System.out.print(al[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String agrs[]){
		System.out.print("Enter size of Array : ");
		int n = s.nextInt();
		int al[] = new int[n];
		System.out.println("Insert Elements : ");
		for(int i=0;i<n;i++){
			System.out.print((i+1)+" Element : ");
			al[i] = s.nextInt();
		}
		
		insertionSort(al);
	}

}