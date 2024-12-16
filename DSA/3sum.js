function ThreeSum(arr){
    let result = [];
    arr = arr.sort((a,b) => a - b );
    for(let i=0;i<arr.length;i++){
        let j = i + 1;
        let k = arr.length - 1;

        if(i > 0 && arr[i] === arr[i-1] ){
            continue;
        }
        
        if(j === arr.length){
            break;
        }

       while( j < k){
        let total = arr[i] + arr[j] + arr[k] 
        if( total === 0){
            result.push([ arr[i], arr[j], arr[k]]);
            j++;

            while(arr[j] === arr[j - 1] && j < k){
                j+=1;
            }
        }
        else if(total < 0){
            j++;
        }
        else k--;
       }
    }

    console.log(result);
}

ThreeSum([-1,0,1,2,-1,-4])
ThreeSum([-2,2,0,-1,-1,1]); // [[-2,2,0],[2,-1,-1], [0,-1,1]]