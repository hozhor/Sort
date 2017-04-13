/*
 * 选择排序基本思路：
 * 把第一个元素依次和后面的所有元素进行比较。
 * 第一次结束后，就会有最小值出现在最前面。
 * 依次类推
 */
 public class SelectionSort{
 public static void main(String[] args){
 int []a={12,43,1,87,45,23,45,65,23};
 int t;
 
 System.out.println("排序前:");
		for(int i=0;i<a.length;i++){
		System.out.println(a[i]);	
}
	System.out.println("开始排序:");
 for(int i=0;i<a.length-1;i++){
 System.out.println("\n 第"+(i+1)+"次:");
 	for(int j=i+1;j<a.length;j++){
 		if(a[j]<a[i]){
 		t=a[i];
 		a[i]=a[j];
 		a[j]=t;
 		}
 	
 	}
 
 		for(int k=0;k<a.length;k++)
		if(k==i){
			System.out.print("\033[0;32m[\033[0m"+a[k]+"\033[0;32m]\033[0m"+"   ");//"\033[0;32m[\033[0m"这是设颜色的
		}else if(k<i){
			System.out.print("\033[0;31m[\033[0m"+a[k]+"\033[0;31m]\033[0m"+"   ");//已排序好的元素
	}else{
			System.out.print("["+a[k]+"]   ");//还没排序的元素
			
	}
	}
			System.out.println("\n排序完毕!");
	}
	


}


