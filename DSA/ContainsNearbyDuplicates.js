//[1,2,3,4,5], k = 5


function containsNearbyDuplicates( arr, k){

    const set = new Set();

    for(let i = 0; i< arr.length;i++){
        
        if(i > k){
            set.delete(arr[i - k - 1]);
        }

        if(set.has(arr[i])){
            return true
        }else{
            set.add(arr[i]);
        }
    }
    return false;
}


function fib(n){
    console.log(n);
    if(n < 1){
        return 1;
    }
    return fib(n-1) + fib(n-2);
}

fib(4);

console.log(containsNearbyDuplicates([1,2,3, 1], 3));
console.log(containsNearbyDuplicates([1,0,1,1], 1));
console.log(containsNearbyDuplicates([1,2,3,1,2,3], 2));
console.log(containsNearbyDuplicates([3,3], 2));

