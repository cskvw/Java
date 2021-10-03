package wekky1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		 int firstNum=0,secNum=1,num,i,count=8;  
		 System.out.print(firstNum+" "+secNum);  
		  
		 for(i=2;i<count;++i)
		 {  
		  num=firstNum+secNum;  
		  System.out.print(" "+num);  
		  firstNum=secNum;  
		  secNum=num; 
		 }  

		}

	}


