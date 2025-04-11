public class srtArry{
public static void main(String[] args){
int[] nums = {4,2,9,1,5};
        doSort(nums);
        for(int i=0; i<nums.length; i++)
        System.out.println(nums[i]);
}
public static void doSort(int[] arr){
int a=0;
while(a<arr.length-1){
for(int b=0; b<arr.length-1; b++){
if(arr[b]>arr[b+1]){
int temp = arr[b];
arr[b]=arr[b+1];
arr[b+1]=temp;
}
}
a++;
}
}
}
