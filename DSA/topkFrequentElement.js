
function topKFrequenctElement(arr, k ){
    let freq = {};

    for(let val of arr){
        freq[val] = (freq[val] + 1) || 1;
    }

    const freqArr = Object.entries(freq).sort((a, b) => b[1] - a[1]).slice(0, k)
    let result  = [];
    
    for(let [value, freqCnt] of freqArr){
        result.push(Number(value));
    }
    
    return result;
}

console.log(topKFrequenctElement([1,1,1,2,2,3], 2))
console.log(topKFrequenctElement([1], 2));