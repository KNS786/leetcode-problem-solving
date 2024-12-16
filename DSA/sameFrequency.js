function isSame(arr1, arr2){

    if(arr1.length != arr2.length ){
        return false;
    }

    let collections = {};
    for(let val of arr1){
        collections[ val ** 2] = 1;
    }

    console.log(collections)

    for(let val of arr2){
        if(!collections[val]){
           return false;
        }
    }
    return true;
}

console.log(isSame([1,2,3], [1, 4, 9]));
console.log(isSame([1,2,3], [1,2]));