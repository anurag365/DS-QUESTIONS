class searchMin{
public static void main(String[] args){
int arr[]={12,10,2,45,1,0,65,27};
int min=arr[0];
for(int i=1;i<arr.length;i++){
if(min>arr[i]){

min=arr[i];



}




}
System.out.println("MINIMUM ELEMENT IS "+min);

}
 }