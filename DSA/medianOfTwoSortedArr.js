/**
   num1 = [1,3], nums2=[2]
   o/p: 2.0000
 */
function medianOfTwoSortedArr(arr1, arr2){
   let newArr = [...arr1, ...arr2].sort((a,b) => a-b);
   
   let mid = Math.floor(newArr.length / 2);

   let sum = 0 ;
   if(mid == 1){
    return newArr[mid].toFixed(5);
   }

   let cnt = 0;
   let right = mid - 1;
   while(cnt != mid ){
      sum += newArr[right];
      right++;
      cnt++;
   }

   return (sum / mid).toFixed(5)
}

console.log(medianOfTwoSortedArr([1,3], [2]))
console.log(medianOfTwoSortedArr([1,2], [3,4]))