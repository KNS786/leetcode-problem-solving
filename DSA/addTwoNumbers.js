// 1 -> 2 -> 3 
// 4 -> 6 -> 7
class Node{
    constructor(val){
        this.value = val;
        this.next = null;
    }
}

function LinkedList(l1, l2){
    
    let result = [];

    let i = 0, j = 0;
    let lastDigit;
    while( i< l1.length && j < l2.length){
        let sum = 0;
        if(l1.value){
            sum+= l1.value;
        }

        if(l2.value){
            sum+= l2.value;
        }

        //get is smallest number
        if(sum % 10 != sum ){
            lastDigit = sum % 10;
        }

        i++;
        j++;

    }
    
}