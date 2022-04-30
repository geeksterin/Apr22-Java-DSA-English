// Insertion Sort
class Solution
{
  
  public void insertionSort(int arr[], int n)
  {
      for(int i=1; i<n; i++){
          int j = i;
          while(j > 0){
              if(arr[j] < arr[j - 1]){
                  int temp = arr[j];
                  arr[j] = arr[j - 1];
                  arr[j - 1] = temp;
              }
              else break;
              j--;
          }
      }
  }
}




// Selection Sort
class Solution
{
	void selectionSort(int arr[], int n)
	{
	    for(int i=0; i<n-1; i++){
	        int smallest = i;
	        
	        // Searching for the ith Smallest
	        for(int j=i+1; j<n; j++){
	            if(arr[j] < arr[smallest]){
	                smallest = j;
	            }
	        }
	        
	        // Swapping -> Placing ith Smallest to the ith Index 
	        int temp = arr[smallest];
	        arr[smallest] = arr[i];
	        arr[i] = temp;
	    }
	}
}



// Bubble Sort
class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
