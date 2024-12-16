// Input: My Name is Navani Nayak
// output: M=2, y=2, N=4, a=4, e=1, i=2, s = 1, v=1, k=1

function CountLetterFreq(str){

    let lookup = {};

    for(let i = 0; i < str.length; i++){
        
        let char = str[i];
        if(!lookup[char]){
            if(lookup[char.toUpperCase()]){
                lookup[char.toUpperCase()] +=1;
            }
            else{
                lookup[char] = 1;
            }
            
        }
        else if(lookup[char]){
            lookup[char] = lookup[char] + 1;
        }

    }

    console.log(lookup);
}

CountLetterFreq("My Name is Navani Nayak");