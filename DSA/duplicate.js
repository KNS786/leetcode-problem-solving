
function removeDuplicateSortedArr(arr){

    if(arr.length < 2){
        return arr;
    }
    let i = 0, j = 1;

    for(let j = 1; j<arr.length;j++){
       if(arr[j] !== arr[i] && i < arr.length - 1){
          arr[i + 1] = arr[j];
          i++;
       }
    }

    console.log(arr.slice(0, i + 1));
}

removeDuplicateSortedArr([1,1,1,1,1]);
