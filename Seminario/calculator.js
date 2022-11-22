class calculator{
    sum(a, b) {
        return a + b;
    }

    diff(a, b) {
        return a - b;
    }
    
    mult(a, b) {
        return a * b;
    }
    
    div(a, b) {
        if(b != 0){
            return a / b;
        } 
        else{
            return "invalid operation";
        }

    }
}

module.exports = calculator;