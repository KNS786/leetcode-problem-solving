
const obj = {
    stuff: "foo",
    data: {
        val: {
            thing: {
                info: "bar",
                moreInfo: {
                    evenMoreInfo: {
                        weMadeIt: "baz"
                    }
                },
              
            }
        }
    }
}
// collectStrings(obj) // ["foo", "bar", "baz"])

function collectStrings(obj, result){

    for(let key in obj){
        if(typeof obj[key] === 'string'){
            result.push(obj[key])
        }else if(typeof obj[key] === 'object'){
            result = result.concat(collectStrings(obj[key], result))
        }
    }

    return result;
}

console.log(collectStrings(obj, []))