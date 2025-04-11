public class srtArry{
public static void main(String[] args){
int[] nums = {4,2,9,1,5};
        doSort(nums);
        for(int i=0; i<nums.length; i++)
        System.out.println(nums[i]);
}
public static void doSort(int[] arr){
int i=0;
while(i<arr.length-1){
for(int j=0; j<arr.length-1; j++){
if(arr[j]>arr[j+1]){
int temp = arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
i++;
}
}
}
