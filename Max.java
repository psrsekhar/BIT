import java.util.Scanner ;
public class Max
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int position=sc.nextInt();
		int count=0;
		sc.close();
		for(int i=1;i<=range;i++){
			if(i%2==0){
			count++;
			}
			if(count==position){
				System.out.print(i);
				break;
			}			
		}	
	}
}
