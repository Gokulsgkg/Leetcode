class Solution {
    static void reverseString(char[] arr,int i , int j){
        while(i < j){
            char ch = arr[i];
            arr[i] = arr[j];
            arr[j] = ch;
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        reverseString(arr,0,n-1);
        int start = 0 , end = 0;
        int i= 0 , j = 0;
        while(j < n){
            while(j < n && arr[j] == ' ')j++;
            if (j >= n) break;
            start = i;
            while(j < n && arr[j] != ' '){
                arr[i++] = arr[j++];
            }
            end = i-1;
            reverseString(arr,start,end);
            if(i < n)arr[i++] = ' ';
        }
        if (i > 0 && arr[i - 1] == ' ') i--;
        return new String(arr).substring(0, i);
    }
}
