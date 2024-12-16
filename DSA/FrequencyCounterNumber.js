
function sameFrequency(str1, str2){
    if(str1.length != str2.length){
        return false;
    }

    let collect = {}

    for(let char of str1){
       collect[char] = (collect[char]++) || 1;
    }

    console.log("collect before :::", collect)


    for(let char of str2){
        if(!collect[char]){
            return false;
        } 
        collect[char]-=1;
    }

    console.log("collect after :::", collect)

    for(let [key, value] of Object.entries(collect)){
        if(value !=0){
            return false;
        }
    }

    return true;


}

const r1 = sameFrequency("123", "213");
const r2 = sameFrequency("1234", "4311");
const r3 = sameFrequency("567", "890");

console.log("values:::", {
    r1,
    r2,
    r3
});
