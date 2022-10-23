package hii;

public class Least_pos_num {

	public static void main(String[] args) {
		int []nums=new int[] {1};
		int m=nums.length;
        int t=0;
        int sum_arr=0;
        int sum=(m*(m+1))/2;
        System.out.println(sum);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            if(nums[i]<min){
                min=nums[i];
                System.out.println(min);
            }
        }
        System.out.println(min);
//         if(min!=1){
//             t=1;
//             return t;
//         }
        
        for(int x=0;x<m;x++){
            sum_arr+=nums[x];
            
        }
        System.out.println(sum_arr);
        if((sum_arr==sum) && (min==1)){
            t=m+1;
            System.out.println(t);
           // return t;
            //break;
        }
        
        else{
            
        
        for(int i=1;i<=m;i++){
            int count =0;
            boolean b=true;
            for(int j=0;j<m;j++){
                if(nums[j]==i){
                    
                    continue;
                }
                else{
                    count++;
                }
            }
            if(count==m){
                t=i;
                break;
                
            }
        }
        }
        
       System.out.println(t);

	}

}
