function isSubsequance(str1, str2){
    if(!str1) return false;

    let i=0, j = 0;
    while(j < str2.length){
        if(str1[i] === str2[j]){
            i++;
        }
        if(i === str1.length){
            return true;
        }
        j++;
    }
    return false;
}