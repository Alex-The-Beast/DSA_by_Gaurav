import java.util.ArrayList;

public class IndicesInArrayListLinearSearch {

    static ArrayList <Integer> allIndices(int[] arr,int target ,int idx,int n){
        ArrayList <Integer> ans=new ArrayList<>();
        //base case
        if(idx>=n) return ans;
        //self work
        if(arr[idx]==target){
            ans.add(idx);
        }
        //recursive work
        ArrayList <Integer> indices=allIndices(arr,target, idx+1, n);
        ans.addAll(indices);
        return ans;

    }
    public static void main(String[] args) {
        int[] arr={4,4,5,1,4,6,8,4,2};
        int target=4;
        ArrayList <Integer> result= allIndices(arr,target,0,arr.length);
        //for each loop
        for(Integer i:result){
            System.out.println(i);
        }
    }
}
