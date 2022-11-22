const calculator = require('../calculator')

let calc;

describe('Calculator tests - Happy way', () => {
    beforeEach(() => {
        calc = new calculator();
    });

    test('sum 1 + 2', () => {
        expect(calc.sum(1,2)).toBe(3);
    })

    test('diff 3 - 1', () => {
        expect(calc.diff(3,1)).toBe(2);
    })

    test('mult 4 * 5', () => {
        expect(calc.mult(4,5)).toBe(20);
    })

    test('div 4 * 5', () => {
        expect(calc.div(12,4)).toBe(3);
    })

})

describe('Calculator tests - Sadness way', () => {
   
    test('div 6 / 0', () => {
        expect(calc.div(6,0)).toBe("invalid operation");
    })

})