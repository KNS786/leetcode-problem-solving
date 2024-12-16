//[1,2,3,4,5]

function binarySearch(arr, target){
    let left = 0, right = arr.length -1;
    let mid;
    while(left < right){
        mid = Math.floor((left + right)/2);
        console.log("left :::", { left, right , mid })
        if(arr[mid] === target){
            return mid;
        }
        else if(arr[mid] < target ){
             left = mid + 1;
        }else{
            right = mid - 1;
        }
    }
    return -1;
}

const result = binarySearch([1,2,3,4,5], 3);
console.log(result);