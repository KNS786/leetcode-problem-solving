

function countUniqueValues(arr){
    let res = arr;
    let i = 0;
    for(let j = 1;j<arr.length;j++){
        if(arr[i] != arr[j]){
            i++;
            res[i] = res[j];
        }

    }
    console.log("res ::", res);
    console.log(i+1);
}

countUniqueValues([1,1,1,2]);
countUniqueValues([1,1,2,2,2,2,3]);